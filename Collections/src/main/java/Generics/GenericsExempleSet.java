package Generics;
import java.util.*;

public class GenericsExempleSet {
    public static void main(String[] args) {
        // Exemplo sem Generics
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add(10);  // Permite adicionar qualquer tipo de objeto

        // Exemplo com Generics
        Set<String> conjuntoComGenetics = new HashSet<>();
        conjuntoComGenetics.add("Elemento 1");
        conjuntoComGenetics.add("Elemento 2");
        //conjuntoSemGenerics.add(10) // Não permite adicioinar outro tipo de objeto como Integer.

        // Iterando sobre o conjunto com Generics
        for(String elemento : conjuntoComGenetics){
            System.out.println(elemento);
        }
        System.out.println("===========================");
        // Iterando sobre o conjunto sem Generics (necessário fazer cast)
        for(Object elemento : conjuntoSemGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}
