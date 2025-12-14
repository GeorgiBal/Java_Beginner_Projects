import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    static int[] myArray;
    static int[] myEven;
    static int[] myOdd;
    static int   countEven = 0;
    static int   countOdd  = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random myRand = new Random();

        System.out.print("Въведете брой елементи: ");
        int N = scan.nextInt();

        myArray = new int[N];

        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = myRand.nextInt(100);
        }
        System.out.println("myArray : " + Arrays.toString(myArray));

        divideArrays();
        System.out.println("ПРЕДИ СОРТИРАНЕ :: ");
        System.out.println("myEven : " + Arrays.toString(myEven));
        System.out.println("myOdd : " + Arrays.toString(myOdd));

        sortAscending();

        sortDescending();

        System.out.println();
        System.out.println("СЛЕД СОРТИРАНЕ :: ");
        System.out.println("myEven : " + Arrays.toString(myEven));
        System.out.println("myOdd : " + Arrays.toString(myOdd));
    }
    static void divideArrays(){
        for (int i = 0; i <= myArray.length; i++) {
            if (i >= myArray.length) {
                break;
            }
            if (myArray[i] %2 == 0) {
                countEven++;
            }else{
                countOdd++;
            }
        }
        myEven = new int[countEven];
        myOdd  = new int[countOdd];

        int counter = 0;
        int evenCounter = 0;
        int oddCounter = 0;
        while (counter < myArray.length){
            if (myArray[counter] %2 == 0) {
                myEven[evenCounter] = myArray[counter];
                evenCounter++;
            }else{
                myOdd[oddCounter] = myArray[counter];
                oddCounter++;
            }

            counter++;
        }
    }

    static void sortAscending(){
        int n = myEven.length-1;
        boolean swapped;

        do {
            swapped = false;
            n--;
            for (int i = 0; i <= n; i++) {
                if (myEven[i] > myEven[i+1]) {
                    int temp = myEven[i];
                    myEven[i] = myEven[i+1];
                    myEven[i+1] = temp;
                    swapped = true;
                }
            }
        }while (swapped);
    }

    static void sortDescending(){
        int n = myOdd.length-1;
        boolean swapped;

        do {
            swapped = false;
            n--;
            for (int i = 0; i <= n; i++) {
                if (myOdd[i] < myOdd[i+1]) {
                    int temp = myOdd[i];
                    myOdd[i] = myOdd[i+1];
                    myOdd[i+1] = temp;
                    swapped = true;
                }
            }
        }while (swapped);
    }
}
