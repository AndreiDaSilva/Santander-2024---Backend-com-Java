package List.OrdenacaoDesafio;

public class App {
    public static void main(String[] args) {
        OrdenacaoNumero numero = new OrdenacaoNumero();

        numero.addNumero(2);
        numero.addNumero(5);
        numero.addNumero(76);
        numero.addNumero(1);
        numero.addNumero(34);

        System.out.println(numero.ordenarAscendente());
        System.out.println(numero.ordenarDescendente());
    }
}
