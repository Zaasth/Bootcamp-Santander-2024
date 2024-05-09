package edu.wellinton.testes.POO;

public class Conta {
    double saldo = 0;
    String titular;
    double agencia;
    int numero;

    public void cadastrarConta(String titular, double agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }
    public void visualizarConta() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }
    public void depositar(double valor) {
        this.saldo += valor;
    }
}
