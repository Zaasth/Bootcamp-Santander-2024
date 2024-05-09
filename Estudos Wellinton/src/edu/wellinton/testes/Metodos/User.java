package edu.wellinton.testes.Metodos;

import edu.wellinton.testes.POO.Conta;
import edu.wellinton.testes.POO.MinhaClasse;

public class User {
    public static void main(String[] args) {
        //Aqui a SmartTv é como se fosse um int, long ou string, mas é uma classe criada por mim.
        /*
        SmartTv tv1 = new SmartTv();

        tv1.ligar();
        tv1.aumentarSom();
        tv1.aumentarSom();
        tv1.aumentarSom();
        tv1.reduzirSom();
        tv1.reduzirCanal();
        tv1.mudarCanal(23);
        */

        Conta user1 = new Conta();
        MinhaClasse user2 = new MinhaClasse();
        user1.cadastrarConta("Wellinton", 2324349, 123098);
        user1.visualizarConta();
        user1.depositar(500);
        user1.visualizarConta();
    }
}
