package aulas.src.edu.nagi.exercises.pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoasList;

    public OrdenacaoPessoas() {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {

        pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
        if (!pessoasList.isEmpty()) {
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
        if (!pessoasList.isEmpty()) {
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("João", 25, 1.75);
        ordenacaoPessoas.adicionarPessoa("Maria", 30, 1.60);
        ordenacaoPessoas.adicionarPessoa("Pedro", 20, 1.80);

        System.out.println("==============================");
        System.out.println("Ordenação por idade:");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println("==============================");
        System.out.println("Ordenação por altura:");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }

}
