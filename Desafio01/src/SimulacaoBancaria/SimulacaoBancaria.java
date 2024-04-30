package SimulacaoBancaria;
import java.util.Scanner;

public class SimulacaoBancaria {
    private double saldo;

    public SimulacaoBancaria() {

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private void addSaldo(double valor) {
        setSaldo(this.saldo += valor);
        System.out.println("Saldo atual: " + getSaldo());
    }

    private void sacarValor(double valor) {
        if (getSaldo() < valor) {
            System.out.println("Saldo insuficiente.");
        } else {
            setSaldo(this.saldo -= valor);
            System.out.println("Saldo atual: " + getSaldo());
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
                    conta.addSaldo(scanner.nextDouble());
                    break;
                case 2:
                    conta.sacarValor(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Saldo atual: " + conta.getSaldo());
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}