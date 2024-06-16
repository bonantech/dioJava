package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RegisterProducts {
    private Set<Product> productSet;

    public RegisterProducts() {
        this.productSet = new HashSet<>();
    }

    public void addProduct(long code, String name, double price, int amount) {
        productSet.add(new Product(name, code, price, amount));
    }

    public Set<Product> showProductsPerName() {
        Set<Product> productsPerName = new TreeSet<>(productSet);
        return productsPerName;
    }

    public Set<Product> showProductsPerPrice() {
        Set<Product> produtosPorPreco = new TreeSet<>(new ComparatorPerPrice());
        if (!productSet.isEmpty()) {
            produtosPorPreco.addAll(productSet);
        }
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        RegisterProducts registerProducts = new RegisterProducts();

        registerProducts.addProduct(1L, "Smartphone", 1000d, 10);
        registerProducts.addProduct(2L, "Notebook", 1500d, 5);
        registerProducts.addProduct(1L, "Mouse", 30d, 20);
        registerProducts.addProduct(4L, "Teclado", 50d, 15);

        System.out.println(registerProducts.productSet);
        System.out.println(registerProducts.showProductsPerName());
        System.out.println(registerProducts.showProductsPerPrice());
    }

}
