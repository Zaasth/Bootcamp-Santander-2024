package edu.wellinton.testes.EstruturasDeRepetição;

public class TesteFor {
    public static void main(String[] args) {

        int quantidadeCarneirinhos = (int) (Math.random() * 100) + 1;

        for(int carneirinhos = 1 ; carneirinhos <= quantidadeCarneirinhos; carneirinhos ++) {
            if(carneirinhos == 1) {
                System.out.println(carneirinhos + " - Carneirinho");
            }
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }

        System.out.println("Joãozinho dormiu!");
    }
}
