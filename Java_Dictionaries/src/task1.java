import java.util.Hashtable;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Hashtable<Integer, String> my_dict = new Hashtable<>( );


        my_dict.put(1, "Monday");
        my_dict.put(2, "Tuesday");
        my_dict.put(3, "Wednesday");
        my_dict.put(4, "Thursday");
        my_dict.put(5, "Friday");
        my_dict.put(6, "Saturday");
        my_dict.put(7, "Sunday");

        boolean not_running = false;

        while (!not_running){
            System.out.print("Enter number(1 - 7): ");
            int n = scan.nextInt();
            if (n < 1 || n > 7) {
                not_running = false;
            }else {
                System.out.println("The day is: " + my_dict.get(n));
                not_running = true;
            }
        }
    }
}