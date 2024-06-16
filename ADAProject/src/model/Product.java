package model;

public interface Product {
    // Defininfo regras de contrato da interface

    /**
     * Adiciona novo produto ao estoque.
     */
    void add(final String product);

    /**
     * Lista os produtos no estoque.
     */
    void print();

    /**
     * Remove o produto do estoque.
     */
    void delete(final int index);
    
}
