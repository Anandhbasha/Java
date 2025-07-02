package packageJava;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(0, 5, "Hi");

        System.out.println(sb); // Hi Java World
        System.out.println(sb.reverse());
    }
}
