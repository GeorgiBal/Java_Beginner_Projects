import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        part(".",n+1);
        part("_",2*n+1);
        part(".",n+1);
        System.out.println();

        int dot = n;
        int mid = 2*n-1;
        for (int i = 0; i < n; i++) {
            part(".",dot);
            System.out.print("//");
            part("_",mid);
            System.out.print("\\\\");
            part(".",dot);
            System.out.println();
            dot--;
            mid+=2;
        }
        System.out.print("//");
        part("_",(mid-5)/2);
        System.out.print("STOP!");
        part("_",(mid-5)/2);
        System.out.println("\\\\");

        for (int i = 0; i < n; i++) {
            part(".",dot);
            System.out.print("\\\\");
            part("_",mid);
            System.out.print("//");
            part(".",dot);
            System.out.println();
            dot++;
            mid-=2;
        }
    }
    public static void part (String symbol,int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(symbol);
        }
    }
}
