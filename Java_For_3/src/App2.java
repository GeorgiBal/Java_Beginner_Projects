import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Възраст(1 - 77): ");
        int age = scan.nextInt();

        System.out.print("Цена на пералнята(1 - 10 000): ");
        double washMachine = scan.nextDouble();

        System.out.print("Цена на играчки(0 - 40): ");
        int toysPrice = scan.nextInt();

        int toys = 0;
        int money = 0;

        for (int i = 1; i <= age; i++) {
            if (i %2 != 0) {
                toys++;

            }else {
                money += i*5;
                money -= 1;

            }

        }
        int savedMoney = money + (toys*toysPrice);

        if (savedMoney >= washMachine) {
            System.out.println("Yes!");
            System.out.println(savedMoney - washMachine);
        }else {
            System.out.println("No!");
            System.out.println(washMachine - savedMoney);
        }
    }
}
