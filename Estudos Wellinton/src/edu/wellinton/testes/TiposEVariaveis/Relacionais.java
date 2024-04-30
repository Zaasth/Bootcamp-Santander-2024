package edu.wellinton.testes.TiposEVariaveis;

public class Relacionais {
    public static void main(String[] args) {

        String nomeUm = "Wellinton";
        String nomeDois = new String("Wellinton");

        System.out.println(nomeUm == nomeDois); //Retorna false
        System.out.println(nomeUm.equals(nomeDois)); //Retorna True

        int n1 = 10;
        int n2 = 20;

        int res = (n1 > n2 || n1 == n2) ? 1 : (n1 <= n2 && n1 != n2) ? 2 : 3;
        System.out.println(res);
    }
}
