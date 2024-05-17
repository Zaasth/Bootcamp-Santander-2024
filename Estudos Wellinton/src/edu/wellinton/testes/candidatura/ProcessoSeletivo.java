package candidatura;
import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        double salarioBase = 2000;

        double salarioPretendido = gerarSalarioRandom();
        //String salarioPretendidoString = String.format("%.2f", salarioPretendido);
        System.out.println(salarioPretendido);
        if (salarioPretendido < salarioBase){
            System.out.println("Ligue para o canditado!");
        } else if(salarioPretendido == salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA;");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }


    }

    public static double gerarSalarioRandom(){
        double salario = ThreadLocalRandom.current().nextDouble(1800, 2500);
        return salario;
    }
}
