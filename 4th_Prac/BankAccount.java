public class BankAccount {
    int accountNumber;
    int aadharNumber;
    String name;
    double roi = 0;
    double balance;

    BankAccount(int aadharNumber, String name, double amount) {
        openAccount(aadharNumber, name, amount);
        accountNumber = 99999;
    }

    private void openAccount(int aadharNumber, String name, double amount) {
        this.aadharNumber = aadharNumber;
        this.name = name;
        this.balance = amount;
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("\n" + amount + "Rs. Deposited!\n");
    }

    void updateInterest() {
        double interest = 0.04 * balance;
        balance += interest;
    }

    void closeAccount() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Aadhar Number: " + aadharNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Account is Closed!");
    }
}
