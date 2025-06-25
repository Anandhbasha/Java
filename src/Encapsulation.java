public class Encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(5000);  //  Correct way to update
        System.out.println("Balance: " + acc.getBalance());
        // acc.balance = 10000;  Error - cannot access private
    }
}
class BankAccount {
    private double balance = 0; //  data is hidden

    // Public method to access balance
    public double getBalance() {
        return balance;
    }

    // Public method to update balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

