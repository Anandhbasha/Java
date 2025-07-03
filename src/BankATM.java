class BankAccounts {
    int balance = 1000;

    synchronized void withdraw(String name, int amount) {
        if (balance >= amount) {
            System.out.println(name + " is trying to withdraw ₹" + amount);
            try { Thread.sleep(1000); } catch (Exception e) {}
            balance -= amount;
            System.out.println(name + " completed withdrawal. Remaining: ₹" + balance);
        } else {
            System.out.println(name + " tried to withdraw ₹" + amount + " - Insufficient Balance!");
        }
    }
}

class Customer implements Runnable {
    BankAccounts account;
    String name;

    Customer(BankAccounts acc, String custName) {
        this.account = acc;
        this.name = custName;
    }

    public void run() {
        account.withdraw(name, 700);
    }
}

public class BankATM {
    public static void main(String[] args) {
        BankAccounts acc = new BankAccounts();

        Customer c1 = new Customer(acc, "Ravi");
        Customer c2 = new Customer(acc, "Priya");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}