import java.util.Locale;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().toLowerCase(Locale.ROOT);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                sum += 1;
            else if (s.charAt(i) == 'e')
                sum += 2;
            else if (s.charAt(i) == 'i')
                sum += 3;
            else if (s.charAt(i) == 'o')
                sum += 4;
            else if (s.charAt(i) == 'u')
                sum += 5;
        }
        System.out.println("Sum: " + sum);
    }
}
