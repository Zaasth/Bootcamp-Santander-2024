package edu.wellinton.testes.POO.Msn;

public abstract class MSNMessenger {

    abstract void enviarMensagem(String msg); //Todas as classes não genericas obrigatoriamentes vão precisar desse meotodo.

    private void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
