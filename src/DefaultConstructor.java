public class DefaultConstructor {
    public static void main(String[] args) {
        class Bike {
            String brand;
            int price;

            // Default Constructor
            Bike() {
                brand = "Honda";
                price = 50000;
            }

            void display() {
                System.out.println("Brand: " + brand);
                System.out.println("Price: " + price);
            }
        }
        Bike b = new Bike(); // Default Constructor call
        b.display();
    }
}
