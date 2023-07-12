// package FilesPractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Customer {
    String customerId;
    String name;
    Product productDetails;

    public Customer(String name, Product productDetails) {
        this.customerId = generateCustomerId();
        this.name = name;
        this.productDetails = productDetails;
    }

    String generateCustomerId() {
        // Code to generate customer ID automatically (e.g., C001)
        // You can modify this code to generate IDs as per your requirement
        // For simplicity, I'm using a constant value here
        return "C001";
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public Product getProductDetails() {
        return productDetails;
    }

    public void writeCustomerToFile(Customer customer) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sales.txt"))) {
            writer.write("Customer ID: " + customer.getCustomerId());
            writer.newLine();
            writer.write("Name: " + customer.getName());
            writer.newLine();
            writer.write("Product Details:");
            writer.newLine();
            writer.write("  Product ID: " + customer.getProductDetails().getProductId());
            writer.newLine();
            writer.write("  Name: " + customer.getProductDetails().getName());
            writer.newLine();
            writer.write("  Quantity: " + customer.getProductDetails().getQuantity());
            writer.newLine();
            writer.write("  Price: " + customer.getProductDetails().getPrice());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
