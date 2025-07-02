package packageJava;
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1};
        Arrays.sort(arr); // sort ascending

        System.out.println(Arrays.toString(arr)); // [1, 3, 5, 9]

        int index = Arrays.binarySearch(arr, 5); // search
        System.out.println("Index of 5: " + index);
    }
}
