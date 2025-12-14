import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int currentNum = scan.nextInt();
            sum += currentNum;
            if (currentNum > max)
                max = currentNum;

        }
        int finalSum = sum - max;
        if (finalSum == max)
            System.out.println("Yes, sum: " + finalSum);
        else{
            int diff = Math.abs(finalSum - max);
            System.out.println("No, diff: " + diff);
        }
    }
}
