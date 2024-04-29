package SimulacaoBancaria;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        double saldo = 0;
        System.err.println("1.Depositar \n2.Sacar \n3.Consultar Saldo \n4.Encerrar");
        while (opcao != 0) {
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    saldo += scanner.nextDouble();
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double saldoAtual = saldo;
                    saldo -= scanner.nextDouble();
                    if (saldo < 0) {
                        System.out.println("Saldo insuficiente.");
                        saldo = saldoAtual;
                        break;
                    }
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
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