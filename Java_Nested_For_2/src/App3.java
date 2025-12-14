import java.util.Scanner;

public class App3 {
    static Scanner scan = new Scanner(System.in);
    static int n = scan.nextInt();
    static int stars = 1;
    static int padding = (int) Math.ceil((n / 2f)-1);
    static int temp = padding;
    public static void main(String[] args) {
        if (n%2 == 0) {
            stars++;
        }
        if (n >= 3) {
            Start_End();
        }else{
            part("*", stars);
        }
        int middle = stars;
        for (int i = 0; i < temp; i++) {
            padding--;
            part("-",padding);
            System.out.print("*");
            part("-", middle);
            System.out.print("*");
            part("-",padding);
            System.out.println();
            middle+=2;
        }
        middle = n-2;
        for (int i = 0; i < temp-1; i++) {
            middle -=2;
            padding++;
            part("-",padding);
            System.out.print("*");
            part("-", middle);
            System.out.print("*");
            part("-",padding);
            System.out.println();
        }
        if (n >= 3) {
            Start_End();
        }
    }
    public static void part(String symbol, int count){
        for (int i = 0; i < count; i++) {
            System.out.print(symbol);
        }
    }
    public static void Start_End() {
        part("-",temp);
        part("*",stars);
        part("-",temp);
        System.out.println();
    }
}
