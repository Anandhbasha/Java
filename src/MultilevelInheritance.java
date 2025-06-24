public class MultilevelInheritance {
    public static void main(String[] args) {
        class Animal {
            void eat() {
                System.out.println("Animal is eating");
            }
        }

        class Dog extends Animal {
            void bark() {
                System.out.println("Dog is barking");
            }
        }

        class Puppy extends Dog {
            void weep() {
                char g = 'f';
                System.out.println("Puppy is weeping");
            }
        }
        Puppy p = new Puppy();
        p.eat();   // Animal class method //grandparent
        p.bark();  // Dog class method //parent
        p.weep();  // Puppy class method //child
    }
}
