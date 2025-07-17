import java.util.*;
import java.util.stream.*;


//lambda
// Normal method
// int square(int x) {
//    return x * x;
//}
//square(10)
//

//Lambda version

//Function<Integer, Integer> square = (x) -> x * x;
//System.out.println(square.apply(5)); // 25


//without stream
//List<String> names = Arrays.asList("kumar", "arun", "abi");
//
//for (String name : names) {
//    if (name.startsWith("a")) {
//        System.out.println(name.toUpperCase());
//    }
//}

//stream
//List<String> names = Arrays.asList("kumar", "arun", "abi");
//
//names.stream()
//     .filter(name -> name.startsWith("a"))
//     .map(name -> name.toUpperCase())
//     .forEach(System.out::println);
public class MRF {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Map: Square each number
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        // Filter: Keep even numbers
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Evens: " + evens);

        // Reduce: Sum all numbers
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);
    }
}
