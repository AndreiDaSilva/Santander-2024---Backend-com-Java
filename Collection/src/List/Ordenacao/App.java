package List.Ordenacao;

public class App {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.addPessoa("Pessoa 1", 26, 1.89);
        ordenacaoPessoa.addPessoa("Pessoa 2", 18, 1.72);
        ordenacaoPessoa.addPessoa("Pessoa 3", 34, 1.84);
        ordenacaoPessoa.addPessoa("Pessoa 4", 85, 1.78);    

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
