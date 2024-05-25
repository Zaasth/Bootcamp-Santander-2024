package edu.wellinton.testes.POO.Produto;

import java.util.Locale;

public class Services {

    public static String getInfos(ProdutoModel produto, String info){
        info = info.toLowerCase(Locale.ROOT);
        switch (info){

            case "nome":
                return produto.nome;
            case "tipo":
                return String.valueOf(produto.tipo);
            case "descricao":
                return produto.descricao;
            case "id":
                return String.valueOf(produto.id);
            case "preco":
                return String.valueOf(produto.preco);
            case "desconto":
                return String.valueOf(produto.desconto);
            case "all":
                return "Nome: " + produto.nome + "\nTipo: " + produto.tipo + "\nDescrição: " + produto.descricao + "\nId: " + produto.id + "\nPreço: " + "R$" + produto.preco + "\nDesconto: " + produto.desconto;
            default:
                return "Parametro 'info' Inválido";
        }
    }
}
