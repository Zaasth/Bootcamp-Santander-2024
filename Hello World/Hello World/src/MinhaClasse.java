import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.ArrayList;

import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.runnable;

public class MinhaClasse {
    public static void main(String[] args) {

        final String BR = "Brasil";
        //BR = "França";
        String meuNome = "Wellinton", nomeAmigo = "Cleiton", nomeInimigo = "João", nomeNamorada = "Anna";
        ArrayList<String> Nomes = new ArrayList<>();
        Nomes.add(nomeNamorada);
        Nomes.add(nomeInimigo);

        for (String nome : Nomes) {
            System.out.println(nome);
        }

        int[] arrayNumeros = new int[10];
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i] = i + 1;
            System.out.println(arrayNumeros);
        }
        System.out.println("===============");
        System.out.println(Somar(10, 20));
        //System.out.println(String.format("Nome: %s", nomeNamorada + "%s", nomeInimigo));
    }

    public static String Somar (int n1, int n2) {
        double res = n1 + n2;
        return "A soma entre " + n1 + " e " + n2 + " é igual a " + res;
    }
}
