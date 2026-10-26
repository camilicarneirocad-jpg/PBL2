package Controller;
import Model.Capitulo;
import Model.Cena;
import Model.Protagonista;
import Model.Secundario;
import Model.Jogo;
import Service.JogoService;
import Service.ServiceCapitulo;
import Service.ServiceSave;
import View.JogoView;

import java.util.List;

public class ControladorCapitulos {
    private ServiceCapitulo serviceCapitulo;
    private ControladorCenas controladorCenas;
    private JogoView view;
    private ServiceSave serviceSave;

    public ControladorCapitulos(JogoView view, ControladorCenas controladorCenas, ServiceSave serviceSave, Jogo jogo) {
        this.view = view;
        this.serviceCapitulo = new ServiceCapitulo(jogo);
        this.controladorCenas = controladorCenas;
        this.serviceSave = serviceSave;
    }

    public void iniciarCapitulo(Capitulo capitulo, Protagonista prota, List<Secundario> secundarios,
                                boolean retomando, int idCenaRetomada) {
        view.exibirTexto("\n========================================");
        view.exibirTexto("CAPÍTULO " + capitulo.getIdCapitulo() + ": " + capitulo.getTitulo());
        view.exibirTexto("========================================");

        serviceCapitulo.definirPrimeiraCena(capitulo, prota, secundarios,
                controladorCenas.getServiceCena(), retomando, idCenaRetomada);

        if (capitulo.getIdCapitulo() == JogoService.ULTIMO_CAPITULO) {
            serviceSave.salvarFinais();
        }

        int proximaCenaId = capitulo.getIdPrimeiraCena();
        boolean historiaPrincipal = capitulo.getIdCapitulo() <= JogoService.ULTIMO_CAPITULO;

        while (proximaCenaId > 0) {
            Cena cenaExecutada = controladorCenas.executarCena(capitulo, proximaCenaId, prota, secundarios);

            if (cenaExecutada == null) {
                break;
            }

            Integer proxima = cenaExecutada.getIdProximacena();
            boolean temProxima = proxima != null && proxima > 0;

            if (temProxima) {
                proximaCenaId = proxima;
                if (historiaPrincipal) {
                    serviceSave.autosalvar(capitulo.getIdCapitulo(), proxima);
                }
            } else {
                if (historiaPrincipal) {
                    serviceSave.autosalvar(capitulo.getIdCapitulo() + 1, 0);
                }
                if (capitulo.getIdCapitulo() < JogoService.ULTIMO_CAPITULO) {
                    serviceSave.salvar(capitulo.getIdCapitulo() + 1, 0);
                }
                break;
            }
        }

    }

}
