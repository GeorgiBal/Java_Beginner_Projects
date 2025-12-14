import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        float oddSum = 0;
        float oddMax = -1_000_000_000;
        float oddMin = 1_000_000_000;

        float evenSum = 0;
        float evenMax = -1_000_000_000;
        float evenMin = 1_000_000_000;

        for (int i = 1; i <= n; i++) {
            float currentNum = scan.nextFloat();
            if (i % 2 == 0) {
                evenSum += currentNum;
                if (currentNum > evenMax) {
                    evenMax = currentNum;
                }
                if (currentNum < evenMin) {
                    evenMin = currentNum;
                }
            } else {
                oddSum += currentNum;
                if (currentNum > oddMax) {
                    oddMax = currentNum;
                }
                if (currentNum < oddMin) {
                    oddMin = currentNum;
                }
            }
        }

        if (n <= 1) {
            System.out.println("OddSum = " + oddSum);
            System.out.println("OddMin = No");
            System.out.println("OddMax = No");
            System.out.println("EvenSum = " + evenSum);
            System.out.println("EvenMin = No");
            System.out.println("EvenMax = No");
        } else {
            System.out.println("OddSum = " + oddSum);
            System.out.println("OddMin = " + oddMin);
            System.out.println("OddMax = " + oddMax);
            System.out.println("EvenSum = " + evenSum);
            System.out.println("EvenMin = " + evenMin);
            System.out.println("EvenMax = " + evenMax);
        }
    }
}
