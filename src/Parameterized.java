public class Parameterized {
    public static void main(String[] args) {
        class Car {
            String model;
            int price;

            // Parameterized Constructor
            Car(String m, int p) {
                model = m;
                price = p;
            }

            void display() {
                System.out.println("Model: " + model);
                System.out.println("Price: " + price);
            }
        }
        Car c = new Car("BMW", 800000);
        c.display();
    }
}
