package Controller;

import Model.Capitulo;
import Model.Jogo;
import Model.Save;
import Repository.SaveRepository;
import Service.JogoService;
import Service.ServiceSave;
import View.JogoView;

import java.util.List;

public class ControladorJogo {
    private Jogo jogo;
    private JogoView view;
    private JogoService jogoService;
    private ServiceSave serviceSave;
    private ControladorCenas controladorCenas;
    private ControladorCapitulos controladorCapitulos;
    private SaveRepository saveRepository;

    public ControladorJogo(Jogo jogo, JogoView view, JogoService jogoService) {
        this.jogo = jogo;
        this.view = view;
        this.saveRepository=new SaveRepository();
        this.serviceSave =new ServiceSave(view,jogo,saveRepository,jogoService);
        this.jogoService = jogoService;
        this.controladorCenas = new ControladorCenas(view, jogo);
        this.controladorCapitulos = new ControladorCapitulos(view, controladorCenas, serviceSave, jogo);
        serviceSave.carregarFinais();
    }

    public void iniciarFluxoPrincipal() {
        jogoService.iniciarNovoJogo();
        executarCapitulos(0);
    }

    public void continuarJogo() {
        Save save = serviceSave.carregar();
        if (save == null) {
            return;
        }
        executarCapitulos(save.getIdCena());
    }

    public void continuarAutomatico() {
        Save save = serviceSave.carregarAutomatico();
        if (save == null) {
            return;
        }
        executarCapitulos(save.getIdCena());
    }

    public void acessarCenaExtra() {
        Capitulo extra = jogoService.obterCenaExtra();
        if (extra == null) {
            return;
        }
        controladorCapitulos.iniciarCapitulo(extra, jogo.getProta(), jogo.getSecundarios(), false, 0);
    }

    private void executarCapitulos(int idCenaRetomada) {
        List<Capitulo> capitulos = jogo.getCapitulos();

        if (capitulos == null || capitulos.isEmpty()) {
            view.exibirTexto("Esse save já chegou ao fim da história.");
            return;
        }

        boolean primeiro = true;
        for (Capitulo capitulo : capitulos) {
            boolean retomando = primeiro && idCenaRetomada > 0;
            controladorCapitulos.iniciarCapitulo(capitulo, jogo.getProta(), jogo.getSecundarios(),
                    retomando, idCenaRetomada);
            primeiro = false;
        }

        view.exibirTexto("\nFim de jogo!");
    }

    public ServiceSave getServiceSave(){
        return serviceSave;
    }
}
