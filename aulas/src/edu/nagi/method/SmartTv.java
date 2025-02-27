package edu.nagi.method;

import java.util.Scanner;

public class SmartTv {
    boolean linked;
    int channel = 1;
    int volume = 1;
    Scanner scanner = new Scanner(System.in);
    int option;
    public void menu() {

        do {
            System.out.println("============MENU============");
            System.out.println("1 - ligar");
            System.out.println("2 - desligar");
            System.out.println("3 - aumentar volume");
            System.out.println("4 - diminuir volume");
            System.out.println("5 - aumentar canal");
            System.out.println("6 - diminuir canal");
            System.out.println("7 - mudar canal");
            System.out.println("0 - sair");
            System.out.println("Digite uma opção:");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    tvOn();
                    break;
                case 2:
                    tvHangUp();
                    break;
                case 3:
                    volumeUp();
                    break;
                case 4:
                    volumeDown();
                    break;
                case 5:
                    channelUp();
                    break;
                case 6:
                    channelDown();
                    break;
                case 7:
                    changeChannel();
                    break;
                    case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida");
            }

        } while (option != 0);

    }

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.menu();

    }

    public void tvOn() {
        linked = true;
        System.out.println("TV ligada");
    }

    public void tvHangUp() {
        linked = false;
        System.out.println("TV desligada");
    }

    public void volumeUp() {
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("Volume: " + volume);
    }

    public void channelUp() {
        channel++;
        System.out.println("Canal: " + channel);
    }

    public void channelDown() {
        channel--;
        System.out.println("Canal: " + channel);
    }

    public void changeChannel() {
        System.out.println("Digite o canal desejado:");
        int channel = scanner.nextInt();
        this.channel = channel;
        System.out.println("Canal: " + channel);
    }

}
