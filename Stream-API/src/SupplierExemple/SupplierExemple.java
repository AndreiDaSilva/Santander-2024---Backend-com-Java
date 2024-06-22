package SupplierExemple;

import java.util.List;
import java.util.stream.Stream;

public class SupplierExemple {
    public static void main(String[] args) {
        List<String> listaSaudacao = Stream.generate(() -> "Seja bem vindo!")
                .limit(3)
                .toList();

        listaSaudacao.forEach(System.out::println);
    }
}
