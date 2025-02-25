package edu.nagi.Exercises.Tarefas;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int options;
        ListaTarefas listaTarefas = new ListaTarefas();

        do {
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Obter número total de tarefas");
            System.out.println("4 - Obter descrições das tarefas");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção:");
            options = scanner.nextInt();
            switch (options) {
                case 1:

                    System.out.println("Digite a descrição da tarefa:");
                    listaTarefas.adicionarTarefa(scanner.next());
                    break;
                case 2:

                    System.out.println("Digite a descrição da tarefa:");
                    listaTarefas.removerTarefa(scanner.next());
                    break;
                case 3:

                    listaTarefas.obterNumeroTotalTarefas();
                    break;
                case 4:

                    listaTarefas.obterDescricoesTarefas();
                    break;
                case 0:

                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                System.out.println("Opção inválida");
                    break;
            }
        } while (options != 0);
    }

}
