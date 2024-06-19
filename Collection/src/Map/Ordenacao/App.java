package Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 18), "Evento 1", "Evento 11");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 30), "Evento 2", "Evento 12");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 25), "Evento 3", "Evento 13");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 31), "Evento 4", "Evento 14");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();

    }
}
