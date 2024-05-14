package edu.wellinton.testes.EstruturasDeRepetição;
import java.util.Random;

public class TestarDoWhile2 {
    public static void main(String[] args) {
        System.out.println("Discando...");
        int count = 0;
        do {
            //excutando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");
            count++;
        }while(tocando());

        System.out.println("Alô !!!");
        System.out.println("O telefone tocou ".concat(String.valueOf(count)) + " vezes!");
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu; //inverte falso e verdadeiro
    }
}
