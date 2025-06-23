public class ShallowCopyDemo {
    public static void main(String[] args) {
        class Person {
            String name;

            Person(String name) {
                this.name = name;
            }
        }
        Person p1 = new Person("Anand");
        Person p2 = p1; // Shallow copy — same reference

        p2.name = "Kumar";

        System.out.println(p1.name);
        System.out.println(p2.name);
    }
}
