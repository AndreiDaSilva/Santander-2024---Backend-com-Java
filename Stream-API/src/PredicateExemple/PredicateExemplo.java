package PredicateExemple;

import java.util.Arrays;
import java.util.List;

public class PredicateExemplo {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Python", "Go", "Kotlin", "JavaScript", "Ruby", "C#");

        palavras.stream()
        .filter(p -> p.length() > 5)
        .forEach(System.out::println);
    }
}
