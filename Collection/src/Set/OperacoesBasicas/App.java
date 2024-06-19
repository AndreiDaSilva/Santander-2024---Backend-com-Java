public class App {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " para o evento");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1001);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1002);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1003);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1004);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 1005);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " para o evento");

        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerConvidadoPorCodigo(1003);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " para o evento");

    }
}
