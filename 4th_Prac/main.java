public class main{
    public static void main(String[] args) {
        
        // Saving Account 1
        SavingAccount s1 = new SavingAccount(123456, "Sahil", 500);
        s1.withdraw(100);
        s1.deposit(2000);
        s1.updateInterest();
        s1.withdraw(500);
        s1.closeAccount();

        // Fixed Deposite
        FixedDepositeAccount f1 = new FixedDepositeAccount(987654, "Samrat", 5, 100000);
        f1.updateInterest();
        f1.closeAccount(3);

        // Saving Account 2
        SavingAccount s2 = new SavingAccount(123456, "Sahil", 5000);
        s2.withdraw(500);
        s2.closeAccount();
    }
}