package edu.wellinton.testes.EstruturasDeRepetição;

public class TestarBreakAndContinue {
    public static void main(String[] args) {
        int ids[] = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10};

        for(int id : ids){
            if (id == 6){
                continue;
            }
            System.out.println(id);
        }
        ids.clone();

    }
}
