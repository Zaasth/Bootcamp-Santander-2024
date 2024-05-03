package edu.wellinton.testes.Metodos;

public class TestarMetodos {
    public static void main(String[] args) {
        int randomNumber = (int)(Math.random()*100) + 1;
        int randomNumber2 = (int)(Math.random()*200) + 1;

        System.out.println(Somar(randomNumber, randomNumber2));
        int res = Somar(10, 20);
        imprimir(String.valueOf(Somar(10, 20))); //Retorna O seu texto é: 30
    }
    public static int Somar(int n1, int n2) {
        int resultado = n1 + n2;
        return resultado;
    }
    private static void imprimir(String text){
        System.out.println(STR."O seu texto é: \{text}");
    }
}

