package edu.wellinton.testes.Deubbing;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.1f", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        try {
            double soma = 0;
            for(String aluno : alunos) {
                System.out.print("Nota do aluno ".concat(aluno).concat(": "));
                double nota = scanner.nextDouble();
                soma += nota;
            }

            return soma / alunos.length;
        } catch (NoSuchElementException e){
            System.out.println("As notas precisam ser números!");
            System.out.println("=============");
        }

        return 0;
    }

}
