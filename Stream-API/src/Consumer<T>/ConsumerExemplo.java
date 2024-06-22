import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo {

    public static void imprimirNumPar(List<Integer> numeros) {
        if (!numeros.isEmpty()) {
            numeros.forEach(n -> {
                if (n % 2 == 0) {
                    System.out.print(n + " ");
                }
            });
        }
    }

    public static void imprimirNumImpar(List<Integer> numeros) {
        if (!numeros.isEmpty()) {
            numeros.forEach(n -> {
                if (n % 2 != 0) {
                    System.out.print(n + " ");
                }
            });
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
