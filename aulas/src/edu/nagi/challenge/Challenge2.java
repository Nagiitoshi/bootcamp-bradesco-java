package edu.nagi.challenge;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            double transacoes[] = new double[3];

            for (int i = 0; i < transacoes.length; i++) {
                transacoes[i] = scanner.nextDouble();
            }
            
            double minimumValue = scanner.nextDouble();

            int contador = 0;

            for (int i = 0; i < transacoes.length; i++) {
                if (transacoes[i] > minimumValue) {
                    contador++;
                }
            }

            System.out.println(contador);
        }
    }

}
