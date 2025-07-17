import java.util.*;
//TreeSet – Sorted, No duplicates
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(30);
        ts.add(10);
        ts.add(20);
        System.out.println(ts); // Sorted
    }
}
