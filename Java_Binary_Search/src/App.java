import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(1000);
        int low = 1;
        int high = 1000;
        boolean win = false;

        while (!win) {
            System.out.printf("Въведете опит за познаване на числото(%d - %d): ",low,high);
            System.out.println();
            int myNum = scan.nextInt();
            if (myNum < number) {
                System.out.println("Нагоре!");
                if (myNum > low) {
                    low = myNum;
                }
                System.out.printf("Числото е в диапазон(%d - %d)",low,high);
                System.out.println();
                System.out.println("Средно число: " + (low + high)/2);
            } else if (myNum > number) {
                System.out.println("Надолу!");
                if (myNum < high) {
                    high = myNum;
                }
                System.out.printf("Числото е в диапазон(%d - %d)",low,high);
                System.out.println();
                System.out.println("Средно число: " + (low + high)/2);
            } else {
                System.out.println("Познахте!");
                win = true;
            }
        }
    }
}
