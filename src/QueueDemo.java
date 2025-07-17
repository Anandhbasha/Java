import java.util.*;
//FIFO
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("A");
        q.add("B");
        System.out.println(q.poll()); // First in => "A"
    }
}
//| Method      | Purpose                                      |
//| ----------- | -------------------------------------------- |
//| add()     | Add element (throws exception if full)       |
//| offer()   | Add element (returns false if full)          |
//| poll()    | Remove and return front element              |
//| remove()  | Same as poll() but throws exception if empty |
//| peek()    | Just view the front element                  |
//| element() | Like peek(), but throws exception if empty   |
//| isEmpty() | Check if queue is empty                      |