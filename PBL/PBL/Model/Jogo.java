package Model;
import java.util.List;
import java.util.ArrayList;

public class Jogo {
    private Inventario inventario;
    private String nome;
    private Protagonista prota;
    private List<Secundario> secundarios;
    private List<Capitulo> capitulos;
    private List<Save> slots;
    private List<Final> finais= new ArrayList<>();

    public Inventario getInventario() {
        return inventario;
    }

    public List<Final> getFinais() {
        return new ArrayList<>(finais);
    }

    public void adicionarFinal(String resumo, int idFinal) {
        for (Final f : finais) {
            if (f.getIdFinal() == idFinal) return;
        }
        finais.add(new Final(idFinal, resumo));
    }
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Protagonista getProta() {
        return prota;
    }

    public void setProta(Protagonista prota) {
        this.prota = prota;
    }

    public List<Secundario> getSecundarios() {
        return secundarios;
    }

    public void setSecundarios(List<Secundario> secundarios) {
        this.secundarios = secundarios;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(List<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }
}