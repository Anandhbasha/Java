//Sorted by keys
import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(2, "Banana");
        tm.put(1, "Apple");
        System.out.println(tm); // Sorted by key
    }
}
