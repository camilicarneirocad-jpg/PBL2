package Repository;
import Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RoteiroCenaExtraFeminino extends RoteiroRepository {

    public static final int ID_CAPITULO_EXTRA = 11;

    private Protagonista prota;

    public RoteiroCenaExtraFeminino(Protagonista prota) {
        this.prota = prota;
        carregarCenaExtra();
    }

    // ================= CENA EXTRA: todas apertam o botão =================
    private void carregarCenaExtra() {
        List<Cena> cenasExtra = new ArrayList<>();
        List<Fala> falas = new ArrayList<>();

        falas.add(new Fala(1, "Olá, telespectadores! O programa Reserva para Dois finalmente chegou à sua grande final! Isso mesmo, hoje as nossas competidoras irão escolher se querem ou não embarcar nesse romance.", "Apresentador", null, true, 2));
        falas.add(new Fala(2, "Para isso, elas irão optar entre apertar o botão da desistência ou se envolver com o nosso protagonista " + prota.getNome() + ".", "Apresentador", null, true, 3));
        falas.add(new Fala(3, "Me diga aí, como estão suas expectativas para esse grande momento?", "Apresentador", null, true, 4));

        List<Opcoes> opcoesExpectativa = List.of(
                new Opcoes(1, "“Eu estou empolgada. Acredito que causei uma boa impressão”", "Empolgação", Map.of(), 1, 0, false),
                new Opcoes(2, "“Eu estou apreensiva, sinto que eu poderia ter tido uma melhor participação”.", "Apreensão", Map.of(), 1, 0, false)
        );
        // Sem impacto nem pior opção: as duas respostas levam para a mesma fala
        falas.add(new Dialogo(4, "Escolha sua expectativa:", "Sistema", null, false, opcoesExpectativa, 0));

        falas.add(new Fala(5, "Ok, vamos ver agora o que as garotas acham disso.\n\nApós a contagem regressiva, apertem ou não o botão. 1, 2, 3 e….. já!", "Apresentador", null, true, 6));
        falas.add(new Fala(6, "[Efeitos sonoros: som de botões sendo pressionados simultaneamente]\n\n*Todas apertam o botão*", "Narrador", null, true, 7));
        falas.add(new Fala(7, "Eita! Mas o que é isso? Todas apertaram o botão! Teremos que ter mais capítulos neste reality para dar conta de tanta história!", "Narrador", null, true, 8));
        falas.add(new Fala(8, "[O narrador olha para o lado do estúdio, confuso]", "Narrador", null, true, 9));
        falas.add(new Fala(9, "Espera aí… Quem é essa pessoa que acabou de chegar no set?", "Apresentador", null, true, 10));
        falas.add(new Fala(10, "Professora Bianca: Camili, eu já havia te dito que esse jogo não deveria se estender muito para caber no prazo de entrega!", "Professora Bianca", null, true, 11));
        falas.add(new Fala(11, "Camili: A professora tem toda a razão. É melhor a gente encerrar o jogo por aqui mesmo.", "Camili", null, true, 12));
        falas.add(new Fala(12, "Certo, recado dado e entendido! Encerrando o jogo agora.\n\nObrigado por nos acompanhar e até a próxima!", "Apresentador", null, true, -1));

        Cena cenaExtra = new Cena(1, "cena_extra", "trilha_surpresa.mp3", falas);
        cenaExtra.setIdPrimeiraFala(1);
        cenaExtra.setIdUltimaaFala(12);
        cenasExtra.add(cenaExtra);

        Capitulo capituloExtra = new Capitulo(ID_CAPITULO_EXTRA, "Cena Extra", 1, 1, cenasExtra);
        bancoDeCapitulos.put(ID_CAPITULO_EXTRA, capituloExtra);
    }
}