package com.estudo.testespring.Business;

import com.estudo.testespring.Model.Pessoa;

public class PessoaBusiness {

    public void mudarSexo(Pessoa pessoa, String novoSexo){
        pessoa.setSexo(novoSexo);
    }

    public void casar(Pessoa pessoa, String antigoSobrenome, String novoSobrenome){
        pessoa.setNome(pessoa.getNome().replace(antigoSobrenome, novoSobrenome));
    }
}
