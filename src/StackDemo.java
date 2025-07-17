import java.util.Stack;

//LIFO
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);  // Add
        stack.push(20);
//        push add last value in array
//        arr = [10,20,30,40]
//        arr = [10,20,30,40,10]
//        pop remove last value of array
//        System.out.println(stack.pop()); // Remove last => 20
//        peek() Return top item(No Remove)
//        empty() check if stack is empty
//        search() find the position of item
        System.out.println(stack);
    }
}
