package set.Pesquisa;

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
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        if (!contatosSet.isEmpty()) {
            for (Contato c : contatosSet) {
                if (c.getNome().startsWith(nome)) {
                    contatosPorNome.add(c);
                }
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        if (!contatosSet.isEmpty()) {
            for (Contato c : contatosSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Jose Costa", 246845845);
        agendaContatos.adicionarContato("Silva", 246845845);
        agendaContatos.adicionarContato("Silva", 246875885);
        agendaContatos.adicionarContato("Juliana Ribeiro", 246845845);
        agendaContatos.adicionarContato("Juliana Guedes", 246845845);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Juliana"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Jose Costa", 258712085));

        agendaContatos.exibirContatos();

    }
}
