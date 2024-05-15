package edu.wellinton.testes.EstruturasExcepcionais;

public class ValidarCep{
    public static void main(String[] args) {

        try {
            String meuCep = formatarCep("2376506");
            System.out.println(meuCep);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde as regras de negócio.");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

        //simulando um cep formatado
        return "23.765-064";
    }
}
