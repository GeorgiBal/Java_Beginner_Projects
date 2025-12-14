import java.util.Scanner;

public class App14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int num = row + col + 1;
                if (num > n) {
                    num = 2*n - num;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
