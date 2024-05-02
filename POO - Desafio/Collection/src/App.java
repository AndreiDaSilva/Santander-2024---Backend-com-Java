import List.OperacoesBasicas.ListTarefas.ListaTarefa;

public class App {
    public static void main(String[] args) throws Exception {

        //Testando List
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println(listaTarefa.obterTotalTarefas());
        
        listaTarefa.addTarefa("Tarefa 01");
        listaTarefa.addTarefa("Tarefa 02");
        listaTarefa.addTarefa("Tarefa 03");
        listaTarefa.addTarefa("Tarefa 02");
        System.out.println(listaTarefa.obterTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 02");
        System.out.println(listaTarefa.obterTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
