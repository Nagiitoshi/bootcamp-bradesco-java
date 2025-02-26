package aulas.src.edu.nagi;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();

        // TODO: Implemente a classificação do cliente com base no saldo:
        

        if (saldo > 0) {
            System.out.println("Cliente Poupança");
        } else if (saldo < 0) {
            System.out.println("Cliente devedor");
        } else {
            System.out.println("Cliente não possui saldo");
        }
        scanner.close();
    }
}
