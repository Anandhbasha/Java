public class MultipleInheritance {
    public static void main(String[] args) {
        interface Printable {
            void print();
        }

        interface Showable {
            void show();
        }

        class A implements Printable, Showable {
            public void print() {
                System.out.println("Print method");
            }
            public void show() {
                System.out.println("Show method");
            }
        }
        A obj = new A();
        obj.print();
        obj.show();
    }
}
