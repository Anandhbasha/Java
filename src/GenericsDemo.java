//Generics use panna type safety varum.
import java.util.*;

public class GenericsDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Raj");
        // names.add(123); // Error
        System.out.println(names.get(0));
    }
}

