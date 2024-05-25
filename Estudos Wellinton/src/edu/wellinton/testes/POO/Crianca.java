package edu.wellinton.testes.POO;

public class Crianca {
    String name;
    int age;
    String color;
    String sex;

    public Crianca(String name, int age, String color, String sex){
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
    }

    public void mostrarInfos(){
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Cor: " + color);
        System.out.println("Genero: " + sex);
    }

    public void correr(double tempo){
        for (int i = 0; i < tempo; i++) {
            System.out.println(this.name + " Já correu " + i + " metros!");
        }
    }

    public void mudarIdade(int age){
        this.age = age;
        System.out.println("Nova idade: " + age);
    }
}
