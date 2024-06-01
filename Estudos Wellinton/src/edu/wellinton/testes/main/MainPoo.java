package edu.wellinton.testes.main;

import edu.wellinton.testes.Enums.Tipo;
import edu.wellinton.testes.POO.herança.Carro;
import edu.wellinton.testes.POO.Pessoa;
import edu.wellinton.testes.POO.Produto.ProdutoModel;
import edu.wellinton.testes.POO.Produto.Util;

import static edu.wellinton.testes.Enums.Desconto.*;

public class MainPoo {
    public static void main(String[] args) {

        ProdutoModel produto = new ProdutoModel("Esfirra", Tipo.Alimento, "Uma Esfirra foda!", 1, 3.50, sim);
        Pessoa p1 = new Pessoa("Felipe", "323.432.344-84");

        System.out.println(Util.formatarCpf(p1));
        System.out.println("======================");
        Carro carro1 = new Carro("Toyota", 2010);
        carro1.ligarCarro();
    }
}