package edu.wellinton.testes.Documentação;

public class EqualsIgnoreCase {
    public static void main(String[] args) {

        String nome = "Wellinton";
        String nome2 = "weLlinToN";
        String nome3 = "Wellinton";

        if (nome.equalsIgnoreCase(nome2)) {
            System.out.println("Nome igual");
        } else {
            System.out.println("Nome diferente");
        }
    }
}
