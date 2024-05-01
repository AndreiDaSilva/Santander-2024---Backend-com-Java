package dispositivo;

import apps.browser.InavegadorWeb;
import apps.call.IchamadaVoz;
import apps.music.IreprodutorDeMusica;

public class iPhone implements InavegadorWeb, IchamadaVoz, IreprodutorDeMusica {

    @Override
    public void tocar() {
        System.out.println("Tocando uma musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar uma musica");
    }

    @Override
    public void ligar() {
        System.out.println("Realizando uma ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz eletronico");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina");
    }

    @Override
    public void addPagina() {
        System.out.println("Adicionando nova pagina");
    }

    @Override
    public void attPagina() {
        System.out.println("Atualizando a pagina");
    }

}
