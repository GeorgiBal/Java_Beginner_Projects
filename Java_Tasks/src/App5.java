import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int m = scan.nextInt();
        int maxD = 31;

        if (m == 2) {
            maxD = 28;
        }
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            maxD = 30;
        }

        d += 5;
        if (d > maxD) {
            d -= maxD;
            m++;
            if (m > 12) {
                m = 1;
            }
        }
        if (m > 9) {
            System.out.printf("%d.%d",d,m);
        }else {
            System.out.printf("%d.0%d",d,m);
        }
    }
}
