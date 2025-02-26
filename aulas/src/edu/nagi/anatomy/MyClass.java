package aulas.src.edu.nagi.anatomy;
public class MyClass {
    public static void main(String[] args) {

    String name = "Nagi";
    String lastName = "Itoshi";

    String nameFull= nameFull(name, lastName);
        System.out.println(nameFull);
    }
    public static String nameFull(String name, String lastName){
        return "Result method "+ name + " " + lastName;
    }
}