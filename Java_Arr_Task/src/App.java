import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Въведете бройя на елементите в масива: ");
        int n = scan.nextInt();

        int[] myARR = new int[n];

        for (int i = 0; i <= n-1 ; i++) {
            System.out.printf("Текущ [%d] елемент в масива: ", i);
            myARR[i] = scan.nextInt();
        }
        int currentMAX = myARR[0];

        for (int i = 1; i <= n-1; i++) {
            if (myARR[i] > currentMAX)
                currentMAX = myARR[i];
        }

        System.out.println("Най-големият елемент е: " + currentMAX);
        System.out.println("Край на програмата!");
    }
}
