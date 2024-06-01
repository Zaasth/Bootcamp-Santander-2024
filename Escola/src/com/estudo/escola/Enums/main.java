package com.estudo.escola.Enums;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String nome = "Wellinton";
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = sc.next();
        System.out.println("Olá ".concat(nome));
    }
}
