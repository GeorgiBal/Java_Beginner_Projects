import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int stars = 1;
        int space = n;

        for (int i = 1; i <= n + 1; i++) {
            System.out.print(" ");
        }
        System.out.println("|");

        for (int j = 1; j <= n; j++) {

            for (int i = 1; i <= space - 1; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= stars; i++) {
                System.out.print("*");
            }
            System.out.print(" | ");
            for (int i = 1; i <= stars; i++) {
                System.out.print("*");
            }
            System.out.println();
            stars++;
            space--;
        }
    }
}
