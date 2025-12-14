import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int n3 = n%10;
        int n2 = (n/10)%10;
        int n1 = n/100;

        for (int N = 1; N <= n1 + n2; N++) {
            for (int M = 1; M <= n1 + n3; M++) {
                if (n%5 == 0) {
                    n-=n1;
                } else if (n%3 == 0) {
                    n-=n2;
                }else{
                    n+=n3;
                }
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
