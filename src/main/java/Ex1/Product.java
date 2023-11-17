package Ex1;

public class Product {
    String name;

    public Product() {
    }

    public Product(Product product) {
        this.name = product.getName();
    }

    public Product (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
