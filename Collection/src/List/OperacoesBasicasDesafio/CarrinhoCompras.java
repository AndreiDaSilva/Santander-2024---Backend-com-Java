package List.OperacoesBasicasDesafio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> listItems;

    /**
     * @param listItems
     */
    public CarrinhoCompras() {
        this.listItems = new ArrayList<>();
    }

    public void addItem(String nome, double preco, int quantidade) {
        listItems.add(new Item(nome, preco, quantidade));
    }

    public void delItem(String nome) {
        List<Item> delItems = new ArrayList<>();
        if (!listItems.isEmpty()) {
            for (Item i : listItems) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    delItems.add(i);
                }
            }
        }
        listItems.removeAll(delItems);
    }

    public double calcularValorTotal() {
        double valorTotalCarinho = 0;
        if (!listItems.isEmpty()) {
            for (Item i : listItems) {
                valorTotalCarinho += i.getPreco() * i.getQuantidade();
            }
        }

        return valorTotalCarinho;
    }

    public void exibirItens(){
        System.out.println(listItems);
    }

}
