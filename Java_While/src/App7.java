import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        while (b != 0){
            int oldB = b;
            b = a % b;
            a = oldB;
        }
        System.out.println("GCD: " + a);
    }
}
