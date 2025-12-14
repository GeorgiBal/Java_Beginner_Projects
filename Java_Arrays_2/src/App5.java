import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] numbers = scan.nextLine().split(" ");
        String e1 = numbers[numbers.length/2 - 1];
        String e2 = numbers[numbers.length/2];
        System.out.printf("{ %s, %s }", e1, e2);
    }
}
