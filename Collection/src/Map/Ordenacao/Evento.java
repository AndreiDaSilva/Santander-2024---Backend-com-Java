package Map.Ordenacao;

import java.time.LocalDate;

public class Evento {
    private String nome;
    private String descricao;

    /**
     * @param nome
     * @param atracao
     */
    public Evento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Evento [nome= " + nome + ", descricao= " + descricao + "]";
    }

    
}
