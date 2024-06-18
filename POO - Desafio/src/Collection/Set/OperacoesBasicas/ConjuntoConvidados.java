import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoCovidado) {
        convidadoSet.add(new Convidado(nome, codigoCovidado));
    }

    public void removerConvidadoPorCodigo(int codigoConvite) {
        Convidado removerConvidado = null;

        for (Convidado c : convidadoSet) {
            if (c.getCodigoCovidado() == codigoConvite) {
                removerConvidado = c;
                break;
            }
        }
        convidadoSet.remove(removerConvidado);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
}
