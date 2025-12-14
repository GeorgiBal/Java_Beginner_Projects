import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

public class List_To_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        stack.addAll(list);
        System.out.println("Elements in stack from List: " + stack);
    }
}
