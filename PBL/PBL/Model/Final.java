package Model;

public class Final {
    private int idFinal;
    private String resumo;

    public Final() {
    }

    public Final(int idFinal, String resumo) {
        this.idFinal = idFinal;
        this.resumo = resumo;
    }

    public int getIdFinal() { return idFinal; }
    public String getResumo() { return resumo; }
    public void setIdFinal(int idFinal) { this.idFinal = idFinal; }
    public void setResumo(String resumo) { this.resumo = resumo; }
}
