package Mensageria.apps;
public class FacebookMessenger extends ServicoMessengerInstantanea{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
        salvarHistorico();
    }
    
}
