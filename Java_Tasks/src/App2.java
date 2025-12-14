import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int w = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(Math.ceil((double) b/(c*w)));
    }
}
