import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter even number: ");
        while (true){
            try {
                int n = scan.nextInt();
                if (n%2 == 0) {
                    System.out.println("Even number: " + n);
                    break;
                }else {
                    System.out.print("Number is not even! ");
                }

            }catch (Exception ex){
                System.out.println("Invalid number!");
                break;
            }
        }
    }
}
