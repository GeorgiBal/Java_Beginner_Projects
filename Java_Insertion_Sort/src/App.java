import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    static int[] MyArr;
    static int n;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random MyRand = new Random();

        System.out.print("Number of elements: ");
        n = scan.nextInt();

        MyArr = new int[n];


        for (int i = 0; i <= MyArr.length - 1; i++) {
            MyArr[i] = MyRand.nextInt(100);
        }

        System.out.print("Elements before sorting: ");
        System.out.println(Arrays.toString(MyArr));
        InsertionSort();
        System.out.print("Elements after sorting: ");
        System.out.println(Arrays.toString(MyArr));
    }
    public static void InsertionSort(){
        int n = MyArr.length;
        for (int i = 0; i < n; i++) {
            int key = MyArr[i];
            int j = i -1;

            while (j >= 0 && MyArr[j] > key){
                MyArr[j+1] = MyArr[j];
                j --;
            }
            MyArr[j+1] = key;
        }
    }
}
