package SimulacaoBancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimulacaoBancaria {
    private double saldo;

    public SimulacaoBancaria() {

    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private void addSaldo(double valor) {
        try {
            setSaldo(this.saldo += valor);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        System.err.println("1.Depositar \n2.Sacar \n3.Consultar Saldo \n4.Encerrar");
        SimulacaoBancaria conta = new SimulacaoBancaria();
        while (opcao != 0) {
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    try {
                        conta.addSaldo(scanner.nextDouble());
                    } catch (InputMismatchException e) {
                        System.out.println("Por favor digite um numero");
                    }
                    System.out.println("Saldo atual: " + conta.getSaldo());
                    break;
                case 2:
                    System.out.println("Saldo atual: ");
                    break;
                case 3:
                    System.out.println("Saldo atual: ");
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

}