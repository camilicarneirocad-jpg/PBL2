package Service;

import Exececoes.ArquivoNaoEncontrado;
import Exececoes.SlotOcupadoException;
import Model.Capitulo;
import Model.Final;
import Model.Inventario;
import Model.Item;
import Model.Jogo;
import Model.Protagonista;
import Model.Save;
import Model.Secundario;
import Repository.SaveRepository;
import View.JogoView;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceSave {
    private static final int TOTAL_DE_SLOTS = 3;

    private final JogoView view;
    private final Jogo jogo;
    private final SaveRepository repository;
    private JogoService jogoService;

    public ServiceSave(JogoView view, Jogo jogo, SaveRepository repository,JogoService jogoService) {
        this.view = view;
        this.jogo = jogo;
        this.repository = repository;
        this.jogoService = jogoService;
    }

    public void salvar(int idCapitulo, int idCena) {
        view.exibirTexto("\nVocê deseja salvar a partida?");
        view.exibirTexto("1 - Sim");
        view.exibirTexto("2 - Não");

        if (lerOpcao(1, 2) == 2) {
            return;
        }

        int slot = escolherSlot();
        Save save = criarSave(idCapitulo, idCena);

        try {
            repository.gravar(slot, save, false);
            view.exibirTexto("Jogo salvo com sucesso no Slot " + slot + "!");

        } catch (SlotOcupadoException e) {
            view.exibirTexto(e.getMessage());
            view.exibirTexto("Deseja substituir o save existente?");
            view.exibirTexto("1 - Sim");
            view.exibirTexto("2 - Não");

            if (lerOpcao(1, 2) == 1) {
                try {
                    repository.gravar(slot, save, true);
                    view.exibirTexto("Slot " + slot + " sobrescrito com sucesso!");
                } catch (SlotOcupadoException | IOException ex) {
                    view.exibirTexto("Erro ao gravar o arquivo: " + ex.getMessage());
                }
            } else {
                view.exibirTexto("Operação cancelada. O save anterior foi mantido.");
                salvar(idCapitulo,idCena);
            }

        } catch (IOException e) {
            view.exibirTexto("Erro ao gravar o arquivo: " + e.getMessage());
        }
    }

    public void salvarFinais() {
        try {
            repository.gravarFinais(jogo.getFinais());
        } catch (IOException e) {
            view.exibirTexto("Erro ao gravar os finais obtidos: " + e.getMessage());
        }
    }

    public void carregarFinais() {
        try {
            for (Final f : repository.lerFinais()) {
                jogo.adicionarFinal(f.getResumo(), f.getIdFinal());
            }
        } catch (IOException e) {
            view.exibirTexto("Erro ao ler os finais obtidos: " + e.getMessage());
        }
    }

    public void autosalvar(int idCapitulo, int idCena) {
        if (jogo.getProta() == null) {
            return;
        }
        try {
            repository.gravarAutomatico(criarSave(idCapitulo, idCena));
        } catch (IOException e) {
            view.exibirTexto("Erro ao gravar o save automático: " + e.getMessage());
        }
    }

    public Save carregarAutomatico() {
        try {
            Save save = repository.lerAutomatico();
            aplicarSave(save);
            view.exibirTexto("Save automático carregado com sucesso! (" + save.getResumo() + " - " + save.getMomento() + ")");
            return save;

        } catch (ArquivoNaoEncontrado e) {
            view.exibirTexto(e.getMessage());
        } catch (IOException e) {
            view.exibirTexto("Erro ao ler o save automático: " + e.getMessage());
        }
        return null;
    }

    private Save criarSave(int idCapitulo, int idCena) {
        Save save = new Save();

        save.setMomento(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        save.setIdCapitulo(idCapitulo);
        save.setIdCena(idCena);

        Protagonista prota = jogo.getProta();
        save.setNomeJogador(prota.getNome());
        save.setGenero(prota.getGenero());
        save.setAntipatia(prota.getAntipatia());
        save.setIdRoupa(prota.getIdRoupa());
        save.setResumo(prota.getNome() + " - " + descreverCapitulo(idCapitulo));

        Map<Integer, Integer> afinidades = new HashMap<>();
        if (jogo.getSecundarios() != null) {
            for (Secundario s : jogo.getSecundarios()) {
                afinidades.put(s.getId(), s.getAfinidade());
            }
        }
        save.setAfinidades(afinidades);

        List<Item> itens = new ArrayList<>();
        if (jogo.getInventario() != null && jogo.getInventario().getItens() != null) {
            for (Item item : jogo.getInventario().getItens()) {
                itens.add(new Item(item.getNome(), item.getImagem()));
            }
        }
        save.setItens(itens);

        return save;
    }

    private String descreverCapitulo(int idCapitulo) {
        if (idCapitulo > JogoService.ULTIMO_CAPITULO) {
            return "História concluída";
        }
        if (jogo.getCapitulos() != null) {
            for (Capitulo c : jogo.getCapitulos()) {
                if (c.getIdCapitulo() == idCapitulo) {
                    return "Cap. " + idCapitulo + ": " + c.getTitulo();
                }
            }
        }
        return "Cap. " + idCapitulo;
    }

    public Save carregar() {
        int slot = escolherSlot();

        try {
            Save save = repository.ler(slot);
            aplicarSave(save);
            view.exibirTexto("Jogo carregado com sucesso do Slot " + slot + "!");
            return save;

        } catch (ArquivoNaoEncontrado e) {
            view.exibirTexto(e.getMessage());
        } catch (IOException e) {
            view.exibirTexto("Erro ao ler o arquivo de save: " + e.getMessage());
        }
        return null;
    }

    private void aplicarSave(Save save) {
        jogo.setNome(JogoService.NOME_JOGO);

        Inventario inventario = new Inventario();
        inventario.setItens(new ArrayList<>());
        if (save.getItens() != null) {
            for (Item item : save.getItens()) {
                inventario.adicionarItem(new Item(item.getNome(), item.getImagem()));
            }
        }
        jogo.setInventario(inventario);

        Protagonista prota = new Protagonista(save.getNomeJogador(), 0, save.getGenero(),
                save.getAntipatia(), save.getIdRoupa());
        jogo.setProta(prota);

        List<Secundario> secundarios = JogoService.criarSecundarios();
        if (save.getAfinidades() != null) {
            for (Secundario s : secundarios) {
                Integer afinidade = save.getAfinidades().get(s.getId());
                if (afinidade != null) {
                    s.setAfinidade(afinidade);
                }
            }
        }
        jogo.setSecundarios(secundarios);

        jogo.setCapitulos(jogoService.montarCapitulos(prota, save.getIdCapitulo()));
    }

    public void excluir() {
        int slot = escolherSlot();

        if (!repository.existe(slot)) {
            view.exibirTexto("O slot " + slot + " já está vazio! Não há o que excluir.");
            return;
        }

        view.exibirTexto("Tem certeza que deseja excluir o save do Slot " + slot + "?");
        view.exibirTexto("1 - Sim");
        view.exibirTexto("2 - Não");

        if (lerOpcao(1, 2) == 1) {
            if (repository.excluir(slot)) {
                view.exibirTexto("Save do Slot " + slot + " excluído com sucesso!");
            } else {
                view.exibirTexto("Não foi possível excluir o arquivo do slot.");
            }
        } else {
            view.exibirTexto("Exclusão cancelada.");
        }
    }

    public int escolherSlot() {
        view.exibirTexto("\nEscolha um slot:");
        for (int i = 1; i <= TOTAL_DE_SLOTS; i++) {
            view.exibirTexto(i + " - " + descreverSlot(i));
        }
        return lerOpcao(1, TOTAL_DE_SLOTS);
    }

    private String descreverSlot(int slot) {
        if (!repository.existe(slot)) {
            return "Slot " + slot + " (vazio)";
        }
        try {
            Save s = repository.ler(slot);
            return "Slot " + slot + " - " + s.getResumo() + " (" + s.getMomento() + ")";
        } catch (ArquivoNaoEncontrado | IOException e) {
            return "Slot " + slot + " (save ilegível)";
        }
    }

    private int lerOpcao(int min, int max) {
        int op;
        do {
            op = view.receberOpcaoNumerica();
            if (op < min || op > max) {
                view.exibirTexto("Valor inválido! Digite novamente");
            }
        } while (op < min || op > max);
        return op;
    }
}
