package PesquisaDesafio;

public class Tarefa {
    private String titulo;
    private String descricao;
    private TarefaEnum TarefaEnum;
    
    /**
     * @param titulo
     * @param descricao
     * @param tarefaEnum
     */
    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        TarefaEnum = PesquisaDesafio.TarefaEnum.FAZER;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
    /**
     * @return the tarefaEnum
     */
    public TarefaEnum getTarefaEnum() {
        return TarefaEnum;
    }
    /**
     * @param tarefaEnum the tarefaEnum to set
     */
    public void setTarefaEnum(TarefaEnum tarefaEnum) {
        TarefaEnum = tarefaEnum;
    }
    @Override
    public String toString() {
        return "\n" + titulo + ", descricao= " + descricao + ", Status= " + TarefaEnum;
    }
}   
