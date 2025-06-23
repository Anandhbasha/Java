public class PrivateConstructor {
    public static void main(String[] args) {
        class Singleton {
            private static Singleton obj = new Singleton(); // static object

            private Singleton() { // Private Constructor
                System.out.println("Private Constructor");
            }

            public static Singleton getInstance() {
                return obj;
            }
        }
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
    }
}