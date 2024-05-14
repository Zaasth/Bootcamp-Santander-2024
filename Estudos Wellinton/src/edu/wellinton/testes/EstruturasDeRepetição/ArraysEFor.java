package edu.wellinton.testes.EstruturasDeRepetição;

public class ArraysEFor {
    public static void main(String[] args) {
        String nomes[] = {"Wellinton", "Cleiton", "José", "Pedro"};

        for(int i = 0; i < nomes.length; i++){
            System.out.println("Nome:".concat(nomes[i]));
        }

        for(String nome : nomes){
            System.out.println("Nome:".concat(nome));
            if(nome.equalsIgnoreCase("Wellinton")){

            }
        }
        
    }
}
