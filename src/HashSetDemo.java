import java.util.*;
//HashSet – No duplicates, no order
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A"); // Duplicate ignored
        System.out.println(set);
    }
}
