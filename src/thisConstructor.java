public class thisConstructor {
    public static void main(String[] args) {
        class Employee {
            String name;
            int age;

            // Default Constructor
            Employee() {
                this("Unknown", 0); // calling parameterized constructor
            }

            // Parameterized Constructor
            Employee(String n, int a) {
                name = n;
                age = a;
            }

            void display() {
                System.out.println("Name: " + name + ", Age: " + age);
            }
        }
        Employee e = new Employee(); // default constructor call pannom
        e.display();
    }
}
