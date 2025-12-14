import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String[] split_text = text.split(" ");
        int[] newArray = new int[split_text.length];

        for (int i = 0; i < split_text.length; i++) {
            newArray[i] = Integer.parseInt(split_text[i]);
            if (newArray[i] %2 != 0) {
                System.out.print(split_text[i] + " ");
            }
        }
    }
}
