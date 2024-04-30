package VerificadorNumeroConta;

import java.util.Scanner;

public class VerificadorNumeroConta {
    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        try {
            verificarNumeroConta(tec.next());
            System.out.println("Numero de conta valido."); 
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            tec.close();
        }
    }
}