import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class QuickSortMain {
    public static void main(String[] args) {
        QuickSortMethods qs = new QuickSortMethods();
        System.out.println("Брой елементи в масива: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new Random().ints(n, 1, 100).toArray();

        System.out.println("Масивът преди сортиране: ");
        Arrays.stream(arr).forEach(a -> System.out.print(a + ", "));
        System.out.println();

        qs.QuickSort(arr, 0, arr.length - 1);

        System.out.println("Масивът след сортиране: ");
        Arrays.stream(arr).forEach(a -> System.out.print(a + ", "));
    }
}
