package com.estudo.escola.services;

import com.estudo.escola.model.Pessoa;

public class SistemaCadastro {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("Wellinton", "1234567");

        //definimos o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");

        //e como definir o nome e cpf do marcos ?

        //imprimindo o marcos sem o nome e cpf

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}

