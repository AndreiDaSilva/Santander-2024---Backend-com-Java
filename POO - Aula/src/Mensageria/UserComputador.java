package Mensageria;
import java.util.Scanner;

import Mensageria.apps.FacebookMessenger;
import Mensageria.apps.MSNMessenger;
import Mensageria.apps.ServicoMessengerInstantanea;
import Mensageria.apps.Telegram;

public class UserComputador {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        ServicoMessengerInstantanea smi = null;

        System.out.println("1.MSN\n2.FACEBOOK\n3.TELEGRAM\n0.SAIR");
        int opc = tec.nextInt();
            switch (opc) {
                case 1:
                    smi = new MSNMessenger();
                    break;
                case 2:
                    smi = new FacebookMessenger();
                    break;
                case 3:
                    smi = new Telegram();
                    break;
                case 0:
                    System.out.println("Sistema encerrado");
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
        try {
            smi.enviarMensagem();
            smi.receberMensagem();
        } catch (NullPointerException e) {
            System.out.println("Nem uma opção foi escolida");
        }
    }
}
