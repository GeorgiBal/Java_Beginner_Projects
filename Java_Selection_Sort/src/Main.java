import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int[] myArray;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);Random myRand = new Random();

        System.out.print("Въведете брой елементи: ");
        int n = scan.nextInt();
        myArray = new int[n];

        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = myRand.nextInt(100);
        }
        System.out.println("Преди сортиране: " + Arrays.toString(myArray));
        SelectionSort();
        System.out.println("След сортиране: " + Arrays.toString(myArray));
    }

    public static void SelectionSort(){
        int MinIndex;
        for (int i = 0; i < myArray.length - 1; i++) {
            MinIndex = i;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] < myArray[MinIndex]) {
                    MinIndex = j;
                }
            }
            int temp;
            temp = myArray[i];
            myArray[i] = myArray[MinIndex];
            myArray[MinIndex] = temp;
        }
    }
}
