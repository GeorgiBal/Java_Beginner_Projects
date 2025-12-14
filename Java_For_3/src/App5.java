import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Въведете цяло число за броя числа(1 - 1000): ");
        int n = scan.nextInt();

        double div2 = 0;
        double div3 = 0;
        double div4 = 0;

        System.out.println("Въведете цяло число(1 - 1000): ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("Число %d: ", i);
            int num = scan.nextInt();

            if (num %2 == 0) {
                div2++;
            }if (num %3 == 0) {
                div3++;
            }if (num %4 == 0) {
                div4++;
            }
        }
        double p1 = (div2/n)*100;
        System.out.format("%.2f", p1);
        System.out.println("%");
        double p2 = (div3/n)*100;
        System.out.format("%.2f", p2);
        System.out.println("%");
        double p3 = (div4/n)*100;
        System.out.format("%.2f", p3);
        System.out.println("%");
    }
}
