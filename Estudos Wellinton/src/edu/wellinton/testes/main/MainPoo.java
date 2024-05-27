package edu.wellinton.testes.main;

import edu.wellinton.testes.Enums.Tipo;
import edu.wellinton.testes.POO.Crianca;
import edu.wellinton.testes.POO.Pessoa;
import edu.wellinton.testes.POO.Produto.ProdutoModel;
import edu.wellinton.testes.POO.Produto.Services;
import edu.wellinton.testes.POO.Produto.Util;

import static edu.wellinton.testes.Enums.Desconto.*;

public class MainPoo {
    public static void main(String[] args) {

        ProdutoModel produto = new ProdutoModel("Esfirra", Tipo.Alimento, "Uma Esfirra foda!", 1, 3.50, sim);
        boolean validarId = Util.validarIdProduto(produto);

            if (validarId == true){
                System.out.println("Id válido");
            } else {
                System.out.println("Id inválido");
            }

        System.out.println(Util.formatarId(produto.getId()));
        System.out.println(Services.getInfos(produto, "all"));
        System.out.println("=====================");
        System.out.println(Services.aplicarDesconto(produto, 20));
        System.out.println("=====================");

        Pessoa p1 = new Pessoa("Wellinton", "177.438.357-82");
        System.out.println(Util.formatarCpf(p1));
    }
}