package com.digitaldazz.project.main;

import com.digitaldazz.project.enums.Desconto;
import com.digitaldazz.project.enums.Tipo;
import com.digitaldazz.project.model.Produto;
import com.digitaldazz.project.services.Services;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Esfirra", Tipo.Alimento, "Uma esfirra muito foda!", 01, 3.50, Desconto.não);

        System.out.println(Services.getInfos(produto, "all"));
        produto.setPreco(10.50);
        System.out.println(Services.getInfos(produto, "preco"));
    }
}