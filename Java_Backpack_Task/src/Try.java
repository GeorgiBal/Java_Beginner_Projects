import java.util.Scanner;
import java.util.Arrays;

public class Try {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Въведете вместимостта на раницата в килограми (цяло число): ");
        int backpackWeight = scan.nextInt();

        System.out.print("Въведете броя предмети (чяло число) в интервала от 2 до 5: ");
        int elements = scan.nextInt();
        int[] kilos = new int[elements];

        int min = Integer.MAX_VALUE;
        int[] stat = new int[kilos.length];
        int index = 0;

        System.out.println("Въведете килограмите за " + elements + " предмета.");
        for (int i = 0; i < kilos.length; i++) {
            System.out.printf("Предмет [%d]: ", i + 1);
            kilos[i] = scan.nextInt();

            if(kilos[i] < min){
                min = kilos[i];
                kilos[i] = min;
            }

        }

        System.out.println(Arrays.toString(kilos));

        while(backpackWeight > 0){
            if(backpackWeight - kilos[index] == 0 || backpackWeight - kilos[index] >= min){
                backpackWeight -= kilos[index];
                stat[index]++;
                System.out.println(Arrays.toString(stat));


            } else {
                if(index + 1 <= kilos.length - 1){
                    if(backpackWeight % kilos[index + 1] == 0 || backpackWeight - kilos[index + 1] >= min){
                        index++;
                    } else if(index + 2 <= kilos.length - 1){
                        index += 2;
                    }else {
                        System.out.println("Предметите не могат да запълнят раницата.");
                        break;
                    }
                } else {
                    System.out.println("Предметите не могат да запълнят раницата.");
                    break;
                }
            }
            if (backpackWeight == 0) {
                System.out.println("Има предмети за точно представяне на теглото на раницата");
                break;
            }
        }
    }
}

