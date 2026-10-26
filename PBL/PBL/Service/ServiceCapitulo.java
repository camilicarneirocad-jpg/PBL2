package Service;

import Model.*;
import java.util.List;

public class ServiceCapitulo {
    private final Jogo jogo;

    public ServiceCapitulo(Jogo jogo) {
        this.jogo = jogo;
    }

    // Cap 7: a partir desse nível de antipatia o gabarito começa no modo difícil (cena 2)
    private static final int ANTIPATIA_MODO_DIFICIL = 50;

    // Cap 10
    private static final int ANTIPATIA_CANCELAMENTO = 60;   // acima disso: programa cancelado
    private static final int AFINIDADE_MINIMA_FINAL = 40;   // ninguém chegou nisso: ninguém fica

    private static final int CENA_ANGELA = 1;
    private static final int CENA_MARCIA = 2;
    private static final int CENA_GABRIELA = 3;
    private static final int CENA_MONICA = 4;
    private static final int CENA_CANCELAMENTO = 5;
    private static final int CENA_NINGUEM = 6;

    public void definirPrimeiraCena(Capitulo capitulo, Protagonista prota, List<Secundario> secundarios,
                                    ServiceCena serviceCena, boolean retomando, int idCenaRetomada) {
        if (retomando) {
            capitulo.setIdPrimeiraFala(idCenaRetomada);
        } else if (capitulo.getIdCapitulo() == 7) {
            capitulo.setIdPrimeiraFala(prota.getAntipatia() >= ANTIPATIA_MODO_DIFICIL ? 2 : 1);
        } else if (capitulo.getIdCapitulo() == 10) {
            capitulo.setIdPrimeiraFala(escolherFinalCap10(prota, secundarios, serviceCena));
        }
    }

    private int registrarFinal(int idFinal, String resumo) {
        jogo.adicionarFinal(resumo, idFinal);
        return idFinal;
    }

    public int escolherFinalCap10(Protagonista prota, List<Secundario> secundarios, ServiceCena serviceCena) {
        if (prota.getAntipatia() > ANTIPATIA_CANCELAMENTO) {
            return registrarFinal(CENA_CANCELAMENTO, "Programa cancelado");
        }

        if (serviceCena.houveEmpate(secundarios) || serviceCena.ninguemAtingiu(secundarios, AFINIDADE_MINIMA_FINAL)) {
            return registrarFinal(CENA_NINGUEM, "Ninguém ficou com você");
        }

        Secundario maior = serviceCena.verificarMaiorAfinidade(secundarios);
        if (maior == null) {
            return registrarFinal(CENA_NINGUEM, "Ninguém ficou com você");
        }

        switch (maior.getId()) {
            case ServiceCena.ID_ANGELA:   return registrarFinal(CENA_ANGELA, "Final com a Ângela");
            case ServiceCena.ID_MARCIA:   return registrarFinal(CENA_MARCIA, "Final com a Márcia");
            case ServiceCena.ID_GABRIELA: return registrarFinal(CENA_GABRIELA, "Final com a Gabriela");
            case ServiceCena.ID_MONICA:   return registrarFinal(CENA_MONICA, "Final com a Mônica");
            default:                      return registrarFinal(CENA_NINGUEM, "Ninguém ficou com você");
        }
    }
}