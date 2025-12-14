import java.util.Scanner;

public class App9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        do{
            sum += n%10;
            n /= 10;
        }while (n > 0);
        System.out.println(sum);
    }
}
