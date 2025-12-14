import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        int n = scan.nextInt();

        for (int i = 0; i <= n; i++) {

            String command = scan.nextLine();
            String[] newCom = command.split(" ");

            if (command.toLowerCase(Locale.ROOT).equals("distinct")) {

                LinkedHashSet<String> set
                        = new LinkedHashSet<>(Arrays.asList(arr));
                arr = set.toArray(new String[0]);

            }

            else if (command.toLowerCase(Locale.ROOT).equals("reverse")) {

                int num = 0;
                String[] copy = new String[arr.length];
                for (int j = arr.length; j > 0; j--) {
                    copy[num] = arr[j - 1];
                    num++;
                }
                System.arraycopy(copy, 0, arr, 0, copy.length);

            }

            else if (newCom[0].toLowerCase(Locale.ROOT).equals("replace")) {

                int replacement = Integer.parseInt(newCom[1]);
                arr[replacement] = newCom[2];

            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ", ");
            }
        }

    }
}
