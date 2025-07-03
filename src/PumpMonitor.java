class PressureSensor extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("🔵 Pressure Sensor Reading: " + (100 + i) + " PSI");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }
}

class TemperatureSensor extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("🔴 Temperature Sensor Reading: " + (30 + i) + " °C");
            try { Thread.sleep(1200); } catch (InterruptedException e) {}
        }
    }
}

public class PumpMonitor {
    public static void main(String[] args) {
        PressureSensor pressure = new PressureSensor();
        TemperatureSensor temp = new TemperatureSensor();

        pressure.start();  // Start pressure thread
        temp.start();      // Start temperature thread
    }
}