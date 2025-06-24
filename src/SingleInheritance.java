public class SingleInheritance {
    public static void main(String[] args) {
        class Dad {
            String Gender = "Male";

        }

        class Son extends Dad {
//            void bark() {
//                System.out.println("Dog is barking");
//            }
            void eat() {
                System.out.println("He is Son");
            }
        }
        Son d = new Son();
        System.out.println(d.Gender);
        d.eat();  // Super class method
//        d.bark(); // Sub class method
    }
}
