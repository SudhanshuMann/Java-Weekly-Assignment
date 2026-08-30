public class ProductInventory {
    String productName;
    int quantity;
    double price;

    void addStock(int amount) {
        quantity += amount;
    }

    void sellProduct(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
        } else {
            System.out.println("Not enough stock.");
        }
    }

    void display() {
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        ProductInventory product = new ProductInventory();

        product.productName = "Laptop";
        product.quantity = 10;
        product.price = 75000;

        product.addStock(5);
        product.sellProduct(3);

        product.display();
    }
}
