import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x >= 4 && x <= 10 && y >= -5 && y <= 3) {
            System.out.println("in");
        }else if (x >= 2 && x <= 12 && y >= -3 && y <= 1) {
            System.out.println("in");
        }else{
            System.out.println("out");
        }
    }
}
