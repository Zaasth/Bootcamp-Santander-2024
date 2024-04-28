package edu.wellinton.testes.MathRandom;

public class RandomNumbers {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 10) + 1; //Está gerando um double aleatorio de 0 a 9, ai no final adiciona +1 pra ficar correto e no final converte pra int.
        System.out.println(num);
    }
}
