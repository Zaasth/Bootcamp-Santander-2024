package com.estudo.escola.Enums;

public enum EstadoBrasileiro {
    RIO_JANEIRO("RJ", "Rio de janeiro"),
    SAO_PAULO("SP", "São paulo"),
    PIAUI ("PI", "Piauí"),
    MARANHAO ("MA","Maranhão")
    ;

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String sigla, String nome) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String nomeMaisculo(){
        return this.nome.toUpperCase();
    }
}
