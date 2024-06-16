package set.Ordenacao;

import java.util.Comparator;

public class Product implements Comparable<Product>{
    private String name;
    private long code;
    private double price;
    private int amount;

    public Product(String name, long code, double price, int amount) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (code ^ (code >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (code != other.code)
            return false;
        return true;
    }

    public String getNome() {
        return name;
    }

    public long getCodigo() {
        return code;
    }

    public double getPreco() {
        return price;
    }

    public int getQuantidade() {
        return amount;
    }

    @Override
    public String toString() {
        return "{" + name + "-" + code + "-" + price + "-" + amount + "}";
    }

    @Override
    public int compareTo(Product p) {
        return name.compareToIgnoreCase(p.getNome());
    }
    
}

class ComparatorPerPrice implements Comparator<Product> {
    
    @Override
    public int compare(Product p1, Product p2) {
      return Double.compare(p1.getPreco(), p2.getPreco());
    }
  }