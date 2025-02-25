package edu.nagi.Exercises.Tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    public List<String> tarefas;

    public ListaTarefas(List<String> tarefas) {
        this.tarefas = tarefas;
    }

    public void adicionarTarefa(Tarefa descricao) {
        tarefas.add(descricao.getDescricao());
        System.out.println("Tarefa adicionada com sucesso!");

    }

    public void removerTarefa(String descricao) {
        tarefas.remove(descricao);
    }

    public void obterNumeroTotalTarefas() {
        System.out.println(tarefas.size());
    }

    public void obterDescricoesTarefas() {
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas(new ArrayList<>());
        listaTarefas.adicionarTarefa(new Tarefa("Tarefa 1"));
        System.out.println(listaTarefas);
    }

}
