import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            arr[i] = num;
        }
        for (int i = n-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ", ");
            }
        }

    }
}
