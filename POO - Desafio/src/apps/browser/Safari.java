package apps.browser;

public class Safari implements NavegadorWeb{

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
