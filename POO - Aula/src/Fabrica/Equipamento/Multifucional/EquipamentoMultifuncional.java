package Fabrica.Equipamento.Multifucional;

import Fabrica.Equipamento.Copiadora.Copiadora;
import Fabrica.Equipamento.Digitalizadora.Digitalizadora;
import Fabrica.Equipamento.Impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Digitalizadora, Copiadora{

    @Override
    public void copiar() {
        System.out.println("COPIANDO MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO MULTIFUNCIONAL");
    }

    @Override
    public void imprimir() {
    System.out.println("IMPRIMINDO MULTIFUNCIONAL");  
    }
    
}
