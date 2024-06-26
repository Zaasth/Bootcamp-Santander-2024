package List.Exercicios.Segundo;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    static List<Item> items = new ArrayList<>();

    static List<Item> adicionarItem(String nome, Double preco, Integer quantidade){
        items.add(new Item(nome, preco, quantidade));
        return items;
    }

    public static void exibirItems(){
        for (Item item : items){
            System.out.println("====================");
            System.out.println(item.getNome());
            System.out.println(item.getPreco());
            System.out.println(item.getQuantidade());
        }
    }

    static List<Item> removerItem(String nome){
        for (Item item : items){
            if (nome == item.getNome()){
                items.remove(item);
            }
        }
        return items;
    }

    static void calcularValorTotal(){
        Double preco = 0.0;
        for (Item item: items){
            preco += item.getPreco();
        }
        System.out.println("Preço do carrinho: " + preco);
    }

}
