import java.util.*;

public class App3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inherited money(1 - 1 000 000): ");
        double heritage = scan.nextDouble();

        System.out.print("Year to live(1801 - 1900): ");
        int toLive = scan.nextInt();
        int years = 18;

        for (int i = 1800; i <= toLive; i++) {
            if (i %2 == 0) {
                heritage -= 12_000;
            }else {
                heritage -= 12_000 + (50.0*years);
            }
            years++;

        }
        if (heritage >= 0) {
            System.out.format("Yes! He will live a carefree life and will have %.2f dollars left.", heritage);
        }else {
            System.out.format("He will need %.2f dollars to survive", Math.abs(heritage));
        }


    }
}
