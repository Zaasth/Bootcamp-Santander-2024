package edu.wellinton.testes.CondicionalComposta;
import java.util.*;

public class Teste1 {
    public static void main(String[] args) {

        int nota = (int) (Math.random() * 10) + 1;
        System.out.println(nota);

        if(nota >= 7)
            System.out.println("Aprovado");

        else
            System.out.println("Reprovado");
    }
}
