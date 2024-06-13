package Generics;
import java.util.*;

public class GenericsExempleMap {
    public static void main(String[] args) {
        // Exemplo sem Generics
        Map mapSemGenerics = new HashMap();
        mapSemGenerics.put("Chave 1", 10);
        mapSemGenerics.put("Chave 2", "valor");  // Permite adicionar qualquer tipo de objeto

        // Exemplo com Generics
        Map<String, Integer> mapComGenerics = new HashMap<>();
        mapComGenerics.put("Chave 1", 10);
        mapComGenerics.put("Chave 2", 20);

        // Iterando sobre o mapa com Generics
        for (Map.Entry<String, Integer> entry : mapComGenerics.entrySet()) {
            String chave = entry.getKey();
            int valor = entry.getValue();
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

        // Iterando sobre o mapa sem Generics (necessário fazer cast)
        for (Object obj : mapSemGenerics.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            String chave = (String) entry.getKey();
            Object valor = entry.getValue();
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }
    }
}
