package edu.nagi.exercises.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    
    public List<String> tarefas;

    public ListaTarefas(List<String> tarefas) {
        this.tarefas = tarefas;
    }

    public void adicionarTarefa(Tarefa descricao) {
        tarefas.add(descricao.getDescricao());
        System.out.println("Tarefa " + tarefas + " adicionada com sucesso!");

    }

    public void removerTarefa(String descricao) {
        tarefas.remove(descricao);
        System.out.println("Tarefa [" + descricao + "] removida com sucesso!");
    }

    public void obterNumeroTotalTarefas() {
        System.out.println("Total de tarefas: " + tarefas.size());
    }

    public void obterDescricoesTarefas() {
        System.out.println("Descrição das tarefas: " + tarefas);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas(new ArrayList<>());
        listaTarefas.adicionarTarefa(new Tarefa("Tarefa 1"));
        listaTarefas.adicionarTarefa(new Tarefa("Tarefa 2"));
        listaTarefas.adicionarTarefa(new Tarefa("Tarefa 3"));
        listaTarefas.obterNumeroTotalTarefas();
        listaTarefas.removerTarefa("Tarefa 1");
        listaTarefas.obterNumeroTotalTarefas();
        listaTarefas.obterDescricoesTarefas();

    }

}
