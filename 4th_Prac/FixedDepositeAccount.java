public class FixedDepositeAccount extends BankAccount{
    double lockInPeriod;
    static int base = 55001;

    FixedDepositeAccount(int aadharNumber, String name, int lockInPeriod, int amount){
        super(aadharNumber, name, amount);
        this.lockInPeriod = lockInPeriod;
        accountNumber = base++;
        if(lockInPeriod >=1 && lockInPeriod <= 2)
            roi = 6;
        else if (lockInPeriod >=2 && lockInPeriod <= 5)
            roi = 6.5;
        else 
            roi = 7;
    }

    void updateInterest(){
        double interest = roi*balance/100;
        balance += interest;
    }

    void closeAccount(double endTime){
        double charge = 0;
        if(endTime<lockInPeriod){
            charge = 0.05*balance;
        }
        balance -= charge;
        System.out.println("\nAccount Number: "+accountNumber);
        System.out.println("Aadhar Number: "+aadharNumber);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
        System.out.println("Account is Closed! With "+ charge +" Charges.");
    }
}
