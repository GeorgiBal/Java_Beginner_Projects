import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int mid = 0;
        int StartLine = n*3;
        int EndLine = n*2-2;
        for (int i = 0; i < n; i++) {
            part("_",StartLine);
            System.out.print("*");
            part("_",mid);
            System.out.print("*");
            part("_",EndLine);
            System.out.println();
            mid++;
            EndLine--;
        }

        mid--;
        EndLine++;
        for (int i = 0; i < n/2; i++) {
            part("*",StartLine+1);
            part("_",mid);
            System.out.print("*");
            part("_",EndLine);
            System.out.println();
        }

        for (int i = 0; i < n/2-1; i++) {
            part("_",StartLine);
            System.out.print("*");
            part("_",mid);
            System.out.print("*");
            part("_",EndLine);
            System.out.println();
            mid+=2;
            StartLine--;
            EndLine--;
        }
        mid-=2;
        part("_",StartLine);
        part("*",mid+4);
        part("_",EndLine);
    }
    public static void part (String symbol,int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(symbol);
        }
    }
}
