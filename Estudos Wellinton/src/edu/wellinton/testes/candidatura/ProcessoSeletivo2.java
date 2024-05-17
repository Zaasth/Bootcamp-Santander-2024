package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo2 {
    public static void main(String[] args) {
        String []canditados = {"Wellinton", "João", "Pedro", "Ana", "Luiz", "FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        double salarioBase = 2000;
        int count = 0;

        for (String canditado : canditados){
            double salarioCanditado = gerarSalario();
            String salarioCanditadoString = String.format("%.2f", salarioCanditado);

            if (salarioCanditado <= salarioBase && count < 5){
                System.out.println("Canditado " + canditado + " escolhido.");
                count++;
            }
        }

    }

    static double gerarSalario(){
        return ThreadLocalRandom.current().nextDouble(1800, 2300);
    }
}
