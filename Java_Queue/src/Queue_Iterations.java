import java.util.*;

public class Queue_Iterations {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println("The Queue contents: " + queue);

        Iterator<Integer> iterator = queue.iterator();

        System.out.print("Iteration with Iterator: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();
        System.out.print("Iteration with For: ");
        for (int element : queue) {
            System.out.print(element + ", ");
        }
        System.out.println();
        System.out.print("Iteration with Stream: ");
        queue.stream().forEach(element -> System.out.print(element + ", "));
    }
}
