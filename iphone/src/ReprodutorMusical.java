public class ReprodutorMusical implements Iphone {

    public void tocar() {

        System.out.println("Tocando música");
    }

    public void pausar() {

        System.out.println("Pausando música");
    }

    public void selecionarMusica(String musica) {
        
        musica = "Dream";
        System.out.println("Selecionando música" + musica);
    }
}
