package Service;

import View.JogoView;
import Model.Configuracoes;

public class ServiceConfiguracoes {

    private Configuracoes configuracoes;
    private JogoView view;

    public ServiceConfiguracoes(Configuracoes configuracoes, JogoView view) {
        this.configuracoes = configuracoes;
        this.view = view;
    }

    public void configurarIdioma() {
        view.exibirTexto("Escolha um idioma\n 1-Inglês\n 2-Português");
        configuracoes.setIdIdioma(view.receberOpcaoNumerica());
    }

    public void configurarTamanhoLetra() {
        view.exibirTexto("Escolha um tamanho de letra\n 1-Normal\n 2-Grande");
        configuracoes.setIdTamanhoLetra(view.receberOpcaoNumerica());
    }

    public Configuracoes getConfiguracoes(){
        return configuracoes;
    }
    public void configurarMusica() {
        view.exibirTexto("Deseja ativar a música?\n 1-Ativar\n 2-Desativar");
        configuracoes.setIdAtivarMusicavarMusica(view.receberOpcaoNumerica());
    }
}