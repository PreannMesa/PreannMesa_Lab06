package Ex2;

public class Product {
    int id;
    String name;
    int quantity;

    public Product() {
    }

    public Product(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.quantity = product.getQuantity();
    }

    public Product(int id,String name, int quantity) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
