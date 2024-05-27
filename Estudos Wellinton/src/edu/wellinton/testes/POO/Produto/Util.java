package edu.wellinton.testes.POO.Produto;

import edu.wellinton.testes.POO.Pessoa;

public class Util {

    public static boolean validarIdProduto(ProdutoModel produto){
        String id = String.valueOf(produto.getId());
        id = formatarId(id);

        if(id != null && id.length() <= 8){
            return true;
        } else {
            return false;
        }
    }

    public static String formatarId(String id){
        return id.replace("-", "");
    }

    public static String formatarCpf(Pessoa pessoa){
        return Pessoa.getCpf(pessoa).replaceAll("-", "").replace(".", "");
    }
}
