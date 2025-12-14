import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int top = 1; top <= n; top++) {

            for (int i = 1; i <= n - top; i++) {
                System.out.print(" ");
            }

            System.out.print("*");
            for (int i = 1; i < top; i++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int bottom = 1;bottom <= n-1; bottom++) {
            for (int i = n; i >= n - bottom + 1; i--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = n - 1; i > bottom; i--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
