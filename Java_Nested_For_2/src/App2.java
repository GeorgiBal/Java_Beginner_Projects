import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int stars = 1;
        if (n %2 == 0) {stars++;}
        int padding = (n-stars)/2;
        if (n <= 2) {part("*", n);}
        else {
            part("-",padding);
            part("*",stars);
            part("-",padding);
            System.out.println();
        }
        while (stars!=n){
            stars+=2;
            padding--;
            part("-",padding);
            part("*",stars);
            part("-",padding);
            System.out.println();
        }
        if (n >= 3) {
            for (int i = 0; i < n/2; i++) {
                System.out.print("|");
                part("*", n-2);
                System.out.println("|");
            }
        }else{
            System.out.println();
            System.out.println("||");
        }
    }
    public static void part(String symbol, int count){
        for (int i = 0; i < count; i++) {
            System.out.print(symbol);
        }
    }
}
