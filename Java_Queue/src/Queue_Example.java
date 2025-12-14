import java.util.*;

public class Queue_Example {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        queue.add("five");
        System.out.println("The Queue contents:" + queue);
    }
}
