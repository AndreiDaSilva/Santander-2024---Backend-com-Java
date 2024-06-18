package Pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numero;

    /**
     * @param nome
     * @param numero
     */
    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "{" + nome + ", " + numero + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        return Objects.equals(nome, other.nome);
    }

}
