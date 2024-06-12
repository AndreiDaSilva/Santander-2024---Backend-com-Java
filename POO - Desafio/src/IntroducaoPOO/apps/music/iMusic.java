package apps.music;

public class iMusic implements IreprodutorDeMusica {

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
    
}
