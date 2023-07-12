// package FilesPractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Product {
    String productId;
    String name;
    int quantity;
    double price;

    public Product(String productId, String name, int quantity, double price) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void updateProductQuantity(Product product, int purchasedQuantity) {
        product.quantity -= purchasedQuantity;
    }

    public void writeProductToFile(Product product) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("product.txt", true))) {
            writer.write("Product ID: " + product.getProductId());
            writer.newLine();
            writer.write("Name: " + product.getName());
            writer.newLine();
            writer.write("Quantity: " + product.getQuantity());
            writer.newLine();
            writer.write("Price: " + product.getPrice());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}