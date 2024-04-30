package edu.wellinton.testes.Desafios;

public class Media {
    public static void main(String[] args) {
        int[] arrayNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int res = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            res += arrayNumbers[i];
        }
        res = res / arrayNumbers.length;
        System.out.println("A média desse array é: " + res);
    }
}
