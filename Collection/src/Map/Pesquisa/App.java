package Map.Pesquisa;

public class App {
    public static void main(String[] args) {

        EstoqueProdutos estoque = new EstoqueProdutos();

        // estoque.exibirTodosProdutos();

        estoque.adicionarProduto(1001, "Papel A4", 0.25, 1000);
        estoque.adicionarProduto(1002, "Caneta Azul", 2.45, 468);
        estoque.adicionarProduto(1003, "Lapis B6", 4.98, 548);
        estoque.adicionarProduto(1004, "Lapis Colorido CX", 8.98, 58);
        estoque.adicionarProduto(1005, "Lapis Colorido 2 CX", 7.98, 58);

        // estoque.exibirTodosProdutos();

        // System.out.println(estoque.calculaValorTotalEstoque());

        System.out.println(estoque.obterProdutoMaisCaro());
        System.out.println(estoque.obterProdutoMaisBarato());
    }
}
