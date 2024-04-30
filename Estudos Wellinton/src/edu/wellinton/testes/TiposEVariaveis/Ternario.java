package edu.wellinton.testes.TiposEVariaveis;

public class Ternario {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String resultado;

        //Usando if e else
        if (a == b) {
            resultado = "Verdadeiro";
        } else {
            resultado = "Falso";
        }
        System.out.println(resultado);

        //Usando o operador ternario
        a = 20;
        resultado = (a == b) ? "Verdadeiro" : "Falso";
        System.out.println(resultado);
    }
}
