package Pesquisa;

public class App {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Contato 1", 99587958);
        agendaContatos.adicionarContato("Conta 2", 557895);
        agendaContatos.adicionarContato("Ato 3", 998877);
        agendaContatos.adicionarContato("Contato Ato 4", 665544);
        agendaContatos.adicionarContato("Contato Conta 5", 332211);

        System.out.println(agendaContatos.pesquisarPorNome("Contato"));

        agendaContatos.exibiContatos();

        System.out.println(agendaContatos.atualizarContatos("Contato 1", 554488));
        
        agendaContatos.exibiContatos();

        }
}
