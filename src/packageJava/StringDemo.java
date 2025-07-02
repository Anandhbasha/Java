package packageJava;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2;

        System.out.println(s3); // Hello World
        String name = "anandha";
        System.out.println(name.toUpperCase()); // ANANDHA
        System.out.println(name.length());      // 7
        System.out.println(name.charAt(2));
    }
}
