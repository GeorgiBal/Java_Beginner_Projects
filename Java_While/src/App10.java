import java.util.Scanner;

public class App10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n %i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        }else
            System.out.println("Not prime");
    }
}
