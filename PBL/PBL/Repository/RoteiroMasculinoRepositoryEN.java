package Repository;
import Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RoteiroMasculinoRepositoryEN extends RoteiroRepository {

    private Protagonista prota;

    public RoteiroMasculinoRepositoryEN(Protagonista prota) {
        this.prota = prota;
        carregarCapitulo1();
        carregarCapitulo2();
        carregarCapitulo3();
        carregarCapitulo4();
        carregarCapitulo5();
        carregarCapitulo6();
        carregarCapitulo7();
        carregarCapitulo8();
        carregarCapitulo9();
        carregarCapitulo10();
    }

    // ================= CAPÍTULO 1 =================
    private void carregarCapitulo1() {
        List<Cena> cenasCap1 = new ArrayList<>();

        List<Fala> falasCena1 = new ArrayList<>();
        falasCena1.add(new Fala(1, "The doors of Table for Two are open! The one place where love is the main course, but the reservation... ah, that has to be earned. On tonight's show, " + prota.getNome() + " steps into our VIP room and faces our demanding panel of single women. The goal? Use all of his charm, wit and heart to walk out of here with an invitation to the perfect date. Will he manage to enchant one of them in time?", "Host", null, true, 2));
        falasCena1.add(new Fala(2, "Here he is, our single man of the night: " + prota.getNome() + "! He's the focused guy who spends all day immersed in projects, solving problems and trying to keep life running smoothly. The problem? He forgot that love has no exact code and certainly doesn't come with an instruction manual! Tired of watching our friend order pizza every weekend and stuck in an unbreakable routine, his own friends stole his phone and signed him up for our show as a true now-or-never moment! And to our surprise... he accepted the challenge!\nLet's meet the ones who will be judging our player!", "Host", null, true, 3));
        falasCena1.add(new Fala(3, "And to open our panel today we have a woman who knows exactly what it means to fight for first place! Please welcome the incredible Ângela!", "Host", null, true, 4));
        falasCena1.add(new Fala(4, "Used to breaking limits since the age of eight, she is a pentathlon athlete who has already shone at the biggest world championships. But after reaching the peak, Ângela decided to take a strategic break from sport to focus on her greatest challenge yet: finding true love. Here's a little backstage secret for you, " + prota.getNome() + ": as tough as she is on the track, Ângela is terrified of deep water and open sea.", "Host", null, true, 5));
        falasCena1.add(new Fala(5, "Born in the countryside, our single woman is passionate about the outdoors and would trade any red carpet for a good sunset in nature. Today, she channels her energy into teaching swimming to children. But don't be fooled, " + prota.getNome() + "! Behind the sweetness of a teacher lies the grit of an international competitor. Do you have the rhythm and free spirit needed to keep up with this woman?", "Host", null, true, 6));
        falasCena1.add(new Fala(6, "To fill the next seat on our panel, we've brought the true meaning of haute couture to Table for Two! Get ready for the charm of Mônica!", "Host", null, true, 7));
        falasCena1.add(new Fala(7, "With a passport stamped in the world's trendiest capitals and dual citizenship, her heart divided between Brazil and Italy, she is a designer at a renowned modeling agency. After shining abroad, Mônica is back in Brazil with a clear goal: to infuse the roots and essence of our country into her next masterpieces.", "Host", null, true, 8));
        falasCena1.add(new Fala(8, "Now that she has unpacked her designer luggage and settled in here, she is looking for the one detail missing from her collection: a romantic partner worthy of her! Passionate about the concrete jungle, the asphalt and the buzzing nightlife, she wants someone with the stamina to keep up with her at parties, fashion shows and VIP events. So, " + prota.getNome() + "? Do you have the elegance and energy to strut down the red carpet beside this woman?", "Host", null, true, 9));
        falasCena1.add(new Fala(9, "And to prove that attraction isn't just a matter of chemistry, but of physics, our next single woman has a brilliant mind and a very different profile! Please welcome our Physics Olympics champion: Marcia!", "Host", null, true, 10));
        falasCena1.add(new Fala(10, "Working in the labs of a cutting-edge tech company focused on quantum physics, she spends her days unraveling the greatest mysteries of the universe. But let me tell you a little secret, " + prota.getNome() + "... Marcia didn't want to be here. Her favorite place in the world is the comfort and quiet of her own home, and she was literally forced by her family to get off the couch and join our show!", "Host", null, true, 11));
        falasCena1.add(new Fala(11, "She isn't impressed by spotlights or noisy dinners, and for her, love is still an equation with no solution. So? Do you have the intellect and patience to prove to this woman that leaving the house tonight was the best choice she (or her family) could have made?", "Host", null, true, 12));
        falasCena1.add(new Fala(12, "And to complete our panel with a touch of romance and sensitivity, we bring a woman whose very life seems to have come out of the pages of a classic! Introducing the enchanting Gabriela!", "Host", null, true, 13));
        falasCena1.add(new Fala(13, "Named as a lovely tribute to literature by her parents, she inherited not only the famous name but an unshakable passion for words. Our single woman is a writer with the gift of seeing the world poetically, valuing the beauty in the small things of everyday life. Oh, and a curious detail about her that leaked from the production team: Gabriela has an obsessive fear that her style sounds too commercial, which makes her rack her brain and even burn entire drafts. And there's more: if anything wins her heart faster than a good book, it's animals, her true passion!", "Host", null, true, 14));
        falasCena1.add(new Fala(14, "But don't fool yourself into thinking she'll be easy to win over with empty words: to win this Gabriela's heart, your romance will need plenty of clove and cinnamon!", "Host", null, true, 15));
        falasCena1.add(new Fala(15, "She came to Table for Two looking for someone who can read between the lines and isn't afraid to live a romance worthy of the movies — or rather, of literature. So, " + prota.getNome() + "? Do you have the sensitivity and vocabulary to become the protagonist of the next chapter of this writer's life?", "Host", null, true, -1));

        Cena cena1 = new Cena(1, "studio", "trilha_apresentacao.mp3", falasCena1, 2);
        cena1.setIdPrimeiraFala(1);
        cena1.setIdUltimaaFala(15);
        cenasCap1.add(cena1);

        List<Fala> falasCena2 = new ArrayList<>();
        falasCena2.add(new Fala(1, "Attention, audience! Our restaurant is officially open. Our four single women are already in their seats on the panel, and now the moment of truth has arrived for our guest. Welcome to our first challenge of the season: The Blind Tasting!", "Host", null, true, 2));
        falasCena2.add(new Fala(2, prota.getNome() + ", now you're going to introduce yourself properly. I'm going to ask you three essential questions to test your romantic palate. Each answer will be judged in real time by our panelists. Will you manage to win a reservation... or will you make our panel ask for the check early?", "Host", null, true, 3));

        Secundario angela = new Secundario("Ângela", 1, 30, 6);
        Secundario monica = new Secundario("Mônica", 2, 30, 10);
        Secundario marcia = new Secundario("Márcia", 3, 30, 8);
        Secundario gabriela = new Secundario("Gabriela", 4, 30, 4);

        List<Opcoes> opcoesD1 = List.of(
                new Opcoes(1, "I'd love to escape the city. An early-morning hike ending with a surprise picnic at the top of a mountain.", "An adventurous choice!", Map.of(angela, 3), 1, 0, false),
                new Opcoes(2, "I think luxury lives in the city. Dinner at a sophisticated bistro, followed by a VIP party where we toast all night long.", "Class and sophistication!", Map.of(monica, 3), 1, 0, false),
                new Opcoes(3, "Honestly? Staying home. Ordering excellent food, putting on comfy clothes and binge-watching a good documentary or sci-fi movie.", "Bold!", Map.of(marcia, 3), 1, 0, false),
                new Opcoes(4, "A late-afternoon stroll through a historic town, stopping at a literary café and, who knows, playing with some stray dogs along the way.", "Old-fashioned romantic!", Map.of(gabriela, 3), 1, 0, false),
                new Opcoes(5, "Oh, anywhere works. I'm easygoing, I let the girl pick whatever she wants.", "No initiative!", Map.of(angela, -2), 1, 2, true)
        );
        falasCena2.add(new Dialogo(3, "Very good, " + prota.getNome() + ", let's start warming up the engines of our kitchen! For our 'Appetizer', I want to know: what would your ideal date look like?", "Host", null, false, opcoesD1, 5));

        List<Opcoes> opcoesD2 = List.of(
                new Opcoes(1, "I enjoy the silence. Just listening to the rain tap on the window...", "Peace amid the unexpected!", Map.of(marcia, 4), 1, 0, false),
                new Opcoes(2, "I write an improvised romantic note...", "Romance!", Map.of(gabriela, 4), 1, 0, false),
                new Opcoes(3, "Rain doesn't scare me! I challenge her to a race...", "So much energy!", Map.of(angela, 4), 1, 0, false),
                new Opcoes(4, "I call a luxury ride-hailing car...", "Plan B!", Map.of(monica, 4), 1, 0, false),
                new Opcoes(5, "I'd probably get grumpy...", "No reservations!", Map.of(angela, -2), 1, 2, true)
        );
        falasCena2.add(new Dialogo(4, "On to our 'Main Course': imagine the date went wrong and it started pouring rain. How do you save the night?", "Host", null, false, opcoesD2, 5));

        List<Opcoes> opcoesD3 = List.of(
                new Opcoes(1, "I look for someone ambitious, with a buzzing social life...", "Power couple!", Map.of(monica, 5), 1, 0, false),
                new Opcoes(2, "I'm searching for an epic love...", "Classic love!", Map.of(gabriela, 5), 1, 0, false),
                new Opcoes(3, "I want someone who won't force me to be the center of attention...", "Maturity!", Map.of(marcia, 5), 1, 0, false),
                new Opcoes(4, "I want a partner who challenges me...", "Adventure!", Map.of(angela, 5), 1, 0, false),
                new Opcoes(5, "I'm not really sure yet...", "Weak excuse!", Map.of(angela, -2), 1, 2, true)
        );
        falasCena2.add(new Dialogo(5, "To finish, the 'Dessert'! What do you truly look for in a partner?", "Host", null, false, opcoesD3, 5));
        falasCena2.add(new Fala(6, "And with that dessert, our kitchen closes the orders for this round! In the next block, we move on to the one-on-one dates.", "Host", null, true, -1));

        Cena cena2 = new Cena(2, "Studio", "trilha_jantar.mp3", falasCena2);
        cena2.setIdPrimeiraFala(1);
        cena2.setIdUltimaaFala(6);
        cenasCap1.add(cena2);

        Capitulo capitulo1 = new Capitulo(1, "Debut", 1, 2, cenasCap1);
        bancoDeCapitulos.put(1, capitulo1);
    }

    private void carregarCapitulo2() {
        List<Cena> cenasCap2 = new ArrayList<>();

        List<Fala> falasCena1 = new ArrayList<>();
        falasCena1.add(new Fala(1, "The game has heated up, Brazil! The stage became too small for tonight's emotions, so we decided to send our single man straight into action. Our one-on-one date round starts now!", "Host", null, true, 2));
        falasCena1.add(new Fala(2, "And to kick off this phase on the right foot — or rather, up high — " + prota.getNome() + " will have her first date with our unstoppable athlete, Ângela!", "Host", null, true, 3));
        falasCena1.add(new Fala(3, "Our production team has prepared the perfect setting to test this pair's limits: an extreme treetop adventure course in the middle of nature!", "Host", null, true, 4));

        Secundario angela = new Secundario("Ângela", 1, 30, 6);

        List<Opcoes> opcoesD1 = List.of(
                new Opcoes(1, "Not desperate at all, I love a challenge!", "Challenge accepted", Map.of(angela, 3), 1, 0, false),
                new Opcoes(2, "It was intense, but the view was worth it.", "Nice view", Map.of(angela, 1), 1, 0, false),
                new Opcoes(3, "I just tried not to look down.", "Fear of heights", Map.of(angela, -1), 1, 0, false),
                new Opcoes(4, "I thought it was a bit over the top.", "Over the top", Map.of(angela, -3), 1, 1, true)
        );
        falasCena1.add(new Dialogo(4, "Wow, we made it! How desperate did you get up there in the middle of that climb?", "Ângela", angela, false, opcoesD1, 4));

        List<Opcoes> opcoesD2 = List.of(
                new Opcoes(1, "Having you there cheering me on was the push I needed.", "Coach", Map.of(angela, 1), 1, 0, false),
                new Opcoes(2, "It was the fault of that safety equipment...", "Blame the equipment", Map.of(angela, -1), 1, 0, false),
                new Opcoes(3, "I froze because the production crew kept shouting in my earpiece.", "Earpiece", Map.of(angela, -3), 1, 1, true),
                new Opcoes(4, "An ancient tactic of controlled panic!", "Controlled panic", Map.of(angela, 3), 1, 0, false)
        );
        falasCena1.add(new Dialogo(5, "There was a moment at the main gap where you froze up beautifully. Are you going to admit you needed help?", "Ângela", angela, false, opcoesD2, 3));

        List<Opcoes> opcoesD3 = List.of(
                new Opcoes(1, "Only the pressure of obligations.", "Pressure", Map.of(angela, -3), 1, 1, true),
                new Opcoes(2, "Meeting new stories and living moments.", "Stories", Map.of(angela, 1), 1, 0, false),
                new Opcoes(3, "I like my planned routine.", "Routine", Map.of(angela, -1), 1, 0, false),
                new Opcoes(4, "The feeling of surpassing myself and growing.", "Self-improvement", Map.of(angela, 3), 1, 0, false)
        );
        falasCena1.add(new Dialogo(6, "What truly pulls you out of your comfort zone when you wake up?", "Ângela", angela, false, opcoesD3, 1));
        falasCena1.add(new Fala(7, "Suddenly the weather turns and a few drops begin to fall. Ângela holds out her hand.", "Narrator", null, true, 8));

        List<Opcoes> opcoesD4 = List.of(
                new Opcoes(1, "What a lack of organization from the crew!", "Complaint", Map.of(angela, -1), 1, 0, false),
                new Opcoes(2, "We stall the production crew! The view is ours.", "Fun", Map.of(angela, 3), 1, 0, false),
                new Opcoes(3, "I think we should start heading down for safety.", "Safety", Map.of(angela, 1), 1, 0, false),
                new Opcoes(4, "My clothes are going to get soaked!", "Wet clothes", Map.of(angela, -3), 1, 1, true)
        );
        falasCena1.add(new Dialogo(8, "Uh-oh, the weather decided to test us. What do we do?", "Ângela", angela, false, opcoesD4, 4));
        falasCena1.add(new Fala(9, "The rain picks up a little, and you two start gathering the equipment.", "Narrator", null, true, 10));

        List<Opcoes> opcoesD5 = List.of(
                new Opcoes(1, "I had a lot of fun, truly.", "Fun", Map.of(angela, 1), 1, 0, false),
                new Opcoes(2, "It was sensational. On the next date, I choose the arena!", "Future challenge", Map.of(angela, 3), 1, 0, false),
                new Opcoes(3, "I really wanted to impress you today.", "Impression", Map.of(angela, -1), 1, 0, false),
                new Opcoes(4, "It's all part of the script for the audience.", "Script", Map.of(angela, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(10, "Did you enjoy the outing, or did you only agree to climb so you wouldn't look bad on TV?", "Ângela", angela, false, opcoesD5, 4));

        Cena cena1 = new Cena(1, "arvorismo", "trilha_esporte.mp3", falasCena1, 2);
        cena1.setIdPrimeiraFala(1);
        cena1.setIdUltimaaFala(10);
        cenasCap2.add(cena1);

        List<Fala> falasCena2 = new ArrayList<>();
        Secundario angelaC2 = new Secundario("Ângela", 1, 30, 6);
        Secundario monicaC2 = new Secundario("Mônica", 2, 30, 10);
        Secundario marciaC2 = new Secundario("Márcia", 3, 30, 8);
        Secundario gabrielaC2 = new Secundario("Gabriela", 4, 30, 4);

        List<Opcoes> opcoesFotoC2 = List.of(
                new Opcoes(1, "Selfie at the top of the wall, sweaty face, smiling and flexing muscles", "", Map.of(angelaC2, 3), 1, 0, false),
                new Opcoes(2, "Conceptual photo of just the climbing gear with a black-and-white filter", "", Map.of(monicaC2, 3), 1, 0, false),
                new Opcoes(3, "Macro photo of an insect or the texture of the platform wood, no people", "", Map.of(marciaC2, 3), 1, 0, false),
                new Opcoes(4, "Candid photo of rain clouds forming on the horizon with the sun out", "", Map.of(gabrielaC2, 3), 1, 0, false)
        );
        falasCena2.add(new Dialogo(1, "Choose a photo to post:", "System", null, false, opcoesFotoC2, 0));

        List<Opcoes> opcoesLegendaC2 = List.of(
                new Opcoes(1, "Gravity tried, but today I won! Bring on the next challenge.", "", Map.of(angelaC2, 3), 1, 0, false),
                new Opcoes(2, "Outdoor adventures are great, but I confess I already miss air conditioning and a glass of champagne.", "", Map.of(monicaC2, 3), 1, 0, false),
                new Opcoes(3, "The silence up there was the best part. It's fascinating how the physics of climbing depends on such perfect weight distribution.", "", Map.of(marciaC2, 3), 1, 0, false),
                new Opcoes(4, "Sometimes we have to climb as high as we can to see what really matters. A date to remember.", "", Map.of(gabrielaC2, 3), 1, 0, false)
        );
        falasCena2.add(new Dialogo(2, "Choose a caption:", "System", null, false, opcoesLegendaC2, 0));
        falasCena2.add(new Fala(3, "Posted successfully!", "System", null, true, -1));

        Cena cena2 = new Cena(2, "social_media", "trilha_leve.mp3", falasCena2);
        cena2.setIdPrimeiraFala(1);
        cena2.setIdUltimaaFala(3);
        cenasCap2.add(cena2);

        Capitulo capitulo2 = new Capitulo(2, "A Date Up High", 1, 2, cenasCap2);
        bancoDeCapitulos.put(2, capitulo2);
    }

    private void carregarCapitulo3() {
        List<Cena> cenasCap3 = new ArrayList<>();
        List<Fala> falasCena1 = new ArrayList<>();
        falasCena1.add(new Fala(1, "Phew! The second date changes pace completely. Today is the day to dive into the world of the writer Gabriela!", "Host", null, true, 2));
        falasCena1.add(new Fala(2, "The production team has prepared an afternoon in an old literary secondhand bookshop. Quiet on set!", "Host", null, true, 3));

        Secundario gabriela = new Secundario("Gabriela", 4, 30, 4);

        List<Opcoes> opcoesD1 = List.of(
                new Opcoes(1, "Sharing the same story from the past gives me chills.", "Past story", Map.of(gabriela, 3), 1, 0, false),
                new Opcoes(2, "It's a great hideout from the noise.", "Refuge", Map.of(gabriela, 1), 1, 0, false),
                new Opcoes(3, "I prefer to read everything on an e-reader.", "Digital", Map.of(gabriela, -1), 1, 0, false),
                new Opcoes(4, "To me it smells like mold and dust.", "Allergies", Map.of(gabriela, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(3, "Every book here has been read by dozens of people. Can you feel it?", "Gabriela", gabriela, false, opcoesD1, 4));

        List<Opcoes> opcoesD2 = List.of(
                new Opcoes(1, "Something about science or math.", "Science", Map.of(gabriela, -1), 1, 0, false),
                new Opcoes(2, "A biography about someone rich and famous.", "Biography", Map.of(gabriela, -3), 1, 2, true),
                new Opcoes(3, "A well-crafted mystery.", "Mystery", Map.of(gabriela, 1), 1, 0, false),
                new Opcoes(4, "A classic romance, with handwritten letters.", "Classic romance", Map.of(gabriela, 3), 1, 0, false)
        );
        falasCena1.add(new Dialogo(4, "If you could take one story home today, which genre would you look for?", "Gabriela", gabriela, false, opcoesD2, 2));

        List<Opcoes> opcoesD3 = List.of(
                new Opcoes(1, "I hold the pen, I don't believe in destiny.", "Free will", Map.of(gabriela, -1), 1, 0, false),
                new Opcoes(2, "The universe is chaos and we try to survive.", "Chaos", Map.of(gabriela, -3), 1, 2, true),
                new Opcoes(3, "Destiny puts us on the page, we decide the ending.", "Destiny and choice", Map.of(gabriela, 3), 1, 0, false),
                new Opcoes(4, "I believe everything happens for a reason.", "Reason", Map.of(gabriela, 1), 1, 0, false)
        );
        falasCena1.add(new Dialogo(5, "Is our story already written in the stars, or are we the ones holding the pen?", "Gabriela", gabriela, false, opcoesD3, 2));
        falasCena1.add(new Fala(6, "A lightning bolt strikes outside and the lights go out. Gabriela grabs your arm, frightened.", "Narrator", null, true, 7));

        List<Opcoes> opcoesD4 = List.of(
                new Opcoes(1, "I'll ask for two candles and turn this into a candlelit date.", "Candlelight", Map.of(gabriela, 3), 1, 0, false),
                new Opcoes(2, "I turn on my phone's flashlight.", "Flashlight", Map.of(gabriela, 1), 1, 0, false),
                new Opcoes(3, "I'm going to complain to the production crew about the generator!", "Complaint", Map.of(gabriela, -1), 1, 0, false),
                new Opcoes(4, "Are you afraid of the dark? We're not in a horror movie.", "Fearless", Map.of(gabriela, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(7, "Absolute darkness makes me anxious... What do we do now?", "Gabriela", gabriela, false, opcoesD4, 4));

        List<Opcoes> opcoesD5 = List.of(
                new Opcoes(1, "It was a bit too slow for me.", "Slow", Map.of(gabriela, -3), 1, 1, true),
                new Opcoes(2, "I was afraid of breaking the literary mood.", "Fear", Map.of(gabriela, -1), 1, 0, false),
                new Opcoes(3, "It was very relaxing and refreshing.", "Relaxing", Map.of(gabriela, 1), 1, 0, false),
                new Opcoes(4, "I found poetry in you.", "Poetry", Map.of(gabriela, 3), 1, 0, false)
        );
        falasCena1.add(new Dialogo(8, "Tell me the truth: did this date bore you, or did you manage to see this place the way I do?", "Gabriela", gabriela, false, opcoesD5, 1));

        Cena cena1 = new Cena(1, "sebo", "trilha_romance.mp3", falasCena1, 2);
        cena1.setIdPrimeiraFala(1);
        cena1.setIdUltimaaFala(8);
        cenasCap3.add(cena1);

        List<Fala> falasCena2 = new ArrayList<>();
        Secundario angelaC3 = new Secundario("Ângela", 1, 30, 6);
        Secundario monicaC3 = new Secundario("Mônica", 2, 30, 10);
        Secundario marciaC3 = new Secundario("Márcia", 3, 30, 8);
        Secundario gabrielaC3 = new Secundario("Gabriela", 4, 30, 4);

        List<Opcoes> opcoesLivroC3 = List.of(
                new Opcoes(1, "Climbing and Survival Guide", "", Map.of(angelaC3, 3), 1, 0, false),
                new Opcoes(2, "History of Haute Couture", "", Map.of(monicaC3, 3), 1, 0, false),
                new Opcoes(3, "Quantum Physics for Beginners", "", Map.of(marciaC3, 3), 1, 0, false),
                new Opcoes(4, "Poetic Anthology", "", Map.of(gabrielaC3, 3), 1, 0, false)
        );
        falasCena2.add(new Dialogo(1, "Choose a photo of a book to post:", "System", null, false, opcoesLivroC3, 0));

        List<Opcoes> opcoesLegendaC3 = List.of(
                new Opcoes(1, "Reading about great adventures is wonderful, but living them in practice will always be my favorite style.", "", Map.of(angelaC3, 3), 1, 0, false),
                new Opcoes(2, "Vintage never goes out of style. The perfect coffee, the perfect lighting, the perfect style. Good taste lives in the small details.", "", Map.of(monicaC3, 3), 1, 0, false),
                new Opcoes(3, "The best part of this place isn't even the books, it's the absolute silence. Proof that peace and solitude recharge any battery.", "", Map.of(marciaC3, 3), 1, 0, false),
                new Opcoes(4, "Among so many pages and stories lost in time, my favorite one was sitting right in front of me. An unforgettable date.", "", Map.of(gabrielaC3, 3), 1, 0, false)
        );
        falasCena2.add(new Dialogo(2, "Choose a caption:", "System", null, false, opcoesLegendaC3, 0));
        falasCena2.add(new Fala(3, "Posted successfully!", "System", null, true, -1));

        Cena cena2 = new Cena(2, "social_media_sebo", "trilha_leve.mp3", falasCena2);
        cena2.setIdPrimeiraFala(1);
        cena2.setIdUltimaaFala(3);
        cenasCap3.add(cena2);

        Capitulo capitulo3 = new Capitulo(3, "Between Pages and Poetry", 1, 2, cenasCap3);
        bancoDeCapitulos.put(3, capitulo3);
    }

    private void carregarCapitulo4() {
        List<Cena> cenasCap4 = new ArrayList<>();
        List<Fala> falasCena1 = new ArrayList<>();
        falasCena1.add(new Fala(1, "Attention, Brazil! Tonight's date is with our scientist, Marcia, at the Technology Museum, closed just for the two of them.", "Host", null, true, 2));
        falasCena1.add(new Fala(2, prota.getNome() + " is going to spend the evening in a calm and quiet setting.", "Host", null, true, 3));

        Secundario marcia = new Secundario("Márcia", 3, 30, 8);

        List<Opcoes> opcoesD1 = List.of(
                new Opcoes(1, "It's a relief to have peace to talk without shouting.", "Peace", Map.of(marcia, 3), 1, 0, false),
                new Opcoes(2, "It's actually interesting for focusing on the exhibits.", "Focus", Map.of(marcia, 1), 1, 0, false),
                new Opcoes(3, "It feels like the museum is closed and we broke in.", "Trespassing", Map.of(marcia, -1), 1, 0, false),
                new Opcoes(4, "I find it kind of depressing, there's nobody around.", "Depressing", Map.of(marcia, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(3, "Having to compete for space with crowds would give me a headache. What do you think?", "Marcia", marcia, false, opcoesD1, 4));

        List<Opcoes> opcoesD2 = List.of(
                new Opcoes(1, "The predictability of logic would avoid conflicts.", "Logic", Map.of(marcia, 3), 1, 0, false),
                new Opcoes(2, "I love understanding how logic works.", "How it works", Map.of(marcia, 1), 1, 0, false),
                new Opcoes(3, "I find it a bit cold, emotions aren't algebra.", "Cold", Map.of(marcia, -1), 1, 0, false),
                new Opcoes(4, "Wow, how boring to act like a robot.", "Robot", Map.of(marcia, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(4, "Wouldn't it be great if people's behavior were as clear as a circuit?", "Marcia", marcia, false, opcoesD2, 4));

        List<Opcoes> opcoesD3 = List.of(
                new Opcoes(1, "A relationship requires real compatibility and data.", "Data", Map.of(marcia, 3), 1, 0, false),
                new Opcoes(2, "Emotions matter, but so does common sense.", "Balance", Map.of(marcia, 1), 1, 0, false),
                new Opcoes(3, "If we feel something strong, we have to go for it.", "Impulse", Map.of(marcia, -1), 1, 0, false),
                new Opcoes(4, "You overanalyze, love is chaotic.", "Chaos", Map.of(marcia, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(5, "I believe that in real life even love has to go through a rational filter. What do you think?", "Marcia", marcia, false, opcoesD3, 4));
        falasCena1.add(new Fala(6, "Suddenly, a noisy group of sponsors arrives for a surprise cocktail party.", "Narrator", null, true, 7));

        List<Opcoes> opcoesD4 = List.of(
                new Opcoes(1, "There's a smaller room on the second floor, let's slip away quietly.", "Hideout", Map.of(marcia, 3), 1, 0, false),
                new Opcoes(2, "Want me to ask them to hold the group back?", "Help", Map.of(marcia, 1), 1, 0, false),
                new Opcoes(3, "Let's stay here in our corner.", "Corner", Map.of(marcia, -1), 1, 0, false),
                new Opcoes(4, "Let's go mingle with everyone!", "Hustle and bustle", Map.of(marcia, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(7, "The noise is unbearable... What do we do?", "Marcia", marcia, false, opcoesD4, 4));

        List<Opcoes> opcoesD5 = List.of(
                new Opcoes(1, "I'd trade any party for this inner peace.", "Inner peace", Map.of(marcia, 3), 1, 0, false),
                new Opcoes(2, "It did me good to slow down my mind.", "Slowing down", Map.of(marcia, 1), 1, 0, false),
                new Opcoes(3, "It was nice, the new experience was worth it.", "Experience", Map.of(marcia, -1), 1, 0, false),
                new Opcoes(4, "Now I'd be up for a lively bar.", "Lively bar", Map.of(marcia, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(8, "It's hard to find someone who understands that I don't need loud music. How was it?", "Marcia", marcia, false, opcoesD5, 4));

        Cena cena1 = new Cena(1, "museu", "trilha_tecnologia.mp3", falasCena1, 2);
        cena1.setIdPrimeiraFala(1);
        cena1.setIdUltimaaFala(8);
        cenasCap4.add(cena1);

        List<Fala> falasCena2 = new ArrayList<>();
        Secundario angelaC4 = new Secundario("Ângela", 1, 30, 6);
        Secundario monicaC4 = new Secundario("Mônica", 2, 30, 10);
        Secundario marciaC4 = new Secundario("Márcia", 3, 30, 8);
        Secundario gabrielaC4 = new Secundario("Gabriela", 4, 30, 4);

        List<Opcoes> opcoesFotoC4 = List.of(
                new Opcoes(1, "A stylized battery with a lightning bolt drawn in the middle", "", Map.of(angelaC4, 3), 1, 0, false),
                new Opcoes(2, "A badge with an elegant lanyard reading VIP Access", "", Map.of(monicaC4, 3), 1, 0, false),
                new Opcoes(3, "A classic processor microchip", "", Map.of(marciaC4, 3), 1, 0, false),
                new Opcoes(4, "A vintage light bulb with the inner filament shaped like a heart", "", Map.of(gabrielaC4, 3), 1, 0, false)
        );
        falasCena2.add(new Dialogo(1, "Choose an icon:", "System", null, false, opcoesFotoC4, 0));

        List<Opcoes> opcoesLegendaC4 = List.of(
                new Opcoes(1, "A pause from the rush just to recharge my battery. Can't wait for the reality show's new adventures.", "", Map.of(angelaC4, 3), 1, 0, false),
                new Opcoes(2, "Having an entire museum closed just for us is the kind of exclusivity I value. The perfect setting, no lines and plenty of style.", "", Map.of(monicaC4, 3), 1, 0, false),
                new Opcoes(3, "Humanity's best invention is still silence. An incredible night, focused on what matters, far from any outside interference.", "", Map.of(marciaC4, 3), 1, 0, false),
                new Opcoes(4, "Amid so many machines and cold circuits, it's incredible how the true spark still comes from a good conversation.", "", Map.of(gabrielaC4, 3), 1, 0, false)
        );
        falasCena2.add(new Dialogo(2, "Choose a caption:", "System", null, false, opcoesLegendaC4, 0));
        falasCena2.add(new Fala(3, "Posted successfully!", "System", null, true, -1));

        Cena cena2 = new Cena(2, "social_media_museu", "trilha_leve.mp3", falasCena2);
        cena2.setIdPrimeiraFala(1);
        cena2.setIdUltimaaFala(3);
        cenasCap4.add(cena2);

        Capitulo capitulo4 = new Capitulo(4, "Logic and Silence", 1, 2, cenasCap4);
        bancoDeCapitulos.put(4, capitulo4);
    }

    private void carregarCapitulo5() {
        List<Cena> cenasCap5 = new ArrayList<>();
        List<Fala> falasCena1 = new ArrayList<>();
        falasCena1.add(new Fala(1, "Good evening, Brazil! Tonight " + prota.getNome() + " heads straight to the penthouse for a date with the glamorous Mônica!", "Host", null, true, 2));
        falasCena1.add(new Fala(2, "An exclusive setting and signature drinks. Mônica is demanding and seeks excellence. Ready?", "Host", null, true, 3));

        Secundario monica = new Secundario("Mônica", 2, 30, 10);

        List<Opcoes> opcoesD1 = List.of(
                new Opcoes(1, "Being at the top with excellent service is the bare minimum.", "Top", Map.of(monica, 3), 1, 0, false),
                new Opcoes(2, "Very beautiful, great decor and atmosphere.", "Beautiful", Map.of(monica, 1), 1, 0, false),
                new Opcoes(3, "Something simple would please me just fine too.", "Simple", Map.of(monica, -1), 1, 0, false),
                new Opcoes(4, "I think it's excessive to spend needlessly for a photo.", "Excessive", Map.of(monica, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(3, "The energy of the city and the exclusivity up here... What do you think of the setting?", "Mônica", monica, false, opcoesD1, 4));

        List<Opcoes> opcoesD2 = List.of(
                new Opcoes(1, "At the top, leading great projects with ambition.", "Ambition", Map.of(monica, 3), 1, 0, false),
                new Opcoes(2, "I want stability and a solid career.", "Stability", Map.of(monica, 1), 1, 0, false),
                new Opcoes(3, "I just want peace and to pay my bills on time.", "Peace", Map.of(monica, -1), 1, 0, false),
                new Opcoes(4, "Focusing too much on success ruins a person.", "No focus", Map.of(monica, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(4, "To me, success is building a strong name. Where do you want to be in a few years?", "Mônica", monica, false, opcoesD2, 4));

        List<Opcoes> opcoesD3 = List.of(
                new Opcoes(1, "Those who accept anything live any old way. Standards matter.", "Standards", Map.of(monica, 3), 1, 0, false),
                new Opcoes(2, "It depends on the situation, it's good to relax sometimes.", "Relax", Map.of(monica, 1), 1, 0, false),
                new Opcoes(3, "I'm pretty carefree about details.", "Carefree", Map.of(monica, -1), 1, 0, false),
                new Opcoes(4, "It's pure fuss to stress your mind over trivialities.", "Fuss", Map.of(monica, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(5, "I'm extremely demanding about everything around me. Do you also look for the best?", "Mônica", monica, false, opcoesD3, 4));

        List<Opcoes> opcoesD4 = List.of(
                new Opcoes(1, "I think about every detail, image opens doors.", "Details", Map.of(monica, 3), 1, 0, false),
                new Opcoes(2, "I like being well dressed without going overboard.", "Basics", Map.of(monica, 1), 1, 0, false),
                new Opcoes(3, "I only wear what's comfortable for me.", "Comfort", Map.of(monica, -1), 1, 0, false),
                new Opcoes(4, "Clothes are only for covering the body.", "Plain clothes", Map.of(monica, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(6, "The way we dress is our calling card. Do you think about that?", "Mônica", monica, false, opcoesD4, 4));

        List<Opcoes> opcoesD5 = List.of(
                new Opcoes(1, "If it means having your company, the couch can wait.", "Company", Map.of(monica, 3), 1, 0, false),
                new Opcoes(2, "I like going out, but balance is the key.", "Balance", Map.of(monica, 1), 1, 0, false),
                new Opcoes(3, "I'm more of a homebody, one event a month is enough.", "Homebody", Map.of(monica, -1), 1, 0, false),
                new Opcoes(4, "I'm already dying to go home and rest.", "Tired", Map.of(monica, -3), 1, 4, true)
        );
        falasCena1.add(new Dialogo(7, "Do you really connect with events, or will the couch end up winning?", "Mônica", monica, false, opcoesD5, 4));

        Cena cena1 = new Cena(1, "cobertura", "trilha_luxo.mp3", falasCena1, 2);
        cena1.setIdPrimeiraFala(1);
        cena1.setIdUltimaaFala(7);
        cenasCap5.add(cena1);

        List<Fala> falasCena2 = new ArrayList<>();
        Secundario angelaC5 = new Secundario("Ângela", 1, 30, 6);
        Secundario monicaC5 = new Secundario("Mônica", 2, 30, 10);
        Secundario marciaC5 = new Secundario("Márcia", 3, 30, 8);
        Secundario gabrielaC5 = new Secundario("Gabriela", 4, 30, 4);

        List<Opcoes> opcoesFotoC5 = List.of(
                new Opcoes(1, "A dartboard", "", Map.of(angelaC5, 3), 1, 0, false),
                new Opcoes(2, "A Martini glass with an olive or cherry at the bottom", "", Map.of(monicaC5, 3), 1, 0, false),
                new Opcoes(3, "The simplified facade of a house", "", Map.of(marciaC5, 3), 1, 0, false),
                new Opcoes(4, "A luxurious cloth napkin with a short handwritten phrase", "", Map.of(gabrielaC5, 3), 1, 0, false)
        );
        falasCena2.add(new Dialogo(1, "Choose an object:", "System", null, false, opcoesFotoC5, 0));

        List<Opcoes> opcoesLegendaC5 = List.of(
                new Opcoes(1, "The place is chic, but the real fun began when we found the game area. Aim calibrated and ready for the next round.", "", Map.of(angelaC5, 3), 1, 0, false),
                new Opcoes(2, "Nights at the top of the city demand the best company. Toasting to success, impeccable aesthetics and good moments.", "", Map.of(monicaC5, 3), 1, 0, false),
                new Opcoes(3, "Back at base, after a long day.", "", Map.of(marciaC5, 3), 1, 0, false),
                new Opcoes(4, "Even in the busiest place in the world, all that matters is the poetry of a good look and a conversation that makes time stop.", "", Map.of(gabrielaC5, 3), 1, 0, false)
        );
        falasCena2.add(new Dialogo(2, "Choose a caption:", "System", null, false, opcoesLegendaC5, 0));
        falasCena2.add(new Fala(3, "Posted successfully!", "System", null, true, -1));

        Cena cena2 = new Cena(2, "social_media_cobertura", "trilha_leve.mp3", falasCena2);
        cena2.setIdPrimeiraFala(1);
        cena2.setIdUltimaaFala(3);
        cenasCap5.add(cena2);

        Capitulo capitulo5 = new Capitulo(5, "Haute Couture and High Society", 1, 2, cenasCap5);
        bancoDeCapitulos.put(5, capitulo5);
    }

    private void carregarCapitulo6() {
        List<Cena> cenasCap6 = new ArrayList<>();
        List<Fala> falasCena1 = new ArrayList<>();
        falasCena1.add(new Fala(1, "And the cameras never stop! Our single man is called in for special missions backstage.", "Host", null, true, 2));

        Secundario angelaC6 = new Secundario("Ângela", 1, 30, 6);
        Secundario monicaC6 = new Secundario("Mônica", 2, 30, 10);
        Secundario marciaC6 = new Secundario("Márcia", 3, 30, 8);
        Secundario gabrielaC6 = new Secundario("Gabriela", 4, 30, 4);

        List<Opcoes> opcoesD1 = List.of(
                new Opcoes(1, "Metal workout water bottle.", "", Map.of(angelaC6, 3), 1, 0, false),
                new Opcoes(2, "Leather notebook with drafts.", "", Map.of(gabrielaC6, 3), 1, 0, false),
                new Opcoes(3, "External hard drive with a case.", "", Map.of(marciaC6, 3), 1, 0, false),
                new Opcoes(4, "Designer toiletry bag.", "", Map.of(monicaC6, 3), 1, 0, false),
                new Opcoes(5, "Generic corporate planner.", "", Map.of(angelaC6, -1), 1, 0, false)
        );
        falasCena1.add(new Dialogo(2, "Decision 1: Save a Personal Item.", "System", null, false, opcoesD1, 5));

        List<Opcoes> opcoesD2 = List.of(
                new Opcoes(1, "Old sports sneakers.", "", Map.of(angelaC6, -3), 1, 1, true),
                new Opcoes(2, "Classic poetry book.", "", Map.of(gabrielaC6, -3), 1, 1, true),
                new Opcoes(3, "Printed technical manual.", "", Map.of(marciaC6, -3), 1, 1, true),
                new Opcoes(4, "Luxury fashion magazine.", "", Map.of(monicaC6, -3), 1, 1, true),
                new Opcoes(5, "Simple notepad.", "", Map.of(angelaC6, -1), 1, 0, false)
        );
        falasCena1.add(new Dialogo(3, "Decision 2: Discard an Item.", "System", null, false, opcoesD2, 1));

        List<Opcoes> opcoesD3 = List.of(
                new Opcoes(1, "Smartwatch with GPS.", "", Map.of(angelaC6, 3), 1, 0, false),
                new Opcoes(2, "Classic fountain pen.", "", Map.of(gabrielaC6, 3), 1, 0, false),
                new Opcoes(3, "Articulated desk lamp.", "", Map.of(marciaC6, 3), 1, 0, false),
                new Opcoes(4, "Embroidered silk scarf.", "", Map.of(monicaC6, 3), 1, 0, false),
                new Opcoes(5, "Standard Bluetooth earbuds.", "", Map.of(angelaC6, -1), 1, 0, false)
        );
        falasCena1.add(new Dialogo(4, "Decision 3: Buy a Gift at the Store.", "System", null, false, opcoesD3, 5));

        List<Opcoes> opcoesD4 = List.of(
                new Opcoes(1, "Seeing Ângela loosen up...", "", Map.of(angelaC6, 3), 1, 0, false),
                new Opcoes(2, "Gabriela's connection...", "", Map.of(gabrielaC6, 3), 1, 0, false),
                new Opcoes(3, "The comfortable silence between Marcia...", "", Map.of(marciaC6, 3), 1, 0, false),
                new Opcoes(4, "Mônica and the protagonist...", "", Map.of(monicaC6, 3), 1, 0, false),
                new Opcoes(5, "I'm really rooting for the couple...", "", Map.of(angelaC6, -1), 1, 0, false)
        );
        falasCena1.add(new Dialogo(5, "Decision 4: Save a Love Message.", "System", null, false, opcoesD4, 5));

        Cena cena1 = new Cena(1, "camarim", "trilha_decisao.mp3", falasCena1, 2);
        cena1.setIdPrimeiraFala(1);
        cena1.setIdUltimaaFala(5);
        cenasCap6.add(cena1);

        List<Fala> falasCena2 = new ArrayList<>();
        falasCena2.add(new Fala(1, "To close, an attention test on the big screen!", "Host", null, true, 2));

        List<Opcoes> opcoesQuiz = List.of(
                new Opcoes(1, "She is terrified of deep water and open sea, despite teaching swimming in shallow pools.", "", Map.of(angelaC6, 5), 1, 0, false),
                new Opcoes(2, "She can't hold back tears when watching clichéd romantic comedies on TV.", "", Map.of(marciaC6, 5), 1, 0, false),
                new Opcoes(3, "She started her career running an online thrift shop, hidden from her parents in her bedroom.", "", Map.of(monicaC6, 5), 1, 0, false),
                new Opcoes(4, "She has an obsessive fear that her style will end up sounding too commercial.", "", Map.of(gabrielaC6, 5), 1, 0, false),
                new Opcoes(5, "She has a secret tattoo of an old binary code on the back of her neck, which she got in secret at seventeen.", "", Map.of(angelaC6, -5, monicaC6, -5, marciaC6, -5, gabrielaC6, -5), 1, 0, false)
        );
        falasCena2.add(new Dialogo(2, "Select the matching true fact:", "Host", null, false, opcoesQuiz, 5));
        falasCena2.add(new Fala(3, "Decisions made! Final stretch ahead.", "Host", null, true, -1));

        Cena cena2 = new Cena(2, "telao_camarim", "trilha_tenso.mp3", falasCena2);
        cena2.setIdPrimeiraFala(1);
        cena2.setIdUltimaaFala(3);
        cenasCap6.add(cena2);

        Capitulo capitulo6 = new Capitulo(6, "Backstage and the Decision Filter", 1, 2, cenasCap6);
        bancoDeCapitulos.put(6, capitulo6);
    }

    private void carregarCapitulo7() {
        List<Cena> cenasCap7 = new ArrayList<>();

        Secundario angelaC7 = new Secundario("Ângela", 1, 30, 6);
        Secundario monicaC7 = new Secundario("Mônica", 2, 30, 10);
        Secundario marciaC7 = new Secundario("Márcia", 3, 30, 8);
        Secundario gabrielaC7 = new Secundario("Gabriela", 4, 30, 4);

        List<Fala> falasCena1Facil = new ArrayList<>();
        falasCena1Facil.add(new Fala(1, "Hello! Welcome to another episode of Table for Two. Tonight our show is extra special because it will be you, yes, you in the audience, who will dictate the course of our contestant. Let me present our segment: Love's Answer Key! Roll the jingle!", "Host", null, true, 2));
        falasCena1Facil.add(new Fala(2, "In this segment, " + prota.getNome() + " will open his heart and answer personal questions asked by our viewers. Will he be able to pass the hardest test of his life: the entrance exam of love?", "Host", null, true, 3));

        List<Opcoes> opcoesAngelaFacil = List.of(
                new Opcoes(1, "I accept the challenge right away! I join in the game and take the chance to show that I like to compete too.", "Competitive", Map.of(angelaC7, 20), 1, 0, false),
                new Opcoes(2, "I refuse immediately and say I have no interest whatsoever in sports or physical activities.", "Uninterested", Map.of(angelaC7, 0), 1, 0, false),
                new Opcoes(3, "I accept the challenge, but I start showing off and turning the competition into something way too serious.", "Show-off", Map.of(angelaC7, -20), 1, 2, true)
        );
        falasCena1Facil.add(new Dialogo(3, "PHASE 1: THEIR ANSWER KEY (CHEMISTRY)\n\nQuestion number one, straight to Ângela's answer key, our competitive athlete who loves sports and the outdoors.\n\nÂngela invites you to spend the day on a hiking trail and, halfway through, proposes a challenge: whoever reaches the top of the mountain first. What do you do?", "Host", angelaC7, false, opcoesAngelaFacil, 3));

        List<Opcoes> opcoesMonicaFacil = List.of(
                new Opcoes(1, "I pick a special place and introduce her to a Brazilian dish I think matches her tastes, remembering the things she has told me about herself.", "Thoughtful", Map.of(monicaC7, 20), 1, 0, false),
                new Opcoes(2, "I say any restaurant is fine and let her choose everything on her own, without worrying much.", "Disinterested", Map.of(monicaC7, 0), 1, 0, false),
                new Opcoes(3, "I pick the cheapest restaurant possible and complain about the price whenever she shows interest in trying something.", "Cheapskate", Map.of(monicaC7, -20), 1, 2, true)
        );
        falasCena1Facil.add(new Dialogo(4, "Second question of this phase, directed to Mônica, our elegant, ironic stylist who is used to a hectic life.\n\nDuring the date, Mônica mentions that she doesn't know Brazilian cuisine very well yet and shows curiosity to try something different. How do you react?", "Host", monicaC7, false, opcoesMonicaFacil, 3));

        List<Opcoes> opcoesMarciaFacil = List.of(
                new Opcoes(1, "I notice the discomfort and calmly ask if she'd prefer to find a more private place, without pressuring her to talk.", "Understanding", Map.of(marciaC7, 20), 1, 0, false),
                new Opcoes(2, "I try to force her to open up by asking lots of questions and telling her she needs to stop being so shy.", "Pushy", Map.of(marciaC7, -20), 1, 2, true),
                new Opcoes(3, "I get irritated by the silence and start complaining that she's making the date awkward and should try harder to talk.", "Impatient", Map.of(marciaC7, 0), 1, 0, false)
        );
        falasCena1Facil.add(new Dialogo(5, "Now we get to the third question, directed to Márcia, our brilliant Physics Olympics champion, known for being shy, direct and not very used to social situations.\n\nDuring the date, you arrive at a very busy restaurant. Márcia seems uncomfortable with the number of people and gets quieter than usual. What do you do?", "Host", marciaC7, false, opcoesMarciaFacil, 2));

        List<Opcoes> opcoesGabrielaFacil = List.of(
                new Opcoes(1, "I stop with her to help the dog, looking for a safe way to find its owner or get it somewhere it can receive help.", "Caring", Map.of(gabrielaC7, 20), 1, 0, false),
                new Opcoes(2, "I say it has nothing to do with us and suggest we simply carry on with the date.", "Indifferent", Map.of(gabrielaC7, 0), 1, 0, false),
                new Opcoes(3, "I start making jokes about the situation and say she's overreacting by worrying so much about a stray animal.", "Insensitive", Map.of(gabrielaC7, -20), 1, 2, true)
        );
        falasCena1Facil.add(new Dialogo(6, "Last question, straight to Gabriela's answer key, our easygoing, kind writer who is passionate about literature and animals.\n\nDuring the date, you come across a lost dog on the street. Gabriela immediately shows concern and wants to help the animal. What do you do?", "Host", gabrielaC7, false, opcoesGabrielaFacil, 3));

        List<Opcoes> opcoesP5Facil = List.of(
                new Opcoes(1, "I'm completely honest, own up to my past mistakes maturely and show that I've changed.", "Mature", Map.of(angelaC7, 5, monicaC7, 5, marciaC7, 5, gabrielaC7, 5), 1, 0, false),
                new Opcoes(2, "I lie or change the subject, saying the past is the past, just to avoid exposing myself.", "Evasive", Map.of(angelaC7, -5, monicaC7, -5, marciaC7, -5, gabrielaC7, -5), 1, 2, true),
                new Opcoes(3, "I badmouth my ex, putting all the blame for the breakup on her.", "Resentful", Map.of(angelaC7, -5, monicaC7, -5, marciaC7, -5, gabrielaC7, -5), 1, 2, true)
        );
        falasCena1Facil.add(new Dialogo(7, "PHASE 2: HIS X-RAY (JUDGMENT TIME)\n\nHost: Now the game completely flips! Let's move on to the two questions about our protagonist's behavior and personality.\n\nQuestion number five, about your romantic past. You're on the second date with a girl and she asks you in detail why your last serious relationship ended. What do you do?", "Host", null, false, opcoesP5Facil, 2));

        List<Opcoes> opcoesP6Facil = List.of(
                new Opcoes(1, "I post it proudly, after all if I'm dating someone I have absolutely nothing to hide from the world.", "Proud", Map.of(angelaC7, 20, monicaC7, 20, marciaC7, 20, gabrielaC7, 20), 1, 0, false),
                new Opcoes(2, "I flatly refuse, saying I prefer to keep my love life one hundred percent private and off the internet.", "Private", Map.of(angelaC7, -10, monicaC7, -10, marciaC7, -10, gabrielaC7, -10), 1, 2, true),
                new Opcoes(3, "I stall for weeks and end up posting only to Close Friends on stories, so very few people see it.", "Discreet", Map.of(angelaC7, -10, monicaC7, -10, marciaC7, -10, gabrielaC7, -10), 1, 2, true)
        );
        falasCena1Facil.add(new Dialogo(8, "Host: We've reached the sixth and final question of the game! Decisive for your fate.\n\nYou start dating seriously and your partner asks you to post a photo of the two of you together on your feed to make the relationship official. What is your real attitude?", "Host", null, false, opcoesP6Facil, 2));

        falasCena1Facil.add(new Fala(9, "That's it, folks! We've reached the end of our segment. We'll see you on our next show to follow the outcome of this adventure. See you!", "Host", null, true, -1));

        Cena cena1Facil = new Cena(1, "gabarito_amor_facil", "trilha_decisao.mp3", falasCena1Facil, 2);
        cena1Facil.setIdPrimeiraFala(1);
        cena1Facil.setIdUltimaaFala(9);
        cenasCap7.add(cena1Facil);

        List<Fala> falasCena1Dificil = new ArrayList<>();
        falasCena1Dificil.add(new Fala(1, "Hello! Welcome to another episode of Table for Two. Tonight our show is extra special because it will be you, yes, you in the audience, who will dictate the course of our contestant. Let me present our segment: Love's Answer Key! Roll the jingle!", "Host", null, true, 2));
        falasCena1Dificil.add(new Fala(2, "In this segment, " + prota.getNome() + " will open his heart and answer personal questions asked by our viewers. Will he be able to pass the hardest test of his life: the entrance exam of love?", "Host", null, true, 3));

        List<Opcoes> opcoesAngelaDificil = List.of(
                new Opcoes(1, "I accept the challenge right away! I join in the game and take the chance to show that I like to compete too.", "Competitive", Map.of(angelaC7, 20), 1, 0, false),
                new Opcoes(2, "I refuse immediately and say I have no interest whatsoever in sports or physical activities.", "Uninterested", Map.of(angelaC7, -20), 1, 2, true),
                new Opcoes(3, "I accept the challenge, but I start showing off and turning the competition into something way too serious.", "Show-off", Map.of(angelaC7, -20), 1, 2, true)
        );
        falasCena1Dificil.add(new Dialogo(3, "PHASE 1: THEIR ANSWER KEY (CHEMISTRY) - HARD MODE\n\nQuestion number one, straight to Ângela's answer key, our competitive athlete who loves sports and the outdoors.\n\nÂngela invites you to spend the day on a hiking trail and, halfway through, proposes a challenge: whoever reaches the top of the mountain first. What do you do?", "Host", angelaC7, false, opcoesAngelaDificil, 2));

        List<Opcoes> opcoesMonicaDificil = List.of(
                new Opcoes(1, "I pick a special place and introduce her to a Brazilian dish I think matches her tastes, remembering the things she has told me about herself.", "Thoughtful", Map.of(monicaC7, 20), 1, 0, false),
                new Opcoes(2, "I say any restaurant is fine and let her choose everything on her own, without worrying much.", "Disinterested", Map.of(monicaC7, -20), 1, 2, true),
                new Opcoes(3, "I pick the cheapest restaurant possible and complain about the price whenever she shows interest in trying something.", "Cheapskate", Map.of(monicaC7, -20), 1, 2, true)
        );
        falasCena1Dificil.add(new Dialogo(4, "Second question of this phase, directed to Mônica, our elegant, ironic stylist who is used to a hectic life.\n\nDuring the date, Mônica mentions that she doesn't know Brazilian cuisine very well yet and shows curiosity to try something different. How do you react?", "Host", monicaC7, false, opcoesMonicaDificil, 2));

        List<Opcoes> opcoesMarciaDificil = List.of(
                new Opcoes(1, "I notice the discomfort and calmly ask if she'd prefer to find a more private place, without pressuring her to talk.", "Understanding", Map.of(marciaC7, 20), 1, 0, false),
                new Opcoes(2, "I try to force her to open up by asking lots of questions and telling her she needs to stop being so shy.", "Pushy", Map.of(marciaC7, -20), 1, 2, true),
                new Opcoes(3, "I get irritated by the silence and start complaining that she's making the date awkward and should try harder to talk.", "Impatient", Map.of(marciaC7, -20), 1, 2, true)
        );
        falasCena1Dificil.add(new Dialogo(5, "Now we get to the third question, directed to Márcia, our brilliant Physics Olympics champion, known for being shy, direct and not very used to social situations.\n\nDuring the date, you arrive at a very busy restaurant. Márcia seems uncomfortable with the number of people and gets quieter than usual. What do you do?", "Host", marciaC7, false, opcoesMarciaDificil, 2));

        List<Opcoes> opcoesGabrielaDificil = List.of(
                new Opcoes(1, "I stop with her to help the dog, looking for a safe way to find its owner or get it somewhere it can receive help.", "Caring", Map.of(gabrielaC7, 20), 1, 0, false),
                new Opcoes(2, "I say it has nothing to do with us and suggest we simply carry on with the date.", "Indifferent", Map.of(gabrielaC7, -20), 1, 2, true),
                new Opcoes(3, "I start making jokes about the situation and say she's overreacting by worrying so much about a stray animal.", "Insensitive", Map.of(gabrielaC7, -20), 1, 2, true)
        );
        falasCena1Dificil.add(new Dialogo(6, "Last question, straight to Gabriela's answer key, our easygoing, kind writer who is passionate about literature and animals.\n\nDuring the date, you come across a lost dog on the street. Gabriela immediately shows concern and wants to help the animal. What do you do?", "Host", gabrielaC7, false, opcoesGabrielaDificil, 2));

        List<Opcoes> opcoesP5Dificil = List.of(
                new Opcoes(1, "I'm completely honest, own up to my past mistakes maturely and show that I've changed.", "Mature", Map.of(angelaC7, 5, monicaC7, 5, marciaC7, 5, gabrielaC7, 5), 1, 0, false),
                new Opcoes(2, "I lie or change the subject, saying the past is the past, just to avoid exposing myself.", "Evasive", Map.of(angelaC7, -15, monicaC7, -15, marciaC7, -15, gabrielaC7, -15), 1, 2, true),
                new Opcoes(3, "I badmouth my ex, putting all the blame for the breakup on her.", "Resentful", Map.of(angelaC7, -15, monicaC7, -15, marciaC7, -15, gabrielaC7, -15), 1, 2, true)
        );
        falasCena1Dificil.add(new Dialogo(7, "PHASE 2: HIS X-RAY (JUDGMENT TIME) - HARD MODE\n\nHost: Question number five, about your romantic past. You're on the second date with a girl and she asks you in detail why your last serious relationship ended. What do you do?", "Host", null, false, opcoesP5Dificil, 2));

        List<Opcoes> opcoesP6Dificil = List.of(
                new Opcoes(1, "I post it proudly, after all if I'm dating someone I have absolutely nothing to hide from the world.", "Proud", Map.of(angelaC7, 20, monicaC7, 20, marciaC7, 20, gabrielaC7, 20), 1, 0, false),
                new Opcoes(2, "I flatly refuse, saying I prefer to keep my love life one hundred percent private and off the internet.", "Private", Map.of(angelaC7, -15, monicaC7, -15, marciaC7, -15, gabrielaC7, -15), 1, 2, true),
                new Opcoes(3, "I stall for weeks and end up posting only to Close Friends on stories, so very few people see it.", "Discreet", Map.of(angelaC7, -15, monicaC7, -15, marciaC7, -15, gabrielaC7, -15), 1, 2, true)
        );
        falasCena1Dificil.add(new Dialogo(8, "Host: We've reached the sixth and final question of the game! Decisive for your fate in hard mode.\n\nYou start dating seriously and your partner asks you to post a photo of the two of you together on your feed to make the relationship official. What is your real attitude?", "Host", null, false, opcoesP6Dificil, 2));

        falasCena1Dificil.add(new Fala(9, "That's it, folks! We've reached the end of our segment. We'll see you on our next show to follow the outcome of this adventure. See you!", "Host", null, true, -1));

        Cena cena1Dificil = new Cena(2, "gabarito_amor_dificil", "trilha_decisao.mp3", falasCena1Dificil, 2);
        cena1Dificil.setIdPrimeiraFala(1);
        cena1Dificil.setIdUltimaaFala(9);
        cenasCap7.add(cena1Dificil);

        List<Fala> falasCena2Angela = new ArrayList<>();
        falasCena2Angela.add(new Fala(1, "Phew, the day was extremely draining. If things keep going like this, I might end up making a mistake that makes the audience hate me.", prota.getNome(), null, true, 2));
        falasCena2Angela.add(new Fala(2, "[Ângela grabs an energy drink and sits beside you]\n\nHey... How are you? This show has been a marathon, hasn't it?", "Ângela", null, true, 3));
        falasCena2Angela.add(new Fala(3, "It has... And it seems the more I run, the further I get from the finish line. I don't think I'll please the audience... or any of you. I think I'm going to give up.", prota.getNome(), null, true, 4));
        falasCena2Angela.add(new Fala(4, "Come on! What makes you think that? You've come a long way to get here.", "Ângela", null, true, 5));
        falasCena2Angela.add(new Fala(5, "I don't know... I don't have confidence. I'm feeling pressured and I don't think I'll be able to be a good candidate.", prota.getNome(), null, true, 6));
        falasCena2Angela.add(new Fala(6, "I imagine it's not easy. I used to feel the same way in athletics. The fear of failing was sometimes bigger than the will to keep going.", "Ângela", null, true, 7));
        falasCena2Angela.add(new Fala(7, "[She takes a small pendant from around her neck.]\n\nBut don't think you're already off the track just because you're out of breath.", "Ângela", null, true, 8));
        falasCena2Angela.add(new Fala(8, "[She hands the pendant to him.]\n\nHere. It was my lucky charm in the hardest competitions. Maybe it can work for you too.", "Ângela", null, true, -1));

        Cena cena2Angela = new Cena(3, "cafe_angela", "trilha_emocionante.mp3", falasCena2Angela);
        cena2Angela.setIdPrimeiraFala(1);
        cena2Angela.setIdUltimaaFala(8);
        cenasCap7.add(cena2Angela);

        List<Fala> falasCena2Monica = new ArrayList<>();
        falasCena2Monica.add(new Fala(1, "Phew, the day was extremely draining. If things keep going like this, I might end up making a mistake that makes the audience hate me.", prota.getNome(), null, true, 2));
        falasCena2Monica.add(new Fala(2, "[Mônica walks in, grabs a drink and notices his expression.]\n\nYou look terrible.", "Mônica", null, true, 3));
        falasCena2Monica.add(new Fala(3, "Thanks... I guess.", prota.getNome(), null, true, 4));
        falasCena2Monica.add(new Fala(4, "That wasn't a compliment. But it wasn't a criticism either. It was an observation.", "Mônica", null, true, 5));
        falasCena2Monica.add(new Fala(5, "I'm starting to think I'm not cut out for this. The more I try to please everyone, the more it seems I get everything wrong.", prota.getNome(), null, true, 6));
        falasCena2Monica.add(new Fala(6, "You've only just noticed?", "Mônica", null, true, 7));
        falasCena2Monica.add(new Fala(7, "Wow, thanks for the support.", prota.getNome(), null, true, 8));
        falasCena2Monica.add(new Fala(8, "I'm trying to help. But you're doing something very dangerous.", "Mônica", null, true, 9));
        falasCena2Monica.add(new Fala(9, "What?", prota.getNome(), null, true, 10));
        falasCena2Monica.add(new Fala(10, "You're trying to figure out what everyone wants you to be.", "Mônica", null, true, 11));
        falasCena2Monica.add(new Fala(11, "And what's the problem with that?", prota.getNome(), null, true, 12));
        falasCena2Monica.add(new Fala(12, "That, in the end, you might not know who you are anymore.", "Mônica", null, true, 13));
        falasCena2Monica.add(new Fala(13, "[She takes a small box out of her bag.]", "Narrator", null, true, 14));
        falasCena2Monica.add(new Fala(14, "What's that?", prota.getNome(), null, true, 15));
        falasCena2Monica.add(new Fala(15, "Open it.", "Mônica", null, true, 16));
        falasCena2Monica.add(new Fala(16, "[He opens the box and finds an elegant pen.]", "Narrator", null, true, 17));
        falasCena2Monica.add(new Fala(17, "I got it when I started working in Italy. I always used it to sketch my first ideas.", "Mônica", null, true, 18));
        falasCena2Monica.add(new Fala(18, "You're giving this to me?", prota.getNome(), null, true, 19));
        falasCena2Monica.add(new Fala(19, "I am. Maybe you need to start writing your own story instead of trying to follow the script they expect from you.", "Mônica", null, true, 20));
        falasCena2Monica.add(new Fala(20, "That was... surprisingly deep.", prota.getNome(), null, true, 21));
        falasCena2Monica.add(new Fala(21, "Don't get used to it.", "Mônica", null, true, -1));

        Cena cena2Monica = new Cena(4, "cafe_monica", "trilha_emocionante.mp3", falasCena2Monica);
        cena2Monica.setIdPrimeiraFala(1);
        cena2Monica.setIdUltimaaFala(21);
        cenasCap7.add(cena2Monica);

        List<Fala> falasCena2Marcia = new ArrayList<>();
        falasCena2Marcia.add(new Fala(1, "[Márcia appears at the entrance. She hesitates for a few seconds before approaching.]\n\nCan I... sit here?", "Márcia", null, true, 2));
        falasCena2Marcia.add(new Fala(2, "Of course.", prota.getNome(), null, true, 3));
        falasCena2Marcia.add(new Fala(3, "[She sits down, keeping some distance. The two stay silent for a few seconds.]\n\nLast time. You don't have to say anything.", prota.getNome(), null, true, 4));
        falasCena2Marcia.add(new Fala(4, "I know.", "Márcia", null, true, 5));
        falasCena2Marcia.add(new Fala(5, "[A few more seconds of silence.]\n\nI think I'm going to quit.", prota.getNome(), null, true, 6));
        falasCena2Marcia.add(new Fala(6, "Why?", "Márcia", null, true, 7));
        falasCena2Marcia.add(new Fala(7, "Because I'm tired of feeling like I'm being evaluated all the time. It feels like anything I do could be the reason someone doesn't like me.", prota.getNome(), null, true, 8));
        falasCena2Marcia.add(new Fala(8, "I know that feeling.", "Márcia", null, true, 9));
        falasCena2Marcia.add(new Fala(9, "You do?", prota.getNome(), null, true, 10));
        falasCena2Marcia.add(new Fala(10, "Feeling like everyone is waiting for you to make a mistake.", "Márcia", null, true, 11));
        falasCena2Marcia.add(new Fala(11, "[She takes a small metal bookmark out of her bag.]\n\nThis is mine.", "Márcia", null, true, 12));
        falasCena2Marcia.add(new Fala(12, "A bookmark?", prota.getNome(), null, true, 13));
        falasCena2Marcia.add(new Fala(13, "I use it when I'm studying. There's a phrase on the back.", "Márcia", null, true, 14));
        falasCena2Marcia.add(new Fala(14, "[He turns the bookmark over.]\n\n\"One mistake doesn't invalidate the whole equation.\"", prota.getNome(), null, true, 15));
        falasCena2Marcia.add(new Fala(15, "I know it sounds silly.", "Márcia", null, true, 16));
        falasCena2Marcia.add(new Fala(16, "It doesn't.", prota.getNome(), null, true, 17));
        falasCena2Marcia.add(new Fala(17, "Then keep it.", "Márcia", null, true, 18));
        falasCena2Marcia.add(new Fala(18, "Are you sure?", prota.getNome(), null, true, 19));
        falasCena2Marcia.add(new Fala(19, "I am.", "Márcia", null, true, 20));
        falasCena2Marcia.add(new Fala(20, "[She looks away, a little embarrassed.]\n\nYou're going to need it more than I do today.", "Márcia", null, true, -1));

        Cena cena2Marcia = new Cena(5, "cafe_marcia", "trilha_emocionante.mp3", falasCena2Marcia);
        cena2Marcia.setIdPrimeiraFala(1);
        cena2Marcia.setIdUltimaaFala(20);
        cenasCap7.add(cena2Marcia);

        List<Fala> falasCena2Gabriela = new ArrayList<>();
        falasCena2Gabriela.add(new Fala(1, "[Gabriela walks in and sits beside him.]\n\nDo you know what's curious?", "Gabriela", null, true, 2));
        falasCena2Gabriela.add(new Fala(2, "What?", prota.getNome(), null, true, 3));
        falasCena2Gabriela.add(new Fala(3, "We spent the whole day trying to figure out who matches with whom through questions.", "Gabriela", null, true, 4));
        falasCena2Gabriela.add(new Fala(4, "Yeah... it's part of the show.", prota.getNome(), null, true, 5));
        falasCena2Gabriela.add(new Fala(5, "I know... but I find it funny to think that six answers can decide whether someone deserves a second chance or not.", "Gabriela", null, true, 6));
        falasCena2Gabriela.add(new Fala(6, "I'm starting to think all my answers were wrong.", prota.getNome(), null, true, 7));
        falasCena2Gabriela.add(new Fala(7, "Maybe they just didn't manage to show who you are.", "Gabriela", null, true, 8));
        falasCena2Gabriela.add(new Fala(8, "What if I'm really not interesting enough?", prota.getNome(), null, true, 9));
        falasCena2Gabriela.add(new Fala(9, "Then you'll spend the rest of your life trying to be interesting to people who might not even like you.", "Gabriela", null, true, 10));
        falasCena2Gabriela.add(new Fala(10, "[She smiles slightly.]\n\nMaybe the problem is that you're trying to answer the right answer key.", "Gabriela", null, true, 11));
        falasCena2Gabriela.add(new Fala(11, "Isn't that what the show wants?", prota.getNome(), null, true, 12));
        falasCena2Gabriela.add(new Fala(12, "The show does. I don't.", "Gabriela", null, true, 13));
        falasCena2Gabriela.add(new Fala(13, "[She takes a small notebook out of her bag.]", "Narrator", null, true, 14));
        falasCena2Gabriela.add(new Fala(14, "What's that?", prota.getNome(), null, true, 15));
        falasCena2Gabriela.add(new Fala(15, "My first storybook.", "Gabriela", null, true, 16));
        falasCena2Gabriela.add(new Fala(16, "You wrote this?", prota.getNome(), null, true, 17));
        falasCena2Gabriela.add(new Fala(17, "A long time ago. I used to write when I couldn't explain what I was feeling.", "Gabriela", null, true, 18));
        falasCena2Gabriela.add(new Fala(18, "[She hands the notebook to him.]", "Narrator", null, true, 19));
        falasCena2Gabriela.add(new Fala(19, "Why are you giving it to me?", prota.getNome(), null, true, 20));
        falasCena2Gabriela.add(new Fala(20, "Because maybe you also need a place where there are no right or wrong answers.", "Gabriela", null, true, 21));
        falasCena2Gabriela.add(new Fala(21, "This is important to you.", prota.getNome(), null, true, 22));
        falasCena2Gabriela.add(new Fala(22, "Yes.", "Gabriela", null, true, 23));
        falasCena2Gabriela.add(new Fala(23, "[She smiles.]\n\nThat's why I'm trusting you to take care of it.", "Gabriela", null, true, -1));

        Cena cena2Gabriela = new Cena(6, "cafe_gabriela", "trilha_emocionante.mp3", falasCena2Gabriela);
        cena2Gabriela.setIdPrimeiraFala(1);
        cena2Gabriela.setIdUltimaaFala(23);
        cenasCap7.add(cena2Gabriela);

        Capitulo capitulo7 = new Capitulo(7, "The Answer Key to Love", 1, 6, cenasCap7);
        bancoDeCapitulos.put(7, capitulo7);
    }

    private void carregarCapitulo8() {
        List<Cena> cenasCap8 = new ArrayList<>();

        List<Fala> falasCena1 = new ArrayList<>();
        falasCena1.add(new Fala(1, "Hello, viewers! Welcome to Table for Two Breaking News, your news channel for the most famous romance reality show in recent times.", "Host", null, true, 2));
        falasCena1.add(new Fala(2, "In today's newscast, we have updates on our contestants, news about their careers and, of course, an exclusive piece of information that promises to shake up the backstage of the show.", "Host", null, true, 3));
        falasCena1.add(new Fala(3, "To begin with, let's reveal the whereabouts of our girls.", "Host", null, true, 4));
        falasCena1.add(new Fala(4, "Ângela has just taken the job of coach of the junior swimming team. Although we don't know the new competitors yet, one thing is certain: she intends to train them to reach the top.", "Host", null, true, 5));
        falasCena1.add(new Fala(5, "Contestant Gabriela will be at the Municipal Literary Fair. She will be in a reading circle reading classics by Jorge Amado. Among the selected works will be the book “Gabriela” that inspired her name.", "Host", null, true, 6));
        falasCena1.add(new Fala(6, "Mônica will be at Fashion Week, unveiling a preview of her collection called “Brazilianness”, which promises to revolutionize world fashion.", "Host", null, true, 7));
        falasCena1.add(new Fala(7, "And Marcia will be at the opening of the +Physics event, where she will present her paper on the future of quantum physics.", "Host", null, true, -1));

        Cena cena1 = new Cena(1, "plantao_noticias", "trilha_noticiario.mp3", falasCena1, 2);
        cena1.setIdPrimeiraFala(1);
        cena1.setIdUltimaaFala(7);
        cenasCap8.add(cena1);

        List<Fala> falasCena2Angela = new ArrayList<>();
        falasCena2Angela.add(new Fala(1, "Besides this news, we received a shocking scoop. Contestant Ângela appeared on the morning show Coffee Aroma making controversial claims involving our protagonist! About " + prota.getNome() + ", she said:\n\n\"He said he liked competition, but when he realized he couldn't keep up with my pace, he started acting as if competing with me was a bad thing.\"", "Host", null, true, 2));
        falasCena2Angela.add(new Fala(2, "With that news we end our breaking news segment. Be sure to follow us on social media for more. See you soon!", "Host", null, true, 3));
        falasCena2Angela.add(new Fala(3, "The player picks up the phone to reply to viewers' comments and try to smooth over the situation on social media.", "System", null, true, -1));

        Cena cena2Angela = new Cena(2, "plantao_fofoca", "trilha_tenso.mp3", falasCena2Angela, 6);
        cena2Angela.setIdPrimeiraFala(1);
        cena2Angela.setIdUltimaaFala(3);
        cenasCap8.add(cena2Angela);

        List<Fala> falasCena2Monica = new ArrayList<>();
        falasCena2Monica.add(new Fala(1, "Besides this news, we received a shocking scoop. Contestant Mônica appeared on the morning show Coffee Aroma making controversial claims involving our protagonist! About " + prota.getNome() + ", she said:\n\n\"He seemed interested in me during the show, but later I realized everything seemed very calculated. He only showed interest when he knew it could raise his score.\"", "Host", null, true, 2));
        falasCena2Monica.add(new Fala(2, "With that news we end our breaking news segment. Be sure to follow us on social media for more. See you soon!", "Host", null, true, 3));
        falasCena2Monica.add(new Fala(3, "The player picks up the phone to reply to viewers' comments and try to smooth over the situation on social media.", "System", null, true, -1));

        Cena cena2Monica = new Cena(3, "plantao_fofoca", "trilha_tenso.mp3", falasCena2Monica, 6);
        cena2Monica.setIdPrimeiraFala(1);
        cena2Monica.setIdUltimaaFala(3);
        cenasCap8.add(cena2Monica);

        List<Fala> falasCena2Gabriela = new ArrayList<>();
        falasCena2Gabriela.add(new Fala(1, "Besides this news, we received a shocking scoop. Contestant Gabriela appeared on the morning show Coffee Aroma making controversial claims involving our protagonist! About " + prota.getNome() + ", she said:\n\n\"He knew exactly what to say to seem like a kind and sensitive person. After a while, I started to wonder whether he really thought that or was just saying what I wanted to hear.\"", "Host", null, true, 2));
        falasCena2Gabriela.add(new Fala(2, "With that news we end our breaking news segment. Be sure to follow us on social media for more. See you soon!", "Host", null, true, 3));
        falasCena2Gabriela.add(new Fala(3, "The player picks up the phone to reply to viewers' comments and try to smooth over the situation on social media.", "System", null, true, -1));

        Cena cena2Gabriela = new Cena(4, "plantao_fofoca", "trilha_tenso.mp3", falasCena2Gabriela, 6);
        cena2Gabriela.setIdPrimeiraFala(1);
        cena2Gabriela.setIdUltimaaFala(3);
        cenasCap8.add(cena2Gabriela);

        List<Fala> falasCena2Marcia = new ArrayList<>();
        falasCena2Marcia.add(new Fala(1, "Besides this news, we received a shocking scoop. Contestant Márcia appeared on the morning show Coffee Aroma making controversial claims involving our protagonist! About " + prota.getNome() + ", she said:\n\n\"He said he respected my space, but I felt he was always expecting something from me. Sometimes it seemed my silence bothered him.\"", "Host", null, true, 2));
        falasCena2Marcia.add(new Fala(2, "With that news we end our breaking news segment. Be sure to follow us on social media for more. See you soon!", "Host", null, true, 3));
        falasCena2Marcia.add(new Fala(3, "The player picks up the phone to reply to viewers' comments and try to smooth over the situation on social media.", "System", null, true, -1));

        Cena cena2Marcia = new Cena(5, "plantao_fofoca", "trilha_tenso.mp3", falasCena2Marcia, 6);
        cena2Marcia.setIdPrimeiraFala(1);
        cena2Marcia.setIdUltimaaFala(3);
        cenasCap8.add(cena2Marcia);

        List<Fala> falasCena3 = new ArrayList<>();
        falasCena3.add(new Fala(1, "After the broadcast I can't stop getting notifications… if I can't manage this I'm doomed.", prota.getNome(), null, true, 2));
        falasCena3.add(new Fala(2, "On the phone:\n\n- Show notifications...", "System", null, true, 3));
        falasCena3.add(new Fala(3, "It seems everyone has something to say. Better think carefully before replying…", prota.getNome(), null, true, 4));

        List<Opcoes> opcoesP1 = List.of(
                new Opcoes(1, "\"She is clearly trying to hurt me because she didn't accept being eliminated. I won't take someone like that seriously.\"", "Defensive", Map.of(), 1, -4, false),
                new Opcoes(2, "\"I understand she felt that way. I can explain my side, but I don't want to turn this into a fight.\"", "Diplomatic", Map.of(), 1, 2, false),
                new Opcoes(3, "\"I don't think I need to keep justifying myself. Those who watched the show can draw their own conclusions.\"", "Neutral", Map.of(), 1, 0, false),
                new Opcoes(4, "\"If she didn't like me, that's her problem. I won't waste my time trying to please anyone.\"", "Arrogant", Map.of(), 1, -2, false)
        );
        falasCena3.add(new Dialogo(4, "AUDIENCE COMMENT:\n\n\"After hearing what she said, don't you think you should explain yourself better? After all, the image she painted of you wasn't very good.\"", "Audience", null, false, opcoesP1, 0));

        List<Opcoes> opcoesP2 = List.of(
                new Opcoes(1, "\"I'd rather not answer. Some things that happened between us should stay between us.\"", "Reserved", Map.of(), 1, 0, false),
                new Opcoes(2, "\"If I were faking it, I would probably have picked someone much easier to win over.\"", "Ironic", Map.of(), 1, -2, false),
                new Opcoes(3, "\"She's saying that because she couldn't win. It's very convenient to call me fake after she left.\"", "Aggressive", Map.of(), 1, -4, false),
                new Opcoes(4, "\"I was here to meet someone, so of course I thought about the game. But that doesn't mean my feelings were fake.\"", "Sincere", Map.of(), 1, 2, false)
        );
        falasCena3.add(new Dialogo(5, "AUDIENCE COMMENT:\n\n\"She said you were only faking interest to stay on the show. Did you really like her or were you just playing the game?\"", "Audience", null, false, opcoesP2, 0));

        Secundario monicaC8 = new Secundario("Mônica", 2, 30, 10);
        List<Opcoes> opcoesP3 = List.of(
                new Opcoes(1, "“I don't know if I'd adapt completely, but I think I could learn to keep up with her pace.”", "Determined", Map.of(monicaC8, 2), 1, 0, false),
                new Opcoes(2, "“I'd love to get to know that side of her life and discover new places and experiences by her side.”", "Enthusiastic", Map.of(monicaC8, 4), 1, 0, false),
                new Opcoes(3, "“I think each of us can keep living in our own way, even in a relationship.”", "Independent", Map.of(monicaC8, 0), 1, 0, false),
                new Opcoes(4, "“She seems to live too busy a life. Maybe she'd need to slow down before thinking about a relationship.”", "Critical", Map.of(monicaC8, -2), 1, 0, false)
        );
        falasCena3.add(new Dialogo(6, "“Mônica has traveled the world and has a very busy routine. Do you think you could adapt to her lifestyle?”", "Audience", null, false, opcoesP3, 4));

        Secundario angelaC8 = new Secundario("Ângela", 1, 30, 6);
        List<Opcoes> opcoesP4 = List.of(
                new Opcoes(1, "“Maybe I won't always keep up, but I like people who challenge me to step out of my comfort zone.”", "Challenging", Map.of(angelaC8, 4), 1, 0, false),
                new Opcoes(2, "“I would try to keep up. I think it would be fun to live those experiences with her.”", "Having fun", Map.of(angelaC8, 2), 1, 0, false),
                new Opcoes(3, "“I don't know if I could keep up, but I don't see that as a problem either.”", "Neutral", Map.of(angelaC8, 0), 1, 0, false),
                new Opcoes(4, "“Honestly, I think she should learn to tone down that competitive spirit a bit.”", "Discouraged", Map.of(angelaC8, -2), 1, 0, false)
        );
        falasCena3.add(new Dialogo(7, "“Ângela is known for her competitive spirit. Do you think you could keep up with her pace?”", "Audience", null, false, opcoesP4, 4));

        Secundario marciaC8 = new Secundario("Márcia", 3, 30, 8);
        List<Opcoes> opcoesP5 = List.of(
                new Opcoes(1, "“I would try to help her loosen up, even if I had to insist a little.”", "Insistent", Map.of(marciaC8, -2), 1, 0, false),
                new Opcoes(2, "“I would respect her way of being and let her feel comfortable opening up at her own pace.”", "Respectful", Map.of(marciaC8, 4), 1, 0, false),
                new Opcoes(3, "“I think I'd need some time to better understand how she likes to interact.”", "Cautious", Map.of(marciaC8, 2), 1, 0, false),
                new Opcoes(4, "“I don't mind.”", "Indifferent", Map.of(marciaC8, 0), 1, 0, false)
        );
        falasCena3.add(new Dialogo(8, "“Márcia is a more reserved person and doesn't seem very comfortable in social situations. How would you deal with that?”", "Audience", null, false, opcoesP5, 1));

        Secundario gabrielaC8 = new Secundario("Gabriela", 4, 30, 4);
        List<Opcoes> opcoesP6 = List.of(
                new Opcoes(1, "“I think so. I like people who can turn simple things into special moments.”", "Romantic", Map.of(gabrielaC8, 4), 1, 0, false),
                new Opcoes(2, "“I'd try to get to know that side of her better. I think we have a lot to discover about each other.”", "Curious", Map.of(gabrielaC8, 2), 1, 0, false),
                new Opcoes(3, "“I don't know if we have exactly the same way of being, but I believe differences can work too.”", "Pragmatic", Map.of(gabrielaC8, 0), 1, 0, false),
                new Opcoes(4, "“I think she takes some simple things too seriously. I probably wouldn't have much patience for that.”", "Impatient", Map.of(gabrielaC8, -2), 1, 0, false)
        );
        falasCena3.add(new Dialogo(9, "“Gabriela is known for being easygoing, passionate about literature and animals. Do you think you could keep up with such a light and yet deep way of seeing life?”", "Audience", null, false, opcoesP6, 4));

        falasCena3.add(new Fala(10, "I hope these answers don't make things worse… I'd better go to sleep and get ready for the show's finale.", prota.getNome(), null, true, -1));

        Cena cena3 = new Cena(6, "quarto_protagonista", "trilha_calma.mp3", falasCena3);
        cena3.setIdPrimeiraFala(1);
        cena3.setIdUltimaaFala(10);
        cenasCap8.add(cena3);

        Capitulo capitulo8 = new Capitulo(8, "Table for Two Breaking News", 1, 6, cenasCap8);
        bancoDeCapitulos.put(8, capitulo8);
    }

    private void carregarCapitulo9() {
        List<Cena> cenasCap9 = new ArrayList<>();

        List<Fala> falasCena1 = new ArrayList<>();
        falasCena1.add(new Fala(1, "Hello, Table for Two fans! We've finally reached the most anticipated moment: the grand finale!\n\nToday, our contestants will give their final thoughts on our protagonist.", "Host", null, true, 2));
        falasCena1.add(new Fala(2, "But pay attention: at this moment, each contestant will be free to decide whether she wants to continue in this story or press the quit button.\n\nAnyway, let's begin our girls' final remarks!", "Host", null, true, 3));

        falasCena1.add(new Fala(3, "“Taking part in Table for Two was an experience unlike anything I've ever lived. I had fun moments, met incredible people and I leave here taking many experiences with me. But I think some things could have been better along my journey.”", "Ângela", null, true, 4));
        falasCena1.add(new Fala(4, "“Taking part in Table for Two was a very different experience from what I imagined. At first, I treated everything almost like a competition, but over time I realized I was living something that went far beyond that. I think this was one of the most remarkable experiences I've ever had.”", "Ângela", null, true, 5));

        falasCena1.add(new Fala(5, "“I confess that joining a reality show like this was a curious experience. I met different people, lived situations I probably wouldn't have lived outside here and even had a few surprises along the way. In the end, I think my journey could have been a bit more interesting.”", "Mônica", null, true, 6));
        falasCena1.add(new Fala(6, "“I didn't know exactly what to expect when I joined the show. Between dates, challenges and some unexpected situations, I ended up finding much more inspiration than I imagined. I think I'll carry good memories of this experience, both personally and professionally.”", "Mônica", null, true, 7));

        falasCena1.add(new Fala(7, "“When I came in here, I thought it would be hard to deal with so many people and all this exposure. I think my expectations weren't completely wrong. It was a complicated experience at times and I don't know if I would do it all again.”", "Márcia", null, true, 8));
        falasCena1.add(new Fala(8, "“When I joined the show, I was sure it would be a waste of time. But, looking at everything now, I realize I was wrong. I ended up facing situations I would normally avoid and discovered that maybe I can adapt better than I imagined.”", "Márcia", null, true, 9));

        falasCena1.add(new Fala(9, "“I think this experience had good chapters and others I'd rather rewrite. I met interesting people and lived situations that will probably make for a few stories in the future. But not every story needs to have the ending we imagine.”", "Gabriela", null, true, 10));
        falasCena1.add(new Fala(10, "“If I had to turn this experience into a book, it would probably be one of those you can't put down until the last chapter. There were so many events, some surprises and, above all, stories I'll keep with me after all this is over.”", "Gabriela", null, true, 11));

        falasCena1.add(new Fala(11, "Those were our girls' final remarks.\n\nNow it's time for you to make the final decision!\n\nAfter the commercials, we'll find out who will stay by " + prota.getNome() + "'s side and who decided to leave this story behind. Don't go anywhere! See you soon!", "Host", null, true, -1));

        Cena cena1 = new Cena(1, "palco_final", "trilha_final.mp3", falasCena1);
        cena1.setIdPrimeiraFala(1);
        cena1.setIdUltimaaFala(11);
        cenasCap9.add(cena1);

        Capitulo capitulo9 = new Capitulo(9, "The Grand Finale", 1, 1, cenasCap9);
        bancoDeCapitulos.put(9, capitulo9);
    }

    private void carregarCapitulo10() {
        List<Cena> cenasCap10 = new ArrayList<>();

        List<Fala> falasCenaA = new ArrayList<>();
        falasCenaA.add(new Fala(1, "Hello, viewers! The show Table for Two has finally reached its grand finale! That's right, tonight our contestants will choose whether or not to embark on this romance.", "Host", null, true, 2));
        falasCenaA.add(new Fala(2, "To do so, they will choose between pressing the quit button or getting involved with our protagonist " + prota.getNome() + ".", "Host", null, true, 3));
        falasCenaA.add(new Fala(3, "Tell me, how are your expectations for this big moment?", "Host", null, true, 4));

        List<Opcoes> opcoesExpectativaA = List.of(
                new Opcoes(1, "“I'm excited. I believe I made a good impression.”", "Excited", Map.of(), 1, 0, false),
                new Opcoes(2, "“I'm apprehensive, I feel I could have done better in the show.”", "Apprehensive", Map.of(), 1, 0, false)
        );
        falasCenaA.add(new Dialogo(4, "Choose your expectation:", "System", null, false, opcoesExpectativaA, 0));

        falasCenaA.add(new Fala(5, "Okay, let's see now what the girls think about it.\n\nAfter the countdown, press the button or don't. 1, 2, 3 and…..go\n\n*Angela presses the button*", "Host", null, true, 6));
        falasCenaA.add(new Fala(6, "Look at that! It seems " + prota.getNome() + " got a match with contestant Ângela…\n\nTell us, dear, what motivated your choice?", "Host", null, true, 7));
        falasCenaA.add(new Fala(7, "“You kept up with my pace in a way I didn't expect. I had moments I'll carry with me, and I realized I like having you around. I still want to live a lot by your side and find out how far this story can go.”", "Ângela", null, true, 8));
        falasCenaA.add(new Fala(8, "Wonderful! And you, " + prota.getNome() + ", what do you think?", "Host", null, true, 9));

        List<Opcoes> opcoesRespostaA = List.of(
                new Opcoes(1, "“It was exactly what I expected. Our connection throughout the show was evident and I feel the dates will be promising.”", "Confident", Map.of(), 1, 0, false),
                new Opcoes(2, "“It wasn't what I expected, but I believe we can make a great pair.”", "Pragmatic", Map.of(), 1, 0, false)
        );
        falasCenaA.add(new Dialogo(9, "Choose your answer:", "System", null, false, opcoesRespostaA, 0));

        falasCenaA.add(new Fala(10, "How wonderful! Thank you so much for taking part! You have just won a luxury reservation at the restaurant The Taste of Love in Italy! That's right! I hope you enjoy the trip to build a good relationship and sightsee a lot!\n\nAnyway, I thank the audience for your attention… be sure to follow us in the next editions! See you!", "Host", null, true, -1));

        Cena cenaA = new Cena(1, "final_angela", "trilha_vitoria.mp3", falasCenaA);
        cenaA.setIdPrimeiraFala(1);
        cenaA.setIdUltimaaFala(10);
        cenasCap10.add(cenaA);

        List<Fala> falasCenaB = new ArrayList<>();
        falasCenaB.add(new Fala(1, "Hello, viewers! The show Table for Two has finally reached its grand finale! That's right, tonight our contestants will choose whether or not to embark on this romance.", "Host", null, true, 2));
        falasCenaB.add(new Fala(2, "To do so, they will choose between pressing the quit button or getting involved with our protagonist " + prota.getNome() + ".", "Host", null, true, 3));
        falasCenaB.add(new Fala(3, "Tell me, how are your expectations for this big moment?", "Host", null, true, 4));

        List<Opcoes> opcoesExpectativaB = List.of(
                new Opcoes(1, "“I'm excited. I believe I made a good impression.”", "Excited", Map.of(), 1, 0, false),
                new Opcoes(2, "“I'm apprehensive, I feel I could have done better in the show.”", "Apprehensive", Map.of(), 1, 0, false)
        );
        falasCenaB.add(new Dialogo(4, "Choose your expectation:", "System", null, false, opcoesExpectativaB, 0));

        falasCenaB.add(new Fala(5, "Okay, let's see now what the girls think about it.\n\nAfter the countdown, press the button or don't. 1, 2, 3 and…..go\n\n*Marcia presses the button*", "Host", null, true, 6));
        falasCenaB.add(new Fala(6, "Look at that! It seems " + prota.getNome() + " got a match with contestant Marcia…\n\nTell us, dear, what motivated your choice?", "Host", null, true, 7));
        falasCenaB.add(new Fala(7, "“I'm not very good at talking about what I feel. But with you, I realized I can feel comfortable being myself. I like your company and I want to keep discovering what exists between us.\n\nYou kept up with my pace in a way I didn't expect. I had moments I'll carry with me, and I realized I like having you around. I still want to live a lot by your side and find out how far this story can go.”", "Márcia", null, true, 8));
        falasCenaB.add(new Fala(8, "Wonderful! And you, " + prota.getNome() + ", what do you think?", "Host", null, true, 9));

        List<Opcoes> opcoesRespostaB = List.of(
                new Opcoes(1, "“It was exactly what I expected. Our connection throughout the show was evident and I feel the dates will be promising.”", "Confident", Map.of(), 1, 0, false),
                new Opcoes(2, "“It wasn't what I expected, but I believe we can make a great pair.”", "Pragmatic", Map.of(), 1, 0, false)
        );
        falasCenaB.add(new Dialogo(9, "Choose your answer:", "System", null, false, opcoesRespostaB, 0));

        falasCenaB.add(new Fala(10, "How wonderful! Thank you so much for taking part! You have just won a luxury reservation at the restaurant The Taste of Love in Italy! That's right! I hope you enjoy the trip to build a good relationship and sightsee a lot!\n\nAnyway, I thank the audience for your attention… be sure to follow us in the next editions! See you!", "Host", null, true, -1));

        Cena cenaB = new Cena(2, "final_marcia", "trilha_vitoria.mp3", falasCenaB);
        cenaB.setIdPrimeiraFala(1);
        cenaB.setIdUltimaaFala(10);
        cenasCap10.add(cenaB);

        List<Fala> falasCenaC = new ArrayList<>();
        falasCenaC.add(new Fala(1, "Hello, viewers! The show Table for Two has finally reached its grand finale! That's right, tonight our contestants will choose whether or not to embark on this romance.", "Host", null, true, 2));
        falasCenaC.add(new Fala(2, "To do so, they will choose between pressing the quit button or getting involved with our protagonist " + prota.getNome() + ".", "Host", null, true, 3));
        falasCenaC.add(new Fala(3, "Tell me, how are your expectations for this big moment?", "Host", null, true, 4));

        List<Opcoes> opcoesExpectativaC = List.of(
                new Opcoes(1, "“I'm excited. I believe I made a good impression.”", "Excited", Map.of(), 1, 0, false),
                new Opcoes(2, "“I'm apprehensive, I feel I could have done better in the show.”", "Apprehensive", Map.of(), 1, 0, false)
        );
        falasCenaC.add(new Dialogo(4, "Choose your expectation:", "System", null, false, opcoesExpectativaC, 0));

        falasCenaC.add(new Fala(5, "Okay, let's see now what the girls think about it.\n\nAfter the countdown, press the button or don't. 1, 2, 3 and…..go\n\n*Gabriela presses the button*", "Host", null, true, 6));
        falasCenaC.add(new Fala(6, "Look at that! It seems " + prota.getNome() + " got a match with contestant Gabriela…\n\nTell us, dear, what motivated your choice?", "Host", null, true, 7));
        falasCenaC.add(new Fala(7, "“I think some people appear in our lives and end up leaving a story we don't want to end. You became someone important to me, and I like what we've built together. I want to find out what the next chapters of this story will be.”", "Gabriela", null, true, 8));
        falasCenaC.add(new Fala(8, "Wonderful! And you, " + prota.getNome() + ", what do you think?", "Host", null, true, 9));

        List<Opcoes> opcoesRespostaC = List.of(
                new Opcoes(1, "“It was exactly what I expected. Our connection throughout the show was evident and I feel the dates will be promising.”", "Confident", Map.of(), 1, 0, false),
                new Opcoes(2, "“It wasn't what I expected, but I believe we can make a great pair.”", "Pragmatic", Map.of(), 1, 0, false)
        );
        falasCenaC.add(new Dialogo(9, "Choose your answer:", "System", null, false, opcoesRespostaC, 0));

        falasCenaC.add(new Fala(10, "How wonderful! Thank you so much for taking part! You have just won a luxury reservation at the restaurant The Taste of Love in Italy! That's right! I hope you enjoy the trip to build a good relationship and sightsee a lot!\n\nAnyway, I thank the audience for your attention… be sure to follow us in the next editions! See you!", "Host", null, true, -1));

        Cena cenaC = new Cena(3, "final_gabriela", "trilha_vitoria.mp3", falasCenaC);
        cenaC.setIdPrimeiraFala(1);
        cenaC.setIdUltimaaFala(10);
        cenasCap10.add(cenaC);

        List<Fala> falasCenaD = new ArrayList<>();
        falasCenaD.add(new Fala(1, "Hello, viewers! The show Table for Two has finally reached its grand finale! That's right, tonight our contestants will choose whether or not to embark on this romance.", "Host", null, true, 2));
        falasCenaD.add(new Fala(2, "To do so, they will choose between pressing the quit button or getting involved with our protagonist " + prota.getNome() + ".", "Host", null, true, 3));
        falasCenaD.add(new Fala(3, "Tell me, how are your expectations for this big moment?", "Host", null, true, 4));

        List<Opcoes> opcoesExpectativaD = List.of(
                new Opcoes(1, "“I'm excited. I believe I made a good impression.”", "Excited", Map.of(), 1, 0, false),
                new Opcoes(2, "“I'm apprehensive, I feel I could have done better in the show.”", "Apprehensive", Map.of(), 1, 0, false)
        );
        falasCenaD.add(new Dialogo(4, "Choose your expectation:", "System", null, false, opcoesExpectativaD, 0));

        falasCenaD.add(new Fala(5, "Okay, let's see now what the girls think about it.\n\nAfter the countdown, press the button or don't. 1, 2, 3 and…..go\n\n*Mônica presses the button*", "Host", null, true, 6));
        falasCenaD.add(new Fala(6, "Look at that! It seems " + prota.getNome() + " got a match with contestant Mônica…\n\nTell us, dear, what motivated your choice?", "Host", null, true, 7));
        falasCenaD.add(new Fala(7, "“I don't usually open up easily, and I think you managed to get closer to me than I imagined. I like our relationship, the things we discovered together and, above all, who I am when I'm with you. I want to keep living this.”", "Mônica", null, true, 8));
        falasCenaD.add(new Fala(8, "Wonderful! And you, " + prota.getNome() + ", what do you think?", "Host", null, true, 9));

        List<Opcoes> opcoesRespostaD = List.of(
                new Opcoes(1, "“It was exactly what I expected. Our connection throughout the show was evident and I feel the dates will be promising.”", "Confident", Map.of(), 1, 0, false),
                new Opcoes(2, "“It wasn't what I expected, but I believe we can make a great pair.”", "Pragmatic", Map.of(), 1, 0, false)
        );
        falasCenaD.add(new Dialogo(9, "Choose your answer:", "System", null, false, opcoesRespostaD, 0));

        falasCenaD.add(new Fala(10, "How wonderful! Thank you so much for taking part! You have just won a luxury reservation at the restaurant The Taste of Love in Italy! That's right! I hope you enjoy the trip to build a good relationship and sightsee a lot!\n\nAnyway, I thank the audience for your attention… be sure to follow us in the next editions! See you!", "Host", null, true, -1));

        Cena cenaD = new Cena(4, "final_monica", "trilha_vitoria.mp3", falasCenaD);
        cenaD.setIdPrimeiraFala(1);
        cenaD.setIdUltimaaFala(10);
        cenasCap10.add(cenaD);

        List<Fala> falasCenaE = new ArrayList<>();
        falasCenaE.add(new Fala(1, "[SPECIAL BREAKING NEWS]\n\nHello, viewers.", "Host", null, true, 2));
        falasCenaE.add(new Fala(2, "We interrupt our programming to bring an unexpected piece of news about the future of Table for Two.", "Host", null, true, 3));
        falasCenaE.add(new Fala(3, "Unfortunately, despite all the production team's efforts, the show failed to reach the expected ratings this season.", "Host", null, true, 4));
        falasCenaE.add(new Fala(4, "After a significant drop in public interest, the production team made a difficult decision:\n\nTable for Two is officially canceled before the grand finale.", "Host", null, true, 5));
        falasCenaE.add(new Fala(5, prota.getNome() + "'s performance and attitude throughout the show ended up contributing to the viewers' loss of interest.", "Host", null, true, 6));
        falasCenaE.add(new Fala(6, "We regret what happened and thank everyone who followed the show this season.", "Host", null, true, 7));
        falasCenaE.add(new Fala(7, "We hope to see you again in a future edition, with new stories, new contestants and, who knows, a protagonist capable of winning over the audience.", "Host", null, true, 8));
        falasCenaE.add(new Fala(8, "I thank you all for your attention.\n\nSee you next time!", "Host", null, true, -1));

        Cena cenaE = new Cena(5, "plantao_cancelamento", "trilha_triste.mp3", falasCenaE);
        cenaE.setIdPrimeiraFala(1);
        cenaE.setIdUltimaaFala(8);
        cenasCap10.add(cenaE);

        List<Fala> falasCenaF = new ArrayList<>();
        falasCenaF.add(new Fala(1, "Hello, viewers! The show Table for Two has finally reached its grand finale! That's right, tonight our contestants will choose whether or not to embark on this romance.", "Host", null, true, 2));
        falasCenaF.add(new Fala(2, "To do so, they will choose between pressing the quit button or getting involved with our protagonist " + prota.getNome() + ".", "Host", null, true, 3));
        falasCenaF.add(new Fala(3, "Tell me, how are your expectations for this big moment?", "Host", null, true, 4));

        List<Opcoes> opcoesExpectativaF = List.of(
                new Opcoes(1, "“I'm excited. I believe I made a good impression.”", "Excited", Map.of(), 1, 0, false),
                new Opcoes(2, "“I'm apprehensive, I feel I could have done better in the show.”", "Apprehensive", Map.of(), 1, 0, false)
        );
        falasCenaF.add(new Dialogo(4, "Choose your expectation:", "System", null, false, opcoesExpectativaF, 0));

        falasCenaF.add(new Fala(5, "Okay, let's see now what the girls think about it.\n\nAfter the countdown, press the button or don't. 1, 2, 3 and…..go\n\n*Nobody presses the button*", "Host", null, true, 6));
        falasCenaF.add(new Fala(6, "Whoa! They all gave up on our contestant… tell me, what happened?", "Host", null, true, 7));
        falasCenaF.add(new Fala(7, "Ângela: He didn't know how to prioritize any of us.", "Ângela", null, true, 8));
        falasCenaF.add(new Fala(8, "Gabriela: That's right… he was too indecisive for a contestant on such a competitive reality show.", "Gabriela", null, true, 9));
        falasCenaF.add(new Fala(9, "Mônica: He lacked effort. He should have been more attentive.", "Mônica", null, true, 10));
        falasCenaF.add(new Fala(10, "Márcia: I knew I'd be wasting my time here…", "Márcia", null, true, 11));
        falasCenaF.add(new Fala(11, "Whoa… what a situation…\nSo our team thanks " + prota.getNome() + " and wishes better luck next time.\n\nThat's it, we end our show here. Thank you for following us this far and sorry for the rather disastrous outcome.\n\nSee you in the next edition!", "Narrator", null, true, -1));

        Cena cenaF = new Cena(6, "final_ninguem", "trilha_triste.mp3", falasCenaF);
        cenaF.setIdPrimeiraFala(1);
        cenaF.setIdUltimaaFala(11);
        cenasCap10.add(cenaF);

        Capitulo capitulo10 = new Capitulo(10, "The Big Decision", 1, 6, cenasCap10);
        bancoDeCapitulos.put(10, capitulo10);
    }
}