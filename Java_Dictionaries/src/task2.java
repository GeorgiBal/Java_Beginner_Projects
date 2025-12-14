import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class task2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Hashtable<Integer, String> my_dict = new Hashtable<>( );


        my_dict.put(1, "January");
        my_dict.put(2, "February");
        my_dict.put(3, "March");
        my_dict.put(4, "April");
        my_dict.put(5, "May");
        my_dict.put(6, "June");
        my_dict.put(7, "July");
        my_dict.put(8, "August");
        my_dict.put(9, "September");
        my_dict.put(10, "October");
        my_dict.put(11, "November");
        my_dict.put(12, "December");

        System.out.print("What do you want to see: 1 -> Key | 2 -> Value: ");
        int choice = scan.nextInt();

        if (choice == 1) {
            Enumeration<Integer> keys = my_dict.keys();
            Enumeration<String> values = my_dict.elements();

            System.out.print("Enter the month number: ");
            String month_num = scan.next();

            while (keys.hasMoreElements()){
                String current_key = keys.nextElement().toString();
                String current_value = values.nextElement();

                if (current_key.equals(month_num)) {
                    System.out.println(current_value);
                }
            }
        }else if (choice == 2) {
            Enumeration<Integer> keys = my_dict.keys();
            Enumeration<String> values = my_dict.elements();

            System.out.print("Enter the month name: ");
            String month_name = scan.next();

            while (keys.hasMoreElements()){
                String current_key = keys.nextElement().toString();
                String current_value = values.nextElement();

                if (current_value.equals(month_name)) {
                    System.out.println(current_key);
                }
            }
        }
    }
}
