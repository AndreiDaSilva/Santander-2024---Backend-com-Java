package Fabrica.Producao;

import Fabrica.Equipamento.Copiadora.Copiadora;
import Fabrica.Equipamento.Digitalizadora.Digitalizadora;
import Fabrica.Equipamento.Impressora.Deskjet;
import Fabrica.Equipamento.Impressora.Impressora;
import Fabrica.Equipamento.Multifucional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        
        Deskjet deskjet = new Deskjet();

        Impressora impressora = deskjet;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();


    }
    
}
