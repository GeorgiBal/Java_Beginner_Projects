import java.util.*;

public class Queue_Methods {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println("The Queue contents: " + queue);

        System.out.println("The first element is (peek): " + queue.peek());

        System.out.println("The first element is (element): " + queue.element());

        System.out.println("The first element is removed (remove): " + queue.remove());
        System.out.println("The new Queue contents: " + queue);

        System.out.println("The first element is removed (poll): " + queue.poll());
        System.out.println("The new Queue contents: " + queue);

        queue.offer(6);
        queue.offer(7);
        System.out.println("The new Queue contents: " + queue);

        System.out.println("Is the queue empty: " + queue.isEmpty());

        System.out.println("The size of the queue: " + queue.size());
    }
}
