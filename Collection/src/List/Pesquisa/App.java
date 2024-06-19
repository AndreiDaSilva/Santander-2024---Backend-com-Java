package List.Pesquisa;

public class App {
    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();

        catalagoLivros.addLivro("Livro 1", "Autor 1", 1998);
        catalagoLivros.addLivro("Livro 2", "Autor 4", 2022);
        catalagoLivros.addLivro("Livro 3", "Autor 3", 2014);
        catalagoLivros.addLivro("Livro 4", "Autor 6", 2012);
        catalagoLivros.addLivro("Livro 5", "Autor 5", 2018);
        catalagoLivros.addLivro("Livro 6", "Autor 6", 2015);
        catalagoLivros.addLivro("Livro 7", "Autor 7", 1989);
        catalagoLivros.addLivro("Livro 6", "Autor 7", 1999);

        System.out.println(catalagoLivros.pesquisarPorIntervaloAno(2005, 2020));
        
        System.out.println(catalagoLivros.pesquisarPorAutor("Autor 7"));
        
        System.out.println(catalagoLivros.pesquisarPorTitulo("Livro 6"));
    }
}
