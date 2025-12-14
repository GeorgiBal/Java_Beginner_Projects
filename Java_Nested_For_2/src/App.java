import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        part("*", 2 * n);
        part(" ", n);
        part("*", 2 * n);
        System.out.println();
        for (int i = 1; i <= n - 2; i++) {
            System.out.print("*");
            part("/", n*2 -2);
            System.out.print("*");
            if (i == (n-1)/2) {part("|", n);}
            else {part(" ", n);}
            System.out.print("*");
            part("/", n*2 -2);
            System.out.println("*");
        }
        part("*", 2 * n);
        part(" ", n);
        part("*", 2 * n);
    }
    public static void part(String symbol, int count){
        for (int i = 1; i < count; i++) {
            System.out.print(symbol);
        }
    }
}
