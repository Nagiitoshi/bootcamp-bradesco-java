package edu.nagi.variableTypes;

public class TypesVariable {
    public static void main(String[] args) {
        double salary = 2000;
        short shortNumber = 2;
        int normalNumber1 = shortNumber;
        short shortNumber2 = (short) normalNumber1;
        int number = 10;
        number = 100;

        System.out.println(shortNumber2);
        final double VALOR_DE_PI = 3.14;
    }
}
