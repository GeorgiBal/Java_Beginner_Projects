import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Въведете брой на товарите за превоз(1 - 1000): ");
        int products = scan.nextInt();

        int sumWeight = 0;
        double bus = 0;
        double truck = 0;
        double train = 0;

        System.out.println("Въведете тонажът на поредния товар(1 - 1000): ");
        for (int i = 1; i <= products; i++) {
            System.out.printf("Товар %d: ", i);
            int weight = scan.nextInt();
            sumWeight += weight;

            if (weight <= 3) {
                bus += weight;
            }else if (weight <= 11) {
                truck += weight;
            }else {
                train += weight;
            }

        }

        double averWeight = (bus*200 + truck*175 + train*120)/sumWeight;
        System.out.format("%.2f\n", averWeight);

        double percentBus = bus/sumWeight * 100;
        System.out.format("%.2f", percentBus);
        System.out.println("%");
        double percentTruck = truck/sumWeight * 100;
        System.out.format("%.2f", percentTruck);
        System.out.println("%");
        double percentTrain = train/sumWeight * 100;
        System.out.format("%.2f", percentTrain);
        System.out.println("%");
    }
}
