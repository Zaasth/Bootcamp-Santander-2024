package edu.wellinton.testes.POO;

public class Pessoa {
    String nome;
    String cpf;

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public static String getCpf(Pessoa pessoa){
        return pessoa.cpf;
    }
}
