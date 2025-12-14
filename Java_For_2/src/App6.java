import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sum = 0;
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int firstNum = scan.nextInt();
            int secondNum = scan.nextInt();
            int currentSum = firstNum + secondNum;
            if (i == 0) {
                sum = currentSum;
            }else{
                if (sum != currentSum) {
                    int currentDiff = Math.abs(sum - currentSum);
                    if (currentDiff > maxDiff) {
                        maxDiff = currentDiff;

                    }

                }
            }
        }
        if (maxDiff == Integer.MIN_VALUE)
            System.out.println("Yes, value = " + sum);
        else
            System.out.println("No, diff = " + maxDiff);
    }
}
