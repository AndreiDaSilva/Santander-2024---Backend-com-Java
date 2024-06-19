package PesquisaDesafio;

public enum TarefaEnum {
    FEITO(true),
    FAZER(false);

    private final boolean isStatus;

    TarefaEnum(boolean isStatus){
        this.isStatus = isStatus;
    }

    public boolean getStatus(){
        return isStatus;
    }

}
