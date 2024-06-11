package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if (!tarefaList.isEmpty()) {
          for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
              tarefasParaRemover.add(t);
            }
          }
          tarefaList.removeAll(tarefasParaRemover);
        } else {
          System.out.println("A lista está vazia!");
        }
      }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Total de " + listaTarefa.obterNumeroTotalTarefas() + " tarefas cadastradas.");
        
        listaTarefa.adicionarTarefa("Trocar pneu traseiro");
        listaTarefa.adicionarTarefa("Trocar filtro de óleo");
        listaTarefa.adicionarTarefa("Trocar novos itens");
        listaTarefa.adicionarTarefa("Trocar novos itens");
        
        System.out.println("Total de " + listaTarefa.obterNumeroTotalTarefas() + " tarefas cadastradas.");
        
        listaTarefa.removerTarefa("Trocar novos itens");
        
        System.out.println("Total de " + listaTarefa.obterNumeroTotalTarefas() + " tarefas cadastradas.");

        listaTarefa.obterDescricaoTarefas();
    }
}