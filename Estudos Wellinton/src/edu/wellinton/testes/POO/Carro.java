package edu.wellinton.testes.POO;

public class Carro {
    String name;
    int age;

    public Carro(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", 2010);
        System.out.println(carro1.name);
        System.out.println(carro1.age);
    }
}
