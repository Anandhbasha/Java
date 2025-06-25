public class MethodOverloading {
    public static void main(String[] args) {
        Calculator C = new Calculator();
        System.out.println(C.add(10,20));
        System.out.println(C.add(55.2,88.5));
        System.out.println(C.add("xyz","abc"));
    }
}
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}
