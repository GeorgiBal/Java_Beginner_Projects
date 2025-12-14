import java.util.*;

public class Task {

    static int[] myArr;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random myRand = new Random();

        System.out.print("Въведете размера на масива: ");
        int N = scan.nextInt();
        myArr = new int[N];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = myRand.nextInt(100);
        }
        System.out.println("Преди сортиране с FOR: " + Arrays.toString(myArr));
        BubSortFor();
        System.out.println("След сортиране с FOR: " + Arrays.toString(myArr));

        System.out.println();

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = myRand.nextInt(100);
        }
        System.out.println("Преди сортиране с DO-WHILE: " + Arrays.toString(myArr));
        BubSortDoWhile();
        System.out.println("След сортиране с DO-WHILE: " + Arrays.toString(myArr));

    }

    public static void BubSortFor() {
        int n = myArr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (myArr[j] > myArr[j + 1]) {
                    int temp = myArr[j];
                    myArr[j] = myArr[j+1];
                    myArr[j+1] = temp;
                }
            }
        }
    }
    public static void BubSortDoWhile(){
        int n = myArr.length-1;
        boolean swapped;

        do {
            swapped = false;
            n--;
            for (int i = 0; i <= n; i++) {
                if (myArr[i] > myArr[i+1]) {
                    int temp = myArr[i];
                    myArr[i] = myArr[i+1];
                    myArr[i+1] = temp;
                    swapped = true;
                }
            }
        }while (swapped);
    }
}
