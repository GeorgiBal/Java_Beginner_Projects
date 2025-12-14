import java.util.Stack;

public class Array_To_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] num = {10,20,30,40,50};

        for(int i : num)
            stack.push(i);

        System.out.println("Array elements in stack: " + stack);
    }
}
