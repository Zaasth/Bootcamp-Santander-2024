package com.estudo.escola.model;


public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        if (nome != null && nome.length() > 1) {
            // Transformando a primeira letra em maiúscula e o restante em minúsculas
            nome = nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();
        } else if (nome != null && nome.length() == 1) {
            // Caso o nome tenha apenas um caractere
            nome = nome.toUpperCase();
        }
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
