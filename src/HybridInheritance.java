//public class HybridInheritance {
//    public static void main(String[] args) {
//        interface A {
//            void methodA();
//        }
//
//        interface B extends A {
//            void methodB();
//        }
//
//        class C implements B {
//            public void methodA() {
//                System.out.println("Method A");
//            }
//            public void methodB() {
//                System.out.println("Method B");
//            }
////        }
//        C obj = new C();
//        obj.methodA();
//        obj.methodB();
//    }
//}

public class HybridInheritance {
    public static void main(String[] args) {
        class GrandParent{
            char gender = 'm';
        }
        class Parent extends GrandParent{
            void genderPrint(){
                System.out.println("He is my Father");
            }
        }
        class grandMother{
            char gender = 'f';
        }
        class uncle extends grandMother{

        }
        class mom extends grandMother {
        }
        }
    }
