package List.OperacoesBasicasDesafio;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    /**
     * @param nome
     * @param preco
     * @param quantidade
     */
    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "\n" + nome + ", preco= " + preco + ", quantidade= " + quantidade;
    }

}
