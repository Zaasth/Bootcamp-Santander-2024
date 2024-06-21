package List.Exercicios.Primeiro;

import java.util.ArrayList;
import java.util.List;

public class Tarefa {
    private String descricao;
    List<Tarefa> listaTarefas = new ArrayList<>();

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public Tarefa(){}

    List<Tarefa> adicionarTarefa(String descricao){

        listaTarefas.add(new Tarefa(descricao));
        return listaTarefas;
    }

    void obterDescricaoTarefas(){
        for (Tarefa lista : listaTarefas){
            String descricao = lista.getDescricao();
            System.out.println(descricao);
        }
    }

    List<Tarefa> removerTarefa(String descricao) {
        int i = 0;
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                listaTarefas.remove(i);
                break; // Remove apenas a primeira ocorrência encontrada
            } else {
                i++;
            }
        }
        return listaTarefas;
    }

    Integer numeroTotalTarefas(){
        return listaTarefas.size();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
