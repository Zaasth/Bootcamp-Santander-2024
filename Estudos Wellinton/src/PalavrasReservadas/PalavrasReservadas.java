package PalavrasReservadas;

public class PalavrasReservadas {
    public static void main(String[] args) {
        checarNumero(10, 20);
    }

    public static void checarNumero(double n1, double n2) {
        switch ((int) n1) {
            case 1:
                System.out.println("Numero 1");
                break;
            case 2:
                System.out.println("Numero 2");
                break;
        }

        for (int i = 0; i < 4 ; i++) {
            if (i % 2 == 0) {
                System.out.println("Numero par");
            } else if(i % 2 == 1) {
                System.out.println("Numero impar");
            } else if(i == 3){
                continue;
            }
            System.out.println("Numero imprimir" + i);
        }

    }
}
