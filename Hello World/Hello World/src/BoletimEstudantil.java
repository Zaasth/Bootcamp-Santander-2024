public class BoletimEstudantil {
    public static void main(String[] args) {
        AprovarAluno(10);
    }

    public static void AprovarAluno(int nota){
        /*
        double numeroAleatorio =  (Math.random() * 10) + 1;
        System.out.println(numeroAleatorio);
        mediaFinal = (int) numeroAleatorio;
        System.out.println(mediaFinal);
      */

      if (nota < 6)
           System.out.println("REPROVADO");
      else if (nota == 7)
           System.out.println("PROVA MINERVA");
      else
          System.out.println("APROVADO");


    }
}
