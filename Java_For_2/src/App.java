import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
            leftSum += scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            rightSum += scan.nextInt();
        }

        if (leftSum == rightSum)
            System.out.println("Yes, sum: " + leftSum);
        else{
            int diff = Math.abs(leftSum - rightSum);
            System.out.println("No, diff: " + diff);
        }
    }
}
