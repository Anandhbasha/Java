public class MethodOverriding {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCard();
        p.makePayment(); // Output: Paid using Credit Card

        p = new UPI();
        p.makePayment(); // Output: Paid using UPI

        p = new CashOnDelivery();
        p.makePayment(); // Output: Will pay during delivery
    }
}
abstract class Payment {
    abstract void makePayment();
}
class CreditCard extends Payment {
    void makePayment() {
        System.out.println("Paid using Credit Card ");
    }
}

class UPI extends Payment {
    void makePayment() {
        System.out.println("Paid using UPI (GPay, PhonePe) ");
    }
}

class CashOnDelivery extends Payment {
    void makePayment() {
        System.out.println("Will pay during delivery ");
    }
}
