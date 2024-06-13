package Generics;

import java.util.*;

public class GenericExampleList {
    public static void main(String[] args) {
        //Exemplo sem generics
        List listaSemGeneric = new ArrayList();
        listaSemGeneric.add("Elemento 1");
        listaSemGeneric.add(10); //Permite adicionar qualquer tipo de objeto;

        //Exemplo com generics
        List<String> listaComGeneric = new ArrayList<>();
        listaComGeneric.add("Elemento 1");
        listaComGeneric.add("Elemento 2");
        //listaComGeneric.add(10) // Não permite adicioinar outro tipo de objeto como Integer.

        // Iterando sobre a lista com Generics
        for(String elemento : listaComGeneric){
            System.out.println(elemento);
        }
        System.out.println("============================");

        // Iterando sobre a lista sem Generics (necessário fazer cast)
        for(Object elemento : listaSemGeneric){
            String str = (String) elemento; //Converte tudo pra string
            System.out.println(str);
        }

    }
}
