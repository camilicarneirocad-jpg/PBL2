package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Save {
    private String momento;
    private String resumo;

    private int idCapitulo;
    private int idCena;
    private int idFala;

    private String nomeJogador;
    private int genero;
    private int antipatia;
    private int idRoupa;

    private Map<Integer, Integer> afinidades = new HashMap<>();

    private List<Item> itens = new ArrayList<>();

    public Save() {
    }

    public String getMomento() {
        return momento;
    }

    public void setMomento(String momento) {
        this.momento = momento;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int getIdCapitulo() {
        return idCapitulo;
    }

    public void setIdCapitulo(int idCapitulo) {
        this.idCapitulo = idCapitulo;
    }

    public int getIdCena() {
        return idCena;
    }

    public void setIdCena(int idCena) {
        this.idCena = idCena;
    }

    public int getIdFala() {
        return idFala;
    }

    public void setIdFala(int idFala) {
        this.idFala = idFala;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public int getAntipatia() {
        return antipatia;
    }

    public void setAntipatia(int antipatia) {
        this.antipatia = antipatia;
    }

    public int getIdRoupa() {
        return idRoupa;
    }

    public void setIdRoupa(int idRoupa) {
        this.idRoupa = idRoupa;
    }

    public Map<Integer, Integer> getAfinidades() {
        return afinidades;
    }

    public void setAfinidades(Map<Integer, Integer> afinidades) {
        this.afinidades = afinidades;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
