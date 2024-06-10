package edu.wellinton.testes.POO.Interface.Estabelecimento;

import edu.wellinton.testes.POO.Interface.Copiadora.Copiadora;
import edu.wellinton.testes.POO.Interface.Impressora.Impressora;
import edu.wellinton.testes.POO.Interface.Impressora.MarcaImpressora1;
import edu.wellinton.testes.POO.Interface.Impressora.MarcaImpressora2;
import edu.wellinton.testes.POO.Interface.Multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new MarcaImpressora1();
        Impressora impressora2 = new MarcaImpressora2();
        Impressora impressora3 = new EquipamentoMultiFuncional();
        Copiadora copiadora = new EquipamentoMultiFuncional();

        impressora.imprimir();
        impressora2.imprimir();
        impressora3.imprimir();
        copiadora.copiar();
    }
}
