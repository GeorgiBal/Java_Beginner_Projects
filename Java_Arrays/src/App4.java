import java.util.Locale;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine().toLowerCase(Locale.ROOT);
        char[] split_text = text.toCharArray();

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i = 0; i < split_text.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (split_text[i] == alphabet[j]) {
                    System.out.println(split_text[i] + " -> " + j);
                }
            }
        }
    }
}
