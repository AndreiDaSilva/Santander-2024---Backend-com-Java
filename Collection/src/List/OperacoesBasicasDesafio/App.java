package List.OperacoesBasicasDesafio;

public class App {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.addItem("Cebola", 5.78, 4);
        carrinho.addItem("Tomate Longa Vida", 7.89, 2);
        carrinho.addItem("Leite 1L", 5.39, 3);
        carrinho.addItem("Carne Bovina", 48.78, 2);

        carrinho.exibirItens();
        System.out.println(carrinho.calcularValorTotal());

        carrinho.delItem("Cebola");
        carrinho.exibirItens();
        System.out.println(carrinho.calcularValorTotal());

        

    }
}
