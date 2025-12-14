import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max1 = Math.max(a,b);
        int max2 = Math.max(max1,c);
        int min1 = Math.min(a,b);
        int min2 = Math.min(min1, c);
        int sum1 = a + b + c;
        int sum2 = sum1 - max2;

        if (sum2 == max2) {
            if (c > b && c < a) {
                min1 = c;
            }else if (b > a && b < c) {
                min1 = b;
            }else if (a > b && a < c) {
                min1 = a;
            }
            System.out.println(min2 + " + " + min1 + " = " + max2);
        }else{
            System.out.println("No");
        }
    }
}
