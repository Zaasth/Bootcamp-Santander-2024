package edu.wellinton.testes.POO.Interface.Multifuncional;

import edu.wellinton.testes.POO.Interface.Copiadora.Copiadora;
import edu.wellinton.testes.POO.Interface.Digitalizadora.Digitalizadora;
import edu.wellinton.testes.POO.Interface.Impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("EquipamentoMultiFuncional Copiando");
    }

    @Override
    public void digitalizar() {

    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo EquipamentoMultiFuncional");
    }
}
