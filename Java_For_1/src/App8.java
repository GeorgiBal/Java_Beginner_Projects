import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }
}
