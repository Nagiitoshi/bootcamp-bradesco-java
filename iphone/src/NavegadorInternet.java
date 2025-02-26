public class NavegadorInternet implements Iphone {

    public void exibirPagina(String url) {

        url = "https://www.google.com";
        System.out.println("Exibindo página" + url);
    }

    public void adicionarNovaAba() {
        
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {

        System.out.println("Atualizando página");
    }
}
