import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int s = scan.nextInt();

        for (int i = m; i >= n; i--) {
            if (i%2 == 0 && i%3 == 0) {
                if (i == s) {
                    break;
                }
                System.out.print(i + " ");
            }
        }
    }
}
