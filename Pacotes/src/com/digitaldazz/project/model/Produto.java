package com.digitaldazz.project.model;
import com.digitaldazz.project.enums.*;

public class Produto {
    String nome;
    String descricao;
    int id;
    double preco;

    // Construtor
    public Produto(String nome, String descricao, int id, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.id = id;
        this.preco = preco;

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



}
