package VerificadorElegibilidadeConta;

import java.util.Scanner;

public class VerificadorElegibilidadeConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();
        System.out.println(idade < 18 ? "Voce nao esta elegivel para criar uma conta bancaria."
                : "Voce esta elegivel para criar uma conta bancaria.");
        scanner.close();
    }
}