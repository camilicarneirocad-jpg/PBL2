package Model;
public class Item {
    private String nome;
    private String imagem;

    // Necessário para o Jackson conseguir ler o Save (JSON) e recriar os itens
    public Item() {
    }

    public Item(String nome, String imagem) {
        this.nome = nome;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public String getImagem() {
        return imagem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}