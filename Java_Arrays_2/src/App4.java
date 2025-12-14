import java.util.Arrays;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] text = scan.nextLine().split(" ");
        int[] numbers = new int[text.length];
        for (int i = 0; i < text.length; i++) {
            numbers[i] = Integer.parseInt(text[i]);
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
