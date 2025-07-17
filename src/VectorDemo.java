import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Apple");
//        v.add(v.balance)
        v.add("Mango");
        System.out.println(v);
        v.get(0);       // get element at index
        v.size();       // number of elements
        v.remove(1);    // remove at index
        v.clear();      // clear all elements
    }
}

//Dynamic array can grow or shrink
//Sync - Safe for Multithreading