public class HierarchicalInheritance {
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

        class Cat extends Animal {
            void meow() {
                System.out.println("Cat is meowing");
            }
        }
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
