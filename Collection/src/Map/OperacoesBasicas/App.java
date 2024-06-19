package Map.OperacoesBasicas;


public class App {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Andrei", 992314502);
        agendaContatos.adicionarContato("Tana", 12854984);
        agendaContatos.adicionarContato("Contato 1", 5163548);
        agendaContatos.adicionarContato("Contato 2", 1563854);
        agendaContatos.adicionarContato("Contato 3", 2656458);
        agendaContatos.adicionarContato("Contato 2", 2165854);

        agendaContatos.exibirContatos();
        agendaContatos.pesquisarPorNome("Andrei");
        //agendaContatos.removerContato("Contato 2");
        
    }
}
