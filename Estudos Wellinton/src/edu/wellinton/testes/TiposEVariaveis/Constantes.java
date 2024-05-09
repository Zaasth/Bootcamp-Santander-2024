package edu.wellinton.testes.TiposEVariaveis;

public class Constantes {
    public static void main(String[] args) {
        final String COUNTRY = "Brazil";
        System.out.println("Your country is " + COUNTRY);

        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < NUMBERS.length ; i++) {
            System.out.print(NUMBERS[i]);
        }
    }
}
