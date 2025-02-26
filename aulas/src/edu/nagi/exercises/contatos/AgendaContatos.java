package aulas.src.edu.nagi.exercises.contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatosSet;

    public AgendaContatos() {

        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {

        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        if (!contatosSet.isEmpty()) {
            System.out.println(contatosSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void pesquisarPorNome(String nome) {

        for (Contato contato : contatosSet) {
            if (contato.getNome().startsWith(nome)) {
                System.out.println(contato);
            }
        }
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {

        for (Contato contato : contatosSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
            }
        }
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);

        agendaContatos.exibirContatos();

        System.out.println("===================================");
        agendaContatos.pesquisarPorNome("Camila");

        System.out.println("===================================");
        agendaContatos.atualizarNumeroContato("Camila Cavalcante", 654987);
        agendaContatos.exibirContatos();
    }

}
