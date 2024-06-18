package Week2;

public class PremiumShoppingMall extends ShoppingMall {
    public PremiumShoppingMall(int arraySize) {
        super(arraySize);
    }

    @Override
    public boolean chechOrderAvailability() {
        for (int i = 0; i < getArrayCount(); i++) {
            if (getProducts()[i].getStock() < 10) return false;
        }
        return true;
    }
}