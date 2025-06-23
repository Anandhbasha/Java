public class ConstructorOverloading {
    public static void main(String[] args) {
        class Student {
            String name;
            int age;

            // Constructor 1
            Student() {
                name = "Unknown";
                age = 0;
            }

            // Constructor 2
            Student(String n) {
                name = n;
                age = 0;
            }

            // Constructor 3
            Student(String n, int a) {
                name = n;
                age = a;
            }

            void display() {
                System.out.println("Name: " + name + ", Age: " + age);
            }
        }
        Student s1 = new Student();              // Default
        Student s2 = new Student("Arun");        // 1 Parameter
        Student s3 = new Student("Kumar", 21);   // 2 Parameters

        s1.display();
        s2.display();
        s3.display();

    }
}
