import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print("/");
        part("^", n / 2);
        System.out.print("\\");
        if (n > 4) {
            part("_", n / 2);
        }
        System.out.print("/");
        part("^", n / 2);
        System.out.println("\\");

        if (n <= 4) {
            for (int i = 0; i < n / 2; i++) {
                System.out.print("|");
                part(" ", (n * 2) - 2);
                System.out.println("|");
            }
        } else {
            for (int i = 0; i < n -3; i++) {
                System.out.print("|");
                part(" ", (n * 2) - 2);
                System.out.println("|");
            }
        }
        if (n >= 5) {
            System.out.print("|");
            part(" ", (n/2)+1);
            part("_",n/2);
            part(" ", (n/2)+1);
            System.out.println("|");
        }

        System.out.print("\\");
        part("_",n/2);
        System.out.print("/");
        if (n > 4) {
            part(" ",n/2);
        }
        System.out.print("\\");
        part("_",n/2);
        System.out.print("/");

    }
        public static void part (String symbol,int count){
            for (int i = 0; i < count; i++) {
                System.out.print(symbol);
            }
        }
}
