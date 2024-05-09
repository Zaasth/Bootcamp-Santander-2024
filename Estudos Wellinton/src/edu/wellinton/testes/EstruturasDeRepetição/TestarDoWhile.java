package edu.wellinton.testes.EstruturasDeRepetição;
import java.util.*;

public class TestarDoWhile {
    public static void main(String[] args) {
        int n1 = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Testando d-while");
            n1 = sc.nextInt();
        }
        while (n1 < 10);

        System.out.println("Finalizado");
    }
}
