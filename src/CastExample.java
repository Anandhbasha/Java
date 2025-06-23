public class CastExample {
    public static void main(String[] args) {
        class Animal {
            void sound() {
                System.out.println("Animal makes sound");
            }
        }

        class Dog extends Animal {
            void sound() {
                System.out.println("Dog barks");
            }
            void onlyDog() {
                System.out.println("Only Dog Method");
            }
        }
        Animal a = new Dog(); // Upcasting
        a.sound(); // Dog barks

        Dog d = (Dog) a; // Downcasting
        d.onlyDog();
    }
}
