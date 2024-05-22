package edu.wellinton.testes.Desafios;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        conta cliente1 = new conta();
        cliente1.saldo = 0;

        boolean fechar = true;
        while (fechar) {

            Scanner sc = new Scanner(System.in);
            System.out.println("1- Depositar\n2- Sacar\n3- Consultar saldo\n4- Encerrar");
            System.out.println("=======================");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o saldo a depositar");
                    cliente1.depositar(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Digite o saldo para sacar");
                    cliente1.sacar(sc.nextDouble());
                    break;
                case 3:
                    cliente1.checarSaldo();
                    break;
                case 4:
                    //System.exit(0);
                    fechar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }
        }

    }
    public static class conta{
        double saldo = 0;

        void depositar(double novoSaldo){
            this.saldo += novoSaldo;
            System.out.println("Saldo atual: " + String.format("%.1f", this.saldo));
        }

        void sacar(double tirarSaldo){

            if (this.saldo < tirarSaldo){
                System.out.println("Saldo insuficiente.");
            } else {
                this.saldo -= tirarSaldo;
                System.out.println("Saldo atual: " + String.format("%.1f", this.saldo));
            }

        }

        void checarSaldo(){
            System.out.println("Saldo atual: " + String.format("%.1f", this.saldo));
        }

    }
}

