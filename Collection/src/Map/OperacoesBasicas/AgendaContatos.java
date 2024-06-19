package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    /**
     * @param agendaContatoMap
     */
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String name, Integer phone) {

        if (agendaContatoMap.get(name) == null) {
            agendaContatoMap.put(name, phone);
        } 
    }

    public void removerContato(String name) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(name);
        } else {
            throw new NullPointerException("Lista Vazia");
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String name) {
        Integer numeroContato = null;
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.get(name);
            numeroContato = agendaContatoMap.get(name);
        }
        return numeroContato;
    }

}
