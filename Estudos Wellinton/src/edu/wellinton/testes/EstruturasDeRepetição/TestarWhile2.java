package edu.wellinton.testes.EstruturasDeRepetição;
import java.util.*;

public class TestarWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        int res = 0;
        while (numero != 0) {
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();
            res += numero;

            if (numero > 100) {
                System.out.println("O seu número passou de 100");
                break;
            }

        }
        System.out.println("A soma entre os números é: ".concat(String.valueOf(res)));
    }
}
