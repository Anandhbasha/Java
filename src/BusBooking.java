// Runnable for SETC Booking
class SetcCounter implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("🔵 SETC Ticket Booking No: " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }
}

// Runnable for Private Bus Booking
class PrivateCounter implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("🔴 Private Bus Ticket Booking No: " + i);
            try { Thread.sleep(1200); } catch (InterruptedException e) {}
        }
    }
}

public class BusBooking {
    public static void main(String[] args) {
        // Create object
        SetcCounter setc = new SetcCounter();
        PrivateCounter pvt = new PrivateCounter();

        // Create thread
        Thread t1 = new Thread(setc);
        Thread t2 = new Thread(pvt);

        // Start thread
        t1.start();
        t2.start();
    }
}