public class BoxingDemo {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = a;      // Boxing
        int b = obj;          // Unboxing
        System.out.println(b);
    }
}
