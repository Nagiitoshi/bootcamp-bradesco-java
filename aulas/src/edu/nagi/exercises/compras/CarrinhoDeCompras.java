package edu.nagi.exercises.compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    public List<Item> carrinhoList;

    public CarrinhoDeCompras() {

        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {

        Item item = new Item(nome, preco, quantidade);
        carrinhoList.add(item);
    }

    public void removerItem(String nome) {

        for (Item item : carrinhoList) {
            if (item.nome.equals(nome)) {
                carrinhoList.remove(item);
                break;
            }
        }
    }

    public void calcularValorTotal() {

        double valorTotal = 0;
        for (Item item : carrinhoList) {
            valorTotal += item.preco * item.quantidade;
        }
        System.out.println("Valor total: " + valorTotal);
    }

    public void exibirItens() {

        carrinhoList.forEach(item -> {
            System.out.println("Nome: " + item.nome + " R$" + item.preco + " Quantidade: " + item.quantidade);
        });
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Carro", 1715, 1);
        carrinhoDeCompras.adicionarItem("Moto", 1200, 1);
        carrinhoDeCompras.adicionarItem("Bicicleta", 150, 1);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
        carrinhoDeCompras.removerItem("Moto");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
    }
}
