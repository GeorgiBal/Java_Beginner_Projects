import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random myRandom = new Random();

        int[] myArray = new int[25];
        byte[] Taken = new byte[25];
        int number = 0;
        int count = 0;
        int M = 0;
        boolean end = false;

        System.out.print("Моля, въведете търсеното число M : ");
        M = input.nextInt();
        System.out.println();

        for (int i = 0; i <= myArray.length - 1; i++) {
            myArray[i] = myRandom.nextInt(100);
        }

        while(!end){
            number++;

            int i = myRandom.nextInt(25);
            if(myArray[i] == M){
                System.out.println("Има намерено съвпадение на индекс [" + i +"]");
                Taken[i] = 1;
                break;
            }else {
                Taken[i] = 1;
                count = 0;

                for (byte b : Taken) {
                    if (b == 1){
                        count++;
                    }
                }
                if(count == 25){
                    end = true;
                    System.out.println("Няма открити съвпадения");
                }
            }
        }

        System.out.println("Направени итерации: " + number);

        count = 0;
        for (byte b : Taken) {
            if(b == 1){
                count++;
            }
        }

        System.out.println("Брой проверени индекси: " + count);
        System.out.println("Моят масив: " + Arrays.toString(myArray));
        System.out.println("Битовия масив: " + Arrays.toString(Taken));
    }
}
