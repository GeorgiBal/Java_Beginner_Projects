import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();

        double h = Math.abs(y2 - y1);
        double a = Math.abs(x2 - x3);
        double s = a*h/2;
        System.out.println(s);
    }
}
