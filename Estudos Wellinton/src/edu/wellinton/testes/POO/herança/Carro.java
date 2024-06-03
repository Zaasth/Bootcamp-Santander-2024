package edu.wellinton.testes.POO.herança;

public class Carro extends Veiculo{
    String name;
    int age;

    public Carro(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Carro(){}

    private void checarCombustivel(){
        System.out.println("Combustivel checado!");
    }
    private void checarCambio(){
        System.out.println("Cambio checado!");
    }
    public void ligarCarro(){
        checarCombustivel();
        checarCambio();
        System.out.println("Carro ligado!");
    }

    @Override
    public void ligar() {
        
    }
}
