package edu.wellinton.testes.TiposEVariaveis;

public class Escopo {
    int todaClasse = 10;

    public static void metodoUm(){
        int todoEsseMetodo = 20;

        for (int i = 0; i < todoEsseMetodo; i++) {
            int todoFor = 30;
        }

    }
}
