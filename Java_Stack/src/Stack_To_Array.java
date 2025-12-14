import java.util.Stack;

public class Stack_To_Array {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Elements in stack: " + stack);

        Object[] arr = stack.toArray();
        System.out.println("Elements in Array: ");
        for(int i = 0;i < arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
