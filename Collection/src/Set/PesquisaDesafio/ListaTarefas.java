package PesquisaDesafio;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    public void addTarefa(String titulo, String descricao) {
        listaTarefas.add(new Tarefa(titulo, descricao));
    }

    public void removeTarefa(String titulo) {
        Tarefa tarefaRemover = null;
        if (!listaTarefas.isEmpty()) {
            for (Tarefa t : listaTarefas) {
               if (t.getTitulo().equalsIgnoreCase(titulo)) {
                tarefaRemover = t;
                break;
               }
            }
        }
        listaTarefas.remove(tarefaRemover);
    }

    public void exibirTarefas() {
        System.out.println(listaTarefas);
    }

    public void contarTarefas() {
        System.out.println(listaTarefas.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!listaTarefas.isEmpty()) {
            for (Tarefa t : listaTarefas) {
                if (t.getTarefaEnum() == TarefaEnum.FEITO) {
                    tarefasConcluidas.add(t);
                }
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!listaTarefas.isEmpty()) {
            for (Tarefa t : listaTarefas) {
                if (t.getTarefaEnum() == TarefaEnum.FAZER) {
                    tarefasPendentes.add(t);
                }
            }
        }
        return tarefasPendentes;
    }

    public Tarefa marcarTarefaConcluida(String titulo){
        Tarefa tarefaConcluida = null;
        for (Tarefa t : listaTarefas) {
            if (t.getTitulo().equalsIgnoreCase(titulo)) {
                t.setTarefaEnum(TarefaEnum.FEITO);
                tarefaConcluida = t;
            }
        }
        return tarefaConcluida;
    }

    public Tarefa marcartarefaPendente(String titulo){
        Tarefa tarefaPendetente = null;
        for (Tarefa t : listaTarefas) {
            if (t.getTitulo().equalsIgnoreCase(titulo)) {
                t.setTarefaEnum(TarefaEnum.FAZER);
                tarefaPendetente = t;
            }
        }
        return tarefaPendetente;
    }

    public Set<Tarefa> limparListaTarefas(){
        this.listaTarefas = new HashSet<>();
        return listaTarefas;
    }

}
