import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] num = scan.nextLine().split(" ");
        double[] parsed = new double[num.length];

        for (int i = 0; i < num.length; i++) {
            parsed[i] = Double.parseDouble(num[i]);
            System.out.println(num[i] + " => " + (int)Math.round(parsed[i]));
        }

    }
}
