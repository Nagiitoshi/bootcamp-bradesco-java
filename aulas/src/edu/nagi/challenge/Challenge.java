package edu.nagi.challenge;

import java.util.Scanner;

public class Challenge {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double valorTotal = scanner.nextDouble();
    int numeroParcelas = scanner.nextInt();

    if (numeroParcelas > valorTotal) {
      System.out.println("Parcelamento nao e possivel");
    } else {
      double valorParcela = valorTotal / numeroParcelas;
      System.out.println("Parcela: " + valorParcela);

    }

    scanner.close();
  }

}