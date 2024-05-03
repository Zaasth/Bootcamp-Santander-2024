package edu.wellinton.testes.Desafios;

import static edu.wellinton.testes.Metodos.TestarMetodos.Somar;

public class Media {
    public static void main(String[] args) {
        int[] arrayNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int res = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            res += arrayNumbers[i];
        }
        System.out.println(Somar(1, 2));
    }
}
