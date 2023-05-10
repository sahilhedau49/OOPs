public class SavingAccount extends BankAccount implements Debitable{
    static int base = 11001;

    SavingAccount(int aadharNumber, String name, int amount){
        super(aadharNumber, name, amount);
        accountNumber = base++;
    }

    public int withdraw(int amount){
        balance -= amount;
        System.out.println("\nAccount Number: "+accountNumber);
        System.out.println("Name: "+name);
        System.out.println("Current Balance: "+balance);
        System.out.println("Rs. "+amount+" Withdrawed!");
        return amount;
    }
}
