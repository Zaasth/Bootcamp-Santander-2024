package com.digitaldazz.project.services;

import com.digitaldazz.project.model.Produto;

import java.util.Locale;

public class Services {
    public static String getInfos(Produto produto, String info){
        info = info.toLowerCase(Locale.ROOT);
        switch (info){

            case "nome":
                return produto.getNome();
            case "tipo":
                return String.valueOf(produto.getTipo());
            case "descricao":
                return produto.getDescricao();
            case "id":
                return String.valueOf(produto.getId());
            case "preco":
                return String.valueOf(produto.getpreco());
            case "desconto":
                return String.valueOf(produto.getDesconto());
            case "all":
                return "Nome: " + produto.getNome() + "\nTipo: " + produto.getTipo() + "\nDescrição: " + produto.getDescricao() + "\nId: " + produto.getId() + "\nPreço: " + "R$" + produto.getpreco() + "\nDesconto: " + produto.getDesconto();
            default:
                return "Parametro 'info' Inválido";
        }
    }
}
