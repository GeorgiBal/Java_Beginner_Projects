import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < n; i++) {
            if (i %2 == 0)
                evenSum += scan.nextInt();
            else
                oddSum += scan.nextInt();
        }

        if (evenSum == oddSum)
            System.out.println("Yes, sum: " + evenSum);
        else{
            int diff = Math.abs(evenSum - oddSum);
            System.out.println("No, diff: " + diff);
        }
    }
}
