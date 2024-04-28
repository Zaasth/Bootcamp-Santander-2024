package edu.wellinton.testes.Metodos;

public class TestarMetodos {
    public static void main(String[] args) {
        int randomNumber = (int)(Math.random()*100) + 1;
        int randomNumber2 = (int)(Math.random()*200) + 1;

        System.out.println(Somar(randomNumber, randomNumber2));
    }
    public static int Somar(int n1, int n2) {
        int resultado = n1 + n2;
        return resultado;
    }

}
