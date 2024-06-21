package List;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.reverse;
import static java.util.Collections.shuffle;

public class TestList {

    public static void main(String[] args) {
        List lista = new ArrayList();
        String nome = "Jorgin";
        List lista2 = new ArrayList();
        lista2.add("3");
        lista2.add("Pedro");
        lista2.add("João");
        lista2.add(10);

        lista.add(1);
        lista.add(2);
        lista.add("3");
        lista.add(4);
        lista.add(5);

        lista.removeAll(lista2);
        lista.add(1);
        lista.add(nome);
        lista.addAll(lista2);

        shuffle(lista);
        //lista.remove(3);
        //System.out.println(lista.get(3));

        for(Object num : lista){
            System.out.println(num);
        }

    }
}
