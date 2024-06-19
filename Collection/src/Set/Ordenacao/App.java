package Ordenacao;

public class App {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(789879524, "Brahma 350ml", 2.78, 265);
        cadastroProdutos.adicionarProduto(789782164, "Skol 350ml", 2.98, 3584);
        cadastroProdutos.adicionarProduto(789215968, "Itaipava 350ml", 3.29, 214);
        cadastroProdutos.adicionarProduto(789315487, "Heineken 350ml", 3.98, 214);
        cadastroProdutos.adicionarProduto(789218573, "Polar 473ml", 4.98, 187);
        cadastroProdutos.adicionarProduto(789321587, "Antarctica 350ml", 2.49, 240);
        cadastroProdutos.adicionarProduto(789123547, "Sub Zero 350ml", 1.98, 1587);

        //System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
