import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fact = 1;
        do{
            fact*=n;
            n--;
        }while (n > 1);
        System.out.println(fact);
    }
}
