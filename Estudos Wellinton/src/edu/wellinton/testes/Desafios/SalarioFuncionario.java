package edu.wellinton.testes.Desafios;
import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

public class SalarioFuncionario {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite o salário do funcionário: ");
            double salario = sc.nextDouble();
            System.out.println("Digite o valor dos beneficios: ");
            double beneficios = sc.nextDouble();

            System.out.println(calcularSalario(salario, beneficios));
        } catch (NoSuchElementException e){
            System.out.println("Não aceita texto.");
        }

    }

    static double calcularSalario(double salario, double beneficios){

            double imposto = 0;

            if (salario < 1100.00){
                imposto = 5;
                imposto = (salario*imposto)/100;
            } else if(salario > 1100.01 && salario < 2500.00){
                imposto = 10;
                imposto = (salario*imposto)/100;
            } else {
                imposto = 15;
                imposto = (salario*imposto)/100;
            }

            double salarioCalculado = (salario - imposto) + beneficios;

            return salarioCalculado;
    }

    static double gerarSalario(){
        return ThreadLocalRandom.current().nextDouble(1100, 3000);
    }
}
