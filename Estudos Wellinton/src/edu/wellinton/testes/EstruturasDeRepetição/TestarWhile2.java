package edu.wellinton.testes.EstruturasDeRepetição;
import java.util.*;

public class TestarWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int res = 0;
        while (numero >= 0) {
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();
            res += numero;
        }
        System.out.println(res);
    }
}
