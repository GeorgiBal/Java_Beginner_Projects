import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String[] split_text = text.split(" ");

        for (int i = split_text.length - 1; i >= 0; i--) {
            System.out.print(split_text[i] + " ");
        }
    }
}
