package OperacoesBasicasDesafio;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavras.add(palavra);
    }

    public String verificarPalavra(String palavra) {
        String palavraBuscada = "Palavra não encontrada";
        if (palavraExiste(palavra)) {
            palavraBuscada = palavra;
        }
        return palavraBuscada;
    }

    private boolean palavraExiste(String palavra){
        if (!conjuntoPalavras.isEmpty()) {
            for (String s : conjuntoPalavras) {
                if (s.equalsIgnoreCase(palavra)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void removerPalavra(String palavra) {
        Set<String> palavrasRemover = new HashSet<>();
        for (String s : conjuntoPalavras) {
            if (verificarPalavra(s).equals(palavra)) {
                palavrasRemover.add(s);
            }
        }
        conjuntoPalavras.removeAll(palavrasRemover);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(conjuntoPalavras);
    }
}
