package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
          for (Livro l : livroList) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
              livrosPorAutor.add(l);
            }
          }
          return livrosPorAutor;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
      }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
            return livrosPorIntervaloAnos;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                livroPorTitulo = l;
                break;
                }
            }
            return livroPorTitulo;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Java 8", "Desconhecido", 2000);
        catalogoLivros.adicionarLivro("Clean Code", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("História do PHP", "Richard B.", 2010);
        catalogoLivros.adicionarLivro("Mil e um ChatGPT", "Desconhecido", 2023);
        catalogoLivros.adicionarLivro("O caminho para o Japão", "Lucas Bonan", 2024);

        System.out.println(catalogoLivros.pesquisarPorAutor("Lucas Bonan"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000, 2010));
        
        System.out.println(catalogoLivros.pesquisarPorTitulo("Mil e um ChatGPT"));

    }

}
