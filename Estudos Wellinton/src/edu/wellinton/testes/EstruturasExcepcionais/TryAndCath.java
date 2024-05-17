package edu.wellinton.testes.EstruturasExcepcionais;
import java.util.*;

public class TryAndCath {
    public static void main(String[] args) {
        aboutMe();
    }

    public static void aboutMe(){
        clearTerminal();
        try {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome:");
            String nome = formatarNome(sc.next());
            //nome = formatarNome(nome);

            System.out.println("Digite seu sobrenome:");
            String sobrenome = formatarNome(sc.next());
            //sobrenome = formatarNome(sobrenome);

            System.out.println("Digite sua idade:");
            int idade = sc.nextInt();

            System.out.println("Digite sua altura:");
            double altura = sc.nextDouble();

            System.out.println("Olá, me chamo ".concat(nome).concat(" ").concat(sobrenome));
            System.out.println("Tenho ".concat(String.valueOf(idade)) + " anos.");
            System.out.println("Minha altura é ".concat(String.valueOf(altura)) + " cm");

            sc.close();
        } catch (InputMismatchException e){
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Os campos idade e altura devem ser números.");
            System.out.println("Aperte enter para reiniciar a aplicação");
            String opcao = sc.nextLine();
            aboutMe();
        }
    }

    public static String formatarNome(String nome) {
        return nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();
    }

    public static void clearTerminal() {
        // Limpa o terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
