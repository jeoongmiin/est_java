package Week2;

public class Clothing extends Product {
    private String size;
    public Clothing(String name, int price, int stock, String size) {
        super(name, price, stock);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize() {
        this.size = size;
    }

    @Override
    public double calculatePrice() {
        return (size.equals("L") || size.equals("XL")) ? getPrice() * 1.1 : getPrice();
    }
}