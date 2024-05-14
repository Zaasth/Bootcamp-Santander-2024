package edu.wellinton.testes.CondicionalComposta;
import java.util.*;

public class TestarSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sigla:");
        System.out.println("================");
        String sigla = sc.nextLine();
        sigla = sigla.substring(0, 1).toUpperCase() + sigla.substring(1, sigla.length()).toLowerCase();
        System.out.println(sigla);
        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }


    }
}
