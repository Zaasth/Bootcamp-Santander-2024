package com.estudo.escola;

import com.estudo.escola.model.Aluno;
import java.util.*;

public class Escola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do novo aluno:");
        String nome = sc.next();

        System.out.println("Digite a idade do novo aluno:");
        int idade = sc.nextInt();

        Aluno aluno = new Aluno(nome, idade);
        Aluno alunos[] = {new Aluno("Wellinton", 10), new Aluno("João", 11)};

        System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " anos.");

        System.out.println("============================");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno " + alunos[i].getNome() + " tem " + alunos[i].getIdade() + " anos.");
        }

        sc.close();
    }
}