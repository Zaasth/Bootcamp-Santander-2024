package List.Exercicios.Segundo;

public class Teste {
    public static void main(String[] args) {
        CarrinhoDeCompras.adicionarItem("Item1", 23.5, 10);
        CarrinhoDeCompras.adicionarItem("Item2", 53.0, 2);
        CarrinhoDeCompras.exibirItems();
        //CarrinhoDeCompras.removerItem("Item1");
        CarrinhoDeCompras.exibirItems();
        CarrinhoDeCompras.calcularValorTotal();
    }
}
