import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(num);
            num *= 2;
        }
    }
}
