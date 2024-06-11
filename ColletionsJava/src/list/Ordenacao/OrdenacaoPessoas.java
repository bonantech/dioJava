package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Bruno", 22, 1.76);
        ordenacaoPessoas.adicionarPessoa("Marlon", 25, 1.82);
        ordenacaoPessoas.adicionarPessoa("Ana", 18, 1.55);
        ordenacaoPessoas.adicionarPessoa("Roberto", 30, 1.68);

        System.out.println(ordenacaoPessoas.pessoaList);
        System.out.println("Por ordem de idade: " + ordenacaoPessoas.ordenarPorIdade());
        System.out.println("Por ordem de altura: " + ordenacaoPessoas.ordenarPorAltura());
    }

}
