import java.util.*;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("One");
        v.add("Two");

        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}