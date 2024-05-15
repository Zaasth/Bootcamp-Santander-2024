package edu.wellinton.testes.EstruturasExcepcionais;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75");

        try {
            //valor = NumberFormat.getInstance().parse("a1.75");
        } catch (NumberFormatException e) {
            System.out.println("Ocorreu um erro");
        }

        System.out.println(valor);
    }
}
