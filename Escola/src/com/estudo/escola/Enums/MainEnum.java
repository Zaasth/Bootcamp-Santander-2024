package com.estudo.escola.Enums;

public class MainEnum {
    public static void main(String[] args) {
        EstadoBrasileiro estado = EstadoBrasileiro.PIAUI;

        for(EstadoBrasileiro e : EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
    }
}
