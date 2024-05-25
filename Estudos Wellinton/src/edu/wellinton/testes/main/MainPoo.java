package edu.wellinton.testes.main;

import edu.wellinton.testes.Enums.Tipo;
import edu.wellinton.testes.POO.Crianca;
import edu.wellinton.testes.POO.Produto.ProdutoModel;
import edu.wellinton.testes.POO.Produto.Services;
import edu.wellinton.testes.POO.Produto.Util;

import static edu.wellinton.testes.Enums.Desconto.*;

public class MainPoo {
    public static void main(String[] args) {
        /*
        Crianca crianca1 = new Crianca("Wellinton", 8, "Parda", "Masculino");
        Crianca crianca2 = new Crianca("Cleiton", 6, "Branco", "Maculino");

        crianca1.mostrarInfos();
        System.out.println("=======================");
        crianca2.mostrarInfos();
        System.out.println("=======================");
        crianca1.correr(10);
        */
        ProdutoModel produto = new ProdutoModel("Esfirra", Tipo.Alimento, "Uma Esfirra foda!", 1, 3.50, não);
        boolean validarId = Util.validarIdProduto(produto);

            if (validarId == true){
                System.out.println("Id válido");
            } else {
                System.out.println("Id inválido");
            }

        System.out.println(Util.formatarId(produto.getId()));
        System.out.println(Services.getInfos(produto, "all"));
    }
}