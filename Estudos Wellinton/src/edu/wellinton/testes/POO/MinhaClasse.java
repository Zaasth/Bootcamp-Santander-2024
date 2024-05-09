package edu.wellinton.testes.POO;

public class MinhaClasse {
    // Atributos da classe
    private int valor;
    private String nome;

    // Construtor padrão
    public MinhaClasse() {
        // Inicializa os atributos com valores padrão
        this.valor = 0;
        this.nome = "Sem nome";
    }

    // Construtor com parâmetros
    public MinhaClasse(int valor, String nome) {
        // Inicializa os atributos com os valores passados como argumento
        this.valor = valor;
        this.nome = nome;
    }

    // Método de impressão
    public void imprimir() {
        System.out.println("Valor: " + valor + ", Nome: " + nome);
    }

    // Método main
    public static void main(String[] args) {
        // Criando objetos usando construtores
        MinhaClasse objeto1 = new MinhaClasse(); // Usa o construtor padrão
        MinhaClasse objeto2 = new MinhaClasse(10, "Objeto 2"); // Usa o construtor com parâmetros

        // Chamando o método imprimir para visualizar os valores dos objetos
        objeto1.imprimir();
        objeto2.imprimir();
    }
}
