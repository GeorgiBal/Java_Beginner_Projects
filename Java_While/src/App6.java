import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n<1 || n>100){
            System.out.println("Invalid number!");
            n = scan.nextInt();
        }
        System.out.println("Correct number is: " + n);
    }
}
