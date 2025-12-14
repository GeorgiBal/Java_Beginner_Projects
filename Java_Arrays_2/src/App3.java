import java.util.Arrays;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] text = scan.nextLine().split(" ");
        for (int i = 0; i < text.length/2; i++) {
            String e1 = text[i];
            String e2 = text[text.length - 1 - i];
            text[i] = e2;
            text[text.length - 1 -i] = e1;
        }
        System.out.println(Arrays.toString(text));
    }
}
