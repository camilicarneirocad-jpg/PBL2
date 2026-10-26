package Model;

public class Configuracoes {
    private int idIdioma=2;
    private int idAtivarMusica;
    private int idTamanhoLetra;

    public Configuracoes(){}

    public int getIdIdioma(){
        return  idIdioma;
    }

    public int getIdAtivarMusicavarMusica(){
        return  idAtivarMusica;
    }

    public int getIdTamanhoLetra(){
        return  idTamanhoLetra;
    }

    public void setIdIdioma(int idIdioma){
        this.idIdioma=idIdioma;
    }

    public void setIdTamanhoLetra(int idTamanhoLetra){
        this.idTamanhoLetra=idTamanhoLetra;
    }

    public void setIdAtivarMusicavarMusica(int idAtivarMusica){
        this.idAtivarMusica=idAtivarMusica;
    }
}
