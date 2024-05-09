package edu.wellinton.testes.EstruturasDeRepetição;
import java.util.*;

public class TabuadaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o número da tabuada");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
