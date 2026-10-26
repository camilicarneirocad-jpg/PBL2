package Controller;
import Model.Menu;
import Service.JogoService;
import Service.ServiceSave;
import View.MenuView;
import Service.ServiceConfiguracoes;

public class ControladorMenu {
    private Menu menu;
    private MenuView view;
    private JogoService service;
    private ControladorJogo controladorJogo;
    private boolean rodando;
    private ServiceConfiguracoes serviceConfiguracoes;
    private ServiceSave serviceSave;

    public ControladorMenu(Menu menu, MenuView view, JogoService service, ControladorJogo controladorJogo,
                           ServiceConfiguracoes serviceConfiguracoes, ServiceSave serviceSave) {
        this.menu = menu;
        this.view = view;
        this.service = service;
        this.controladorJogo = controladorJogo;
        this.rodando = true;
        this.serviceConfiguracoes = serviceConfiguracoes;
        this.serviceSave = serviceSave;
    }

    public void iniciar() {
        while (rodando) {
            view.exibirMenu(menu);
            int escolha = view.lerOpcao(menu);

            switch (escolha) {
                case 1:
                    controladorJogo.iniciarFluxoPrincipal();
                    break;
                case 2:
                    service.exibirCreditos();
                    break;
                case 3:
                    service.exibirInstrucoes();
                    break;
                case 4:
                    serviceConfiguracoes.configurarIdioma();
                    break;
                case 5:
                    serviceConfiguracoes.configurarTamanhoLetra();
                    break;
                case 6:
                    serviceConfiguracoes.configurarMusica();
                    break;
                case 7:
                    controladorJogo.continuarJogo();
                    break;
                case 8:
                    serviceSave.excluir();
                    break;
                case 9:
                    service.exibirFinais();
                    break;
                case 10:
                    controladorJogo.continuarAutomatico();
                    break;
                case 11:
                    controladorJogo.acessarCenaExtra();
                    break;
                case 12:
                    System.out.println("Encerrando o jogo");
                    rodando = false;
                    break;
            }
        }
    }

}
