import java.util.Iterator;
import java.util.Stack;

public class Stack_Methods {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Elements in stack: " + stack);

        int x = stack.pop();
        System.out.println("Element removed from stack: " + x);

        x = stack.pop();
        System.out.println("Element removed from stack: " + x);

        System.out.println("The index of element 30 using search method: " + stack.search(30));
        System.out.println("The index of element 40 using search method: " + stack.search(40));

        System.out.println("Element returned using the peek() method: " + stack.peek());

        Iterator<Integer> i = stack.iterator();
        while(i.hasNext())
            System.out.println(i.next());

        System.out.println("Elements in stack: " + stack);
        System.out.println("Is stack empty: " + stack.isEmpty());

        stack.clear();
        System.out.println("Elements in stack after clear method: " + stack);
        System.out.println("Is stack empty: " + stack.isEmpty());

    }
}
