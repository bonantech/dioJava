package controller;

import model.Product;

public class DaoProduct implements Product{

    private final String [] products;

    private int lastIndex;

    public DaoProduct(final int size) {
        products = new String[size];
        lastIndex = -1;
    }

    @Override
    public void add(final String product) {
        if (lastIndex == products.length-1) {
            System.out.println("Estoque cheio!");
        } else {
            lastIndex++;
            products[lastIndex] = product;
        }
    }

    @Override
    public void delete(final int index) {
        if (index >= 0 && index <= lastIndex) {
            shift(index);
            lastIndex--;
        } else {
            System.out.println("Índice inválido: " + index);
        }
    }

    private void shift(final int index) {
        for (int i = index; i < lastIndex; i++) {
            products[i] = products[i+1];
        }
    }

    @Override
    public void print() {
        System.out.println("#########################################");

        if(lastIndex <0){
            System.out.println("Estoque vazio!");
        }

        for(int i = 0; i <= lastIndex; i++){
            System.out.println(i + " - " + products[i]);
        }

        System.out.println("#########################################");
    }
    
}
