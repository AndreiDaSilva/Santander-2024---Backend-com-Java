package Mensageria.apps;
public abstract class ServicoMessengerInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void salvarHistorico(){
        System.out.println("Salvando historico de mensagem");
    }

    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
}
