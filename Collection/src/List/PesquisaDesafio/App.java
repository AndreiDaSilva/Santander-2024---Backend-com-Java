package List.PesquisaDesafio;

public class App {
    public static void main(String[] args) {
        SomaNumero numero = new SomaNumero();
        

        numero.adicionarNumero(1);
        numero.adicionarNumero(24);
        numero.adicionarNumero(67);
        numero.adicionarNumero(3);
        numero.adicionarNumero(10);

        int maiorNumero = numero.encontrarMaiorNumero();
        int menorNumero = numero.encontrarMenorNumero();
        int somaNumeros = numero.calcularSoma();
        
        System.out.println(maiorNumero);

        System.out.println(menorNumero);

        System.out.println(somaNumeros);

        numero.exibirNumero();
    }
}
