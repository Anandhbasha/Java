public class DeepCopyDemo {
    public static void main(String[] args) {
        class Person {
            String name;

            Person(String name) {
                this.name = name;
            }

            // Deep Copy Constructor
            Person(Person p) {
                this.name = new String(p.name); // New memory create panrom
            }
        }
        Person p1 = new Person("Anand");
        Person p2 = new Person(p1); // Deep copy — new object

        p2.name = "Kumar";

        System.out.println(p1.name);
        System.out.println(p2.name);
    }
}
