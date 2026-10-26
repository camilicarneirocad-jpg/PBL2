package Service;
import Model.*;
import Repository.*;
import View.JogoView;
import Model.Inventario;

import java.util.ArrayList;
import java.util.List;

public class JogoService {

    public static final String NOME_JOGO = "Reserva para Dois";
    public static final int ULTIMO_CAPITULO = 10;
    public static final int TOTAL_FINAIS = 6;

    private Jogo jogo;
    private JogoView view;
    private Configuracoes config;

    public JogoService(Jogo jogo, JogoView view, Configuracoes config) {
        this.jogo = jogo;
        this.view = view;
        this.config = config;
    }

    public Protagonista iniciarPersonagem() {
        String nome = view.receberNome();
        int genero = view.escolherOpcao();
        int idRoupa = view.escolherRoupa();

        return new Protagonista(nome, 0, genero, 0, idRoupa);
    }

    public static List<Secundario> criarSecundarios() {
        List<Secundario> secundarios = new ArrayList<>();
        secundarios.add(new Secundario("Ângela", 1, 30, 6));
        secundarios.add(new Secundario("Mônica", 2, 30, 10));
        secundarios.add(new Secundario("Márcia", 3, 30, 8));
        secundarios.add(new Secundario("Gabriela", 4, 30, 4));
        return secundarios;
    }

    public List<Capitulo> montarCapitulos(Protagonista prota, int capituloInicial) {
        boolean ingles = config.getIdIdioma() == 1;

        RoteiroRepository roteiro;

        if (prota.getGenero() == 1) {
            roteiro = ingles ? new RoteiroFemininoRepositoryEN(prota) : new RoteiroFemininoRepository(prota);
        } else {
            roteiro = ingles ? new RoteiroMasculinoRepositoryEN(prota) : new RoteiroMasculinoRepository(prota);
        }

        List<Capitulo> capitulos = new ArrayList<>();
        for (int i = Math.max(1, capituloInicial); i <= ULTIMO_CAPITULO; i++) {
            Capitulo cap = roteiro.buscarCapitulo(i);
            if (cap != null) {
                capitulos.add(cap);
            }
        }
        return capitulos;
    }

    public void iniciarNovoJogo() {
        jogo.setNome(NOME_JOGO);
        jogo.setInventario(new Inventario());
        jogo.getInventario().setItens(new ArrayList<>());

        Protagonista prota = iniciarPersonagem();
        jogo.setProta(prota);

        jogo.setSecundarios(criarSecundarios());
        jogo.setCapitulos(montarCapitulos(prota, 1));
    }

    public void exibirInstrucoes() {
        view.exibirTexto("\n--- Instruções ---\nFaça suas escolhas com sabedoria.\n");
    }

    public void exibirCreditos() {
        view.exibirTexto("\n--- Créditos ---\nDesenvolvido por:\n Camili Carneiro\n Yarlley Fernandes \n Ano: 2026\n");
    }

    public void exibirFinais() {
        List<Final> finais = jogo.getFinais();

        if (finais.isEmpty()) {
            view.exibirTexto("\nVocê ainda não desbloqueou nenhum final.");
            return;
        }

        view.exibirTexto("\nFinais desbloqueados:");
        for (Final f : finais) {
            view.exibirTexto(f.getIdFinal() + " - " + f.getResumo());
        }
    }

    public Capitulo obterCenaExtra() {
        boolean ingles = config.getIdIdioma() == 1;

        if (!cenaExtraDesbloqueada(ingles)) return null;

        Protagonista prota = jogo.getProta();
        if (prota == null) {
            view.exibirTexto(ingles
                    ? "Start or load a game first to watch the extra scene."
                    : "Inicie ou carregue um jogo antes de acessar a cena extra.");
            return null;
        }

        RoteiroRepository roteiro;
        if (prota.getGenero() == 1) {
            roteiro = ingles ? new RoteiroCenaExtraFemininoEN(prota) : new RoteiroCenaExtraFeminino(prota);
        } else {
            roteiro = ingles ? new RoteiroCenaExtraMasculinoEN(prota) : new RoteiroCenaExtraMasculino(prota);
        }
        return roteiro.buscarCapitulo(RoteiroCenaExtraFeminino.ID_CAPITULO_EXTRA);
    }

    private boolean cenaExtraDesbloqueada(boolean ingles) {
        int obtidos = jogo.getFinais().size();
        boolean liberada = obtidos >= TOTAL_FINAIS;
        if (!liberada) {
            view.exibirTexto(ingles
                    ? "Scene locked! Unlock all endings (" + obtidos + "/" + TOTAL_FINAIS + ") to unlock the extra scene."
                    : "Cena Bloqueada! Desbloqueie todos os finais (" + obtidos + "/" + TOTAL_FINAIS + ") para liberar a cena extra.");
        }
        return liberada;
    }

}
