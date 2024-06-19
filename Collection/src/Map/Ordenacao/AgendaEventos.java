package Map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    private Map<LocalDate, Evento> eventosOrdenados(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        return eventosTreeMap;
    }

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String name, String descricao) {
        Evento evento = new Evento(name, descricao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> ordenados = eventosOrdenados();
        System.out.println(ordenados);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximEvento = null;
        Map<LocalDate, Evento> ordenados = eventosOrdenados();
        for (Map.Entry<LocalDate, Evento> entry : ordenados.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximEvento + "acontecerá na data " + proximaData);
                break;
            }
        }
    }
}
