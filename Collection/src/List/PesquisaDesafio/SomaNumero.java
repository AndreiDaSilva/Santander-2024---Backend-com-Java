package List.PesquisaDesafio;

import java.util.ArrayList;
import java.util.List;

public class SomaNumero {
    private List<Integer> somaNumero;

    /**
     * @param somaNumero
     */
    public SomaNumero() {
        this.somaNumero = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        somaNumero.add(numero);
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        for (Integer n : somaNumero) {
            if (n.intValue() > maiorNumero) {
                maiorNumero = n.intValue();
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        for (Integer n : somaNumero) {
            if (n.intValue() < menorNumero) {
                menorNumero = n.intValue();
            }
        }
        return menorNumero;
    }

    public void exibirNumero(){
        System.out.println(somaNumero);
    }

    public int calcularSoma(){
        int somaTotalNumero = 0;
        if (!somaNumero.isEmpty()) {
            for (Integer n : somaNumero) {
                somaTotalNumero += n.intValue();     
            }
        }
        return somaTotalNumero;
    }
}
