package Week2;

public abstract class ShoppingMall {
    private Product[] products;
    private int arrayCount;

    public int getArrayCount() {
        return arrayCount;
    }

    public Product[] getProducts() {
        return products;
    }

    public ShoppingMall(int arraySize) {
        products = new Product[arraySize];
        arrayCount = 0;
    }

    public void addProduct(Product product) {
        if (arrayCount == products.length) {
            Product[] newProducts = new Product[products.length * 2];
            System.arraycopy(products, 0, newProducts, 0, products.length);
            products = newProducts;
        }
        products[arrayCount++] = product;
    }

    public void removeProduct(Product product) {
        for (int i = 0; i < arrayCount; i++) {
            if (products[i].equals(product)) {
                System.arraycopy(products, i + 1, products, i, arrayCount - i - 1);
                products[--arrayCount] = null;
                return;
            }
        }
    }

    public void displayProducts() {
        for (int i = 0; i < arrayCount; i++) {
            System.out.println(products[i].getName() + " " + products[i].calculatePrice() + " " + products[i].getStock());
        }
    }

    public abstract boolean chechOrderAvailability();
}