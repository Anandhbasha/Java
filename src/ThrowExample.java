public class ThrowExample {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age less than 18 – Not allowed");
        } else {
            System.out.println("You are allowed");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}