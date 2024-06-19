package List.OperacoesBasicas;

public class App {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Total: " + listaTarefa.obterTotalTarefas());
        
        listaTarefa.addTarefa("Tarefa 1");
        listaTarefa.addTarefa("Tarefa 2");
        listaTarefa.addTarefa("Tarefa 3");
        listaTarefa.addTarefa("Tarefa 2");

        System.out.println("Total: " + listaTarefa.obterTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");

        System.out.println("Total: " + listaTarefa.obterTotalTarefas());

        listaTarefa.obterDescricoesTarefas();


    }
}
