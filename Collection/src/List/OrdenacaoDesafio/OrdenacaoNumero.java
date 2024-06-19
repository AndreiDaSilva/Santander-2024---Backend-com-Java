package List.OrdenacaoDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {
    private List<Integer> ordenacaoNumeros;

    public OrdenacaoNumero(){
        this.ordenacaoNumeros = new ArrayList<>();
    }

    public void addNumero(int numero){
        ordenacaoNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ordenadoAscendente = new ArrayList<>(ordenacaoNumeros);
        Collections.sort(ordenadoAscendente);
        return ordenadoAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> ordenadoDescente = new ArrayList<>(ordenacaoNumeros);
        Collections.sort(ordenadoDescente, Collections.reverseOrder());
        return ordenadoDescente;
    }
}


