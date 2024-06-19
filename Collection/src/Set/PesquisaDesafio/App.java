package PesquisaDesafio;

public class App {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.addTarefa("Ler um livro", "Ler um livro divertido fácil");
        listaTarefas.addTarefa("Fazer exercícios", "Fazer exercícios de matemática difícil");
        listaTarefas.addTarefa("Escrever uma carta", "Escrever uma carta amiga curta");
        listaTarefas.addTarefa("Fazer um desenho", "Fazer um desenho colorido bonito");
        listaTarefas.addTarefa("Lavar a roupa", "Lavar roupa suja pesada");
        listaTarefas.addTarefa("Fazer uma lista", "Fazer uma lista de compras curta");
        listaTarefas.addTarefa("Falar com amigos", "Falar com amigos sobre filmes");
        listaTarefas.addTarefa("Fazer um relatório", "Fazer um relatório de trabalho curto");
        listaTarefas.addTarefa("Preparar um jantar", "Preparar um jantar simples rápido");
        listaTarefas.addTarefa("Fazer um exercício", "Fazer um exercício de yoga fácil");
        //listaTarefas.exibirTarefas();
        //listaTarefas.contarTarefas();

        //listaTarefas.removeTarefa("Escrever uma carta");
        //listaTarefas.exibirTarefas();
        //listaTarefas.contarTarefas();

        //listaTarefas.marcarTarefaConcluida("Fazer uma lista");
        //listaTarefas.marcarTarefaConcluida("Preparar um jantar");
        //listaTarefas.marcarTarefaConcluida("Fazer um exercício");
        //listaTarefas.exibirTarefas();
        //listaTarefas.contarTarefas();
        //System.out.println(listaTarefas.obterTarefasConcluidas());
        //System.out.println(listaTarefas.obterTarefasPendentes());

        //listaTarefas.marcartarefaPendente("Fazer uma lista");
        //listaTarefas.marcarTarefaConcluida("Preparar um jantar");
        //listaTarefas.marcarTarefaConcluida("Fazer um exercício");
        //listaTarefas.exibirTarefas();
        //listaTarefas.contarTarefas();
        //System.out.println(listaTarefas.obterTarefasConcluidas());
        //System.out.println(listaTarefas.obterTarefasPendentes());

        System.out.println(listaTarefas.limparListaTarefas());
        listaTarefas.contarTarefas();

    }
}
