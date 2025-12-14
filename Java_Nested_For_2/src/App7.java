import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        part(".",n/2);
        part("#",n);
        part(".",n/2);
        System.out.println();

        for (int i = 0; i < n-2; i++) {
            part(".",n/2);
            System.out.print("#");
            part(".",n-2);
            System.out.print("#");
            part(".",n/2);
            System.out.println();
        }
        part("#",n/2+1);
        part(".",n-2);
        part("#",n/2+1);
        System.out.println();

        int dot = 1;
        int mid = 2*n-5;
        for (int i = 0; i < n-2; i++) {
            part(".",dot);
            System.out.print("#");
            part(".",mid);
            System.out.print("#");
            part(".",dot);
            System.out.println();
            dot++;
            mid-=2;
        }

        part(".",n-1);
        System.out.print("#");
        part(".",n-1);
    }
    public static void part (String symbol,int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(symbol);
        }
    }
}
