import java.util.Scanner;

public class App5 {
    static Scanner scan = new Scanner(System.in);
    static int n = scan.nextInt();
    public static void main(String[] args) {
        UpWing();
        part(" ", n-1);
        System.out.println("@");
        DownWing();
    }
    public static void part (String symbol,int count){
        for (int i = 0; i < count; i++) {
            System.out.print(symbol);
        }
    }
    public static void UpWing(){
        for (int i = 1; i <= n-2; i++) {
            if (i %2 != 0) {
                part("*",n-2);
                System.out.print("\\ /");
                part("*", n-2);
            }else {
                part("-",n-2);
                System.out.print("\\ /");
                part("-", n-2);
            }
            System.out.println();
        }
    }
    public static void DownWing(){
        for (int i = 1; i <= n-2; i++) {
            if (i %2 != 0) {
                part("*",n-2);
                System.out.print("/ \\");
                part("*", n-2);
            }else {
                part("-",n-2);
                System.out.print("/ \\");
                part("-", n-2);
            }
            System.out.println();
        }
    }
}
