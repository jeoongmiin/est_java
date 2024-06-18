package Week2;

public class Food extends Product {
    private int expirationDate;

    public Food(String name, int price, int stock, int expirationDate) {
        super(name, price, stock);
        this.expirationDate = expirationDate;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate() {
        this.expirationDate = expirationDate;
    }

    @Override
    public double calculatePrice() {
        return (expirationDate <= 7) ? getPrice() * 0.8 : getPrice();
    }
}