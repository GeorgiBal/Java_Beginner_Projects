import java.util.Scanner;

public class App11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (true){
            if (n%2 == 0) {
                System.out.println("Even number: "+ n);
                break;
            }else
                System.out.println("Number is not even!");
                n = scan.nextInt();
        }
    }
}
