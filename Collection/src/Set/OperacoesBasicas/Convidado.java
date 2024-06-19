import java.util.Objects;

public class Convidado {
    private String name;
    private int codigoCovidado;

    /**
     * @param name
     * @param codigoCovidado
     */
    public Convidado(String name, int codigoCovidado) {
        this.name = name;
        this.codigoCovidado = codigoCovidado;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the codigoCovidado
     */
    public int getCodigoCovidado() {
        return codigoCovidado;
    }

    /**
     * @param codigoCovidado the codigoCovidado to set
     */
    public void setCodigoCovidado(int codigoCovidado) {
        this.codigoCovidado = codigoCovidado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoCovidado);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        return codigoCovidado == other.codigoCovidado;
    }

    @Override
    public String toString() {
        return "Convidado {name: " + name + '\'' + ", convite: " + codigoCovidado + "}";
    }
}
