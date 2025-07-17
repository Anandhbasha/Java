import java.util.*;
//HashMap – Key-value pair
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "John");
        map.put(102, "Alice");
        System.out.println(map.get(101)); // John
    }
}
