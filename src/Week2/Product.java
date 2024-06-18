package Week2;

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }
    public void setStock() {
        this.stock = stock;
    }

    public double calculatePrice() {
        return price;
    }
}