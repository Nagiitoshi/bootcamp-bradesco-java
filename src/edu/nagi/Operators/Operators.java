package edu.nagi.Operators;

public class Operators {
    public static void main(String[] args) {

        String concatenation = "?";

        concatenation = 10 + 20 + 10 + "30";
        System.out.println(concatenation);

        concatenation = 10 + "20" + 30 + 40;
        System.out.println(concatenation);
        concatenation = 10 + "20" + 30 + "40";
        System.out.println(concatenation);

        concatenation = "10" + 20 + 30 + 40;
        System.out.println(concatenation);

        concatenation = "10" + 20 + 30 + 40;
        System.out.println(concatenation);

        concatenation = "10" + (20 + 30 + 40);
        System.out.println(concatenation);

        concatenation = 10 + (20 + "30" + "40");
        System.out.println(concatenation);

        int number = 10;

        number = -number;// torna negativo
        System.out.println(number);

        number = number * -1; // torna positivo
        System.out.println(number);
    }

}
