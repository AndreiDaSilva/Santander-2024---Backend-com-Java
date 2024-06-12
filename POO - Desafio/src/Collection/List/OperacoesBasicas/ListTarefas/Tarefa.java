package List.OperacoesBasicas.ListTarefas;

public class Tarefa {
    private String descricao;

    /**
     * @param descricao
     */
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa = [ " + descricao + " ]";
    }

    
}
