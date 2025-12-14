import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Calculation period(1 - 1000): ");
        int days = scan.nextInt();

        int doctors = 7;
        int treated = 0;
        int untreated = 0;

        System.out.println("Patients per day(1 - 10000): ");
        for (int i = 1; i <= days; i++) {
            System.out.printf("Day %d: ", i);
            int patients = scan.nextInt();

            if ((i %3 == 0) && (untreated > treated)) {
                doctors++;
            }

            if (patients <= doctors) {
                treated += patients;
            }else{
                untreated += patients - doctors;
                treated += doctors;
            }

        }
        System.out.println("Treated patients: " + treated);
        System.out.println("Untreated patients: " + untreated);

    }
}
