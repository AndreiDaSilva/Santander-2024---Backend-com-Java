package OperacoesBasicasDesafio;

public class App {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("Andrei");
        palavrasUnicas.adicionarPalavra("Tana");
        palavrasUnicas.adicionarPalavra("Palavra 1");
        palavrasUnicas.adicionarPalavra("Palavra 2");
        palavrasUnicas.adicionarPalavra("Palavra 3");
        palavrasUnicas.adicionarPalavra("Palavra 4");
        palavrasUnicas.adicionarPalavra("Palavra 5");
        palavrasUnicas.adicionarPalavra("Andrei");
        palavrasUnicas.adicionarPalavra("Palavra 2");

        System.out.println(palavrasUnicas.verificarPalavra("Tana"));
        palavrasUnicas.exibirPalavrasUnicas();
        palavrasUnicas.removerPalavra("Palavra 3");
        palavrasUnicas.exibirPalavrasUnicas();

    }
}
