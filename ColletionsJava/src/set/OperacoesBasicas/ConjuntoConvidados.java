package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
    this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidadoSet(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadosSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidadoSet("Alexandre", 0);
        conjuntoConvidados.adicionarConvidadoSet("Maria", 1);
        conjuntoConvidados.adicionarConvidadoSet("Elizabeth", 2);
        conjuntoConvidados.adicionarConvidadoSet("Edna", 3);
        conjuntoConvidados.adicionarConvidadoSet("Carlos", 3);
        conjuntoConvidados.adicionarConvidadoSet("Ricardo", 4);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
        
        conjuntoConvidados.removerConvidadoPorCodigo(2);
        
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
