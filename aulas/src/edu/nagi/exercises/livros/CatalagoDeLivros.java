package aulas.src.edu.nagi.exercises.livros;

import java.util.ArrayList;
import java.util.List;

public class CatalagoDeLivros {

    public List<Livro> catalagoLivros;

    public CatalagoDeLivros() {

        this.catalagoLivros = new ArrayList<>();
    }

    public void adicionarLivro(String nome, String autor, int anoPublicacao) {
        catalagoLivros.add(new Livro(nome, autor, anoPublicacao));
    }

    public void pesquisarPorAutor(String autor) {

        for (Livro livro : catalagoLivros) {
            if (livro.autor.equals(autor)) {
                System.out.println("Livro: " + livro.titulo + " Autor: " + livro.autor);
            }
        }
    }

    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        for (Livro livro : catalagoLivros) {
            if (livro.anoPublicacao >= anoInicial && livro.anoPublicacao <= anoFinal) {
                System.out.println("Livro: " + livro.titulo + " Autor: " + livro.autor);
            }
        }
    }

    public void pesquisarPorTitulo(String titulo) {
        for (Livro livro : catalagoLivros) {
            if (livro.autor.equals(titulo)) {
                System.out.println("Livro: " + livro.titulo + " Autor: " + livro.autor);
            }
        }
    }

    public static void main(String[] args) {
        CatalagoDeLivros catalagoDeLivros = new CatalagoDeLivros();

        catalagoDeLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalagoDeLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
        catalagoDeLivros.adicionarLivro("Livro 3", "Autor 3", 2022);

        System.out.println("====================================");
        catalagoDeLivros.pesquisarPorAutor("Autor 1");
        System.out.println("====================================");
        catalagoDeLivros.pesquisarPorIntervaloAnos(2020, 2022);
        System.out.println("====================================");
        catalagoDeLivros.pesquisarPorTitulo("Livro 1");
    }

}
