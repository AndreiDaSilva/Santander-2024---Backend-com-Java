package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    /**
     * @param contatoSet
     */
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibiContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPesquisar = new HashSet<>();

        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatoPesquisar.add(c);
            }
        }
        return contatoPesquisar;
    }

    public Contato atualizarContatos(String name, int numero){
        Contato contatoAtt = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(name)) {
                c.setNumero(numero);
                contatoAtt = c;
                break;
            }
        }
        return contatoAtt;
    }

}
