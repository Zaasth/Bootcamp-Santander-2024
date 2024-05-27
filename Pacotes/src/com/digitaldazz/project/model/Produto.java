package com.digitaldazz.project.model;
import com.digitaldazz.project.enums.*;

public class Produto {
    String nome;
    Tipo tipo;
    String descricao;
    int id;
    double preco;
    Desconto desconto;

    // Construtor
    public Produto(String nome, Tipo tipo, String descricao, int id, double preco, Desconto desconto) {
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.id = id;
        this.preco = preco;
        this.desconto = desconto;

        if (id < 0){
            this.id = Math.abs(id);
        }
        if(descricao.length() > 60){
            this.descricao = "A descrição precisa ter menos de 60 caracteres";
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo(){
        return this.tipo;
    }

    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getId() {
        return String.valueOf(id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getpreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public Desconto getDesconto(){
        return this.desconto;
    }

    public void setDesconto(Desconto desconto){
        this.desconto = desconto;
    }

}
