package edu.wellinton.testes.TiposEVariaveis;

public class Operadores {
    public static void main(String[] args) {
        String nomeDaString = "Texto";
        char[] nomeDoChar = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };
        int userInput = 10;
        for (int i = 0; i < userInput; i++) {
            int numeroRandom = (int) (Math.random() * nomeDoChar.length);
            System.out.print(nomeDoChar[numeroRandom]);
        }

        double soma = 10.5 + 15.7;
        int subtraçao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

    }
}