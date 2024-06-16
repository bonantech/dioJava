package view;

import java.util.Scanner;

import controller.DaoProduct;
import model.Product;

public class Stock {

    // Constante que define o tamanho do array
    private final static int SIZE = 8;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciando novo array de produtos
        Product product = new DaoProduct(SIZE);
        
        int option;

        // Repete o menu de opções até que seja selecionada opção sair
        do {
            System.out.println("\nControle de Estoque");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Digite o produto a ser estocado: ");
                    String newProduct = scanner.next();
                    product.add(newProduct);
                    break;
                case 2:
                    product.print();
                    break;
                case 3:
                    System.out.println("Digite a posição do produto a ser retirado: ");
                    int index = scanner.nextInt();
                    product.delete(index);
                    break;
                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválido! Por favor, escolha novamente.");
                    break;
            }
        } while (option != 4);

        scanner.close();
    } 
}
