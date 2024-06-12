import apps.browser.InavegadorWeb;
import apps.call.IchamadaVoz;
import apps.music.IreprodutorDeMusica;
import dispositivo.iPhone;

public class IphoneUser {
    public static void main(String[] args) throws Exception {
        iPhone iphone = new iPhone();

        InavegadorWeb safari = iphone;
        IchamadaVoz iCall = iphone;
        IreprodutorDeMusica iMusic = iphone;


        safari.exibirPagina();
        safari.addPagina();
        safari.attPagina();

        iCall.ligar();
        iCall.atender();
        iCall.iniciarCorreioVoz();

        iMusic.tocar();
        iMusic.pausar();
        iMusic.selecionarMusica();

    }
}
