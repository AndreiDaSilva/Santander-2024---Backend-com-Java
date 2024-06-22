package ConsumerExemple;

import java.util.Arrays;
import java.util.List;

public class ConsumerExemple {

    public static void imprimirNumPar(List<Integer> numeros) {
        if (!numeros.isEmpty()) {
            numeros.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::print);
        }
    }

    public static void imprimirNumImpar(List<Integer> numeros) {
        if (!numeros.isEmpty()) {
            numeros.stream()
            .filter(n -> n % 2 != 0)
            .forEach(System.out::print);
        }
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        imprimirNumPar(numeros);
        System.out.println();
        imprimirNumImpar(numeros);
        System.out.println();
    }
}
