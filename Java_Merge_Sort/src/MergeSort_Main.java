import java.util.Random;
import java.util.Scanner;

public class MergeSort_Main {
    public static void main(String[] args) {
        System.out.println("Брой елементи в масива: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new Random().ints(n, 1, 100).toArray();

        System.out.println("Масивът преди сортиране: ");
        for (int i : arr)
            System.out.print(i + ", ");
        System.out.println();

        MergeSort_Methods.MergeSort ms = new MergeSort_Methods.MergeSort();
        ms.sort(arr, 0, arr.length - 1);

        System.out.println("Масивът след сортиране: ");
        for (int i : arr)
            System.out.print(i + ", ");
    }
}
