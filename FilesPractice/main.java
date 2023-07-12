// package FilesPractice;

public class main {
    public static void main(String[] args) {
        Product product = new Product("P001", "Example Product", 10, 9.99);
        Customer customer = new Customer("John Doe", product);

        product.writeProductToFile(product);
        customer.writeCustomerToFile(customer);

        // Simulating a purchase by updating the product quantity
        int purchasedQuantity = 3;
        product.updateProductQuantity(product, purchasedQuantity);
        product.writeProductToFile(product);
    }

}
