package Controller;
import Model.Jogo;
import Model.Menu;
import Model.Configuracoes;
import Service.ServiceConfiguracoes;
import Service.JogoService;
import View.JogoView;
import View.MenuView;
import Repository.SaveRepository;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        Configuracoes configuracoes= new Configuracoes();
        JogoView jogoView = new JogoView();
        MenuView menuView = new MenuView();
        JogoService jogoService = new JogoService(jogo, jogoView,configuracoes);
        //ControladorJogo controladorJogo = new ControladorJogo(jogo, jogoView);
        ServiceConfiguracoes serviceConfiguracoes = new ServiceConfiguracoes(configuracoes,jogoView);
        SaveRepository saveRepository = new SaveRepository();
        ControladorJogo controladorJogo = new ControladorJogo(jogo, jogoView, jogoService);
        Map<Integer, String> opcoesMenu = new HashMap<>();
        opcoesMenu.put(1, "Novo Jogo");
        opcoesMenu.put(2, "Créditos");
        opcoesMenu.put(3, "Instruções");
        opcoesMenu.put(4, "Definir idioma");
        opcoesMenu.put(5, "Definir tamanho da fonte");
        opcoesMenu.put(6, "Ativar/Desativar som");
        opcoesMenu.put(7, "Carregar Save");
        opcoesMenu.put(8, "Excluir Save");
        opcoesMenu.put(9, "Consultar Finais Obtidos");
        opcoesMenu.put(10, "Acessar save automático");
        opcoesMenu.put(11, "Acessar cena Especial");
        opcoesMenu.put(12, "Sair");

        Menu menuPrincipal = new Menu("Reserva Para Dois", opcoesMenu);

        ControladorMenu controladorMenu = new ControladorMenu(
            menuPrincipal, 
            menuView, 
            jogoService, 
            controladorJogo,
            serviceConfiguracoes, controladorJogo.getServiceSave());

        controladorMenu.iniciar();
    }
}