package Repository;
import Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RoteiroCenaExtraFemininoEN extends RoteiroRepository {

    public static final int ID_CAPITULO_EXTRA = 11;

    private Protagonista prota;

    public RoteiroCenaExtraFemininoEN(Protagonista prota) {
        this.prota = prota;
        carregarCenaExtra();
    }

    // ================= CENA EXTRA: todas apertam o botão =================
    private void carregarCenaExtra() {
        List<Cena> cenasExtra = new ArrayList<>();
        List<Fala> falas = new ArrayList<>();

        falas.add(new Fala(1, "Hello, viewers! The show Table for Two has finally reached its grand finale! That's right, tonight our contestants will choose whether or not to embark on this romance.", "Host", null, true, 2));
        falas.add(new Fala(2, "To do so, they will choose between pressing the quit button or getting involved with our protagonist " + prota.getNome() + ".", "Host", null, true, 3));
        falas.add(new Fala(3, "Tell me, how are your expectations for this big moment?", "Host", null, true, 4));

        List<Opcoes> opcoesExpectativa = List.of(
                new Opcoes(1, "“I'm excited. I believe I made a good impression.”", "Excited", Map.of(), 1, 0, false),
                new Opcoes(2, "“I'm apprehensive, I feel I could have done better in the show.”", "Apprehensive", Map.of(), 1, 0, false)
        );
        // Sem impacto nem pior opção: as duas respostas levam para a mesma fala
        falas.add(new Dialogo(4, "Choose your expectation:", "System", null, false, opcoesExpectativa, 0));

        falas.add(new Fala(5, "Okay, let's see now what the girls think about it.\n\nAfter the countdown, press the button or don't. 1, 2, 3 and….. go!", "Host", null, true, 6));
        falas.add(new Fala(6, "[Sound effects: the sound of buttons being pressed at the same time]\n\n*They all press the button*", "Narrator", null, true, 7));
        falas.add(new Fala(7, "Whoa! What is this? They all pressed the button! We'll need more chapters in this reality show to fit so much story!", "Narrator", null, true, 8));
        falas.add(new Fala(8, "[The narrator looks to the side of the studio, confused]", "Narrator", null, true, 9));
        falas.add(new Fala(9, "Wait a second… Who is this person who just walked onto the set?", "Host", null, true, 10));
        falas.add(new Fala(10, "Professor Bianca: Camili, I already told you this game shouldn't run too long if it's going to fit the delivery deadline!", "Professor Bianca", null, true, 11));
        falas.add(new Fala(11, "Camili: The professor is absolutely right. We'd better end the game right here.", "Camili", null, true, 12));
        falas.add(new Fala(12, "Alright, message received and understood! Ending the game now.\n\nThank you for following along, and see you next time!", "Host", null, true, -1));

        Cena cenaExtra = new Cena(1, "cena_extra", "trilha_surpresa.mp3", falas);
        cenaExtra.setIdPrimeiraFala(1);
        cenaExtra.setIdUltimaaFala(12);
        cenasExtra.add(cenaExtra);

        Capitulo capituloExtra = new Capitulo(ID_CAPITULO_EXTRA, "Extra Scene", 1, 1, cenasExtra);
        bancoDeCapitulos.put(ID_CAPITULO_EXTRA, capituloExtra);
    }
}