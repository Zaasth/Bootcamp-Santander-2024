package List.Exercicios.Primeiro;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    public static void main(String[] args) {
        //List<Tarefa> listaTarefas = new ArrayList<>();
        Tarefa tarefa = new Tarefa();

        /*
        listaTarefas.add(tarefa.adicionarTarefa("Texto do teste"));
        listaTarefas.add(tarefa.adicionarTarefa("Texto do teste 2"));
        listaTarefas.add(tarefa.adicionarTarefa("Texto do teste 3"));
        */

        tarefa.adicionarTarefa("Cleitin do congo");
        tarefa.adicionarTarefa("Robert do congo");

        tarefa.removerTarefa("Robert do congo");
        tarefa.obterDescricaoTarefas();
        tarefa.adicionarTarefa("Lohan do Rj");
        tarefa.adicionarTarefa("Felipe de SP");

        System.out.println("===================");
        tarefa.obterDescricaoTarefas();
        System.out.println(tarefa.numeroTotalTarefas());
    }
}
