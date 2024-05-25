package edu.wellinton.testes.POO.Produto;

import edu.wellinton.testes.Enums.Desconto;
import edu.wellinton.testes.Enums.Tipo;

import java.util.Locale;

public class ProdutoModel {
   String nome;
   Tipo tipo;
   String descricao;
   int id;
   double preco;
   Desconto desconto;

   // Construtor
   public ProdutoModel(String nome, Tipo tipo, String descricao, int id, double preco, Desconto desconto) {
      this.nome = nome;
      this.tipo = tipo;
      this.descricao = descricao;
      this.id = id;
      this.preco = preco;
      this.desconto = desconto;

      if (id < 0){
         this.id = Math.abs(id);
      }
      if(descricao.length() > 60){
         this.descricao = "A descrição precisa ter menos de 60 caracteres";
      }
   }

   // Getters e Setters
   public String getId() {
      return String.valueOf(id);
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }


}
