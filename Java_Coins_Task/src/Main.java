import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] coins = {50, 20, 10, 5, 2, 1};

        System.out.print("Моля въведете сумата(в лева и стотинки): ");
        double sum = scan.nextDouble();
        sum *= 100;
        System.out.println("Сумата в стотинки е: " + sum);

        int count = 0;
        int index = 0;

        while (sum > 0){
            if (sum - coins[index] >= 0) {
                sum -= coins[index];
                count++;

                System.out.print(count + " номинал е от " + coins[index] + " стотинки. ");
                System.out.println("Остатък: " + sum);

            }else {
                index++;
            }
        }
        System.out.println("------------------------------");
        System.out.println("Общия брой на номиналите е: " + count);
        System.out.println("------------------------------");
    }
}
