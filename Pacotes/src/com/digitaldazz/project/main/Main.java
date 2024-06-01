package com.digitaldazz.project.main;

import com.digitaldazz.project.enums.Desconto;
import com.digitaldazz.project.enums.Tipo;
import com.digitaldazz.project.model.Produto;
import com.digitaldazz.project.services.Services;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Esfirra", "Uma esfirra muito foda!", 1, 3.50);
        Produto cleiton = new Produto("Refrigerante", "Descrição foda!", 2, 6.00);

        System.out.println(Services.getInfos(produto, "all"));
        produto.setPreco(10.50);
        System.out.println(Services.getInfos(produto, "preco"));
    }
}