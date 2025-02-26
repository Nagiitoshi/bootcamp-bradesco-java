package iphone.src;

public class AparelhoTelefonico implements Iphone {

    public void ligar(String numero) {

        numero = "999999999";
        System.out.println("Ligando..." + numero);
    }

    public void atender() {
        
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioVoz() {

        System.out.println("Iniciando correio de voz...");
    }
}
