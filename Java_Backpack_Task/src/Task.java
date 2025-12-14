import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Въведете вместимостта на раницата в килограми (цяло число): ");
        int backpack = scan.nextInt();
        int tempWeight = backpack;

        System.out.print("Въведете броя предмети (чяло число) в интервала от 2 до 5: ");
        int elements = scan.nextInt();
        System.out.println("Въведете теглото за всеки предмет(по-голямо от 2кг).");
        int[] kilos = new int[elements];
        for (int i = 0; i < elements; i++) {
            System.out.printf("Предмет [%d]: ", i + 1);
            int kilo = scan.nextInt();
            kilos[i] = kilo;
        }

        int[] stat = new int[kilos.length];
        System.out.println(Arrays.toString(stat));
        int index = 0;

        while (backpack > 0) {

            if (backpack - kilos[index] >= 0) {
                backpack -= kilos[index];
                stat[index]++;
                System.out.println(Arrays.toString(stat));
                if (kilos[index + 1] < elements) {
                    if (backpack - kilos[index + 1] == 1) {
                        backpack += kilos[index];
                        //backpack = tempWeight;
                        stat[index+1] = 0;
                        index+=2;
                    }
                    if (tempWeight -(kilos[index] + kilos[index + 1]) == 1) {
                        stat[index+1] = 0;
                        index+=2;
                    }
                }




            } else {
                if (backpack - kilos[index] < 0) {
                    index ++;
                }
            }
                if (index >= elements) {
                    System.out.println("Предметите не могат да запълнят раницата.");
                    break;
                }
                if (backpack == 0) {
                    System.out.println("Брой на използвани предмети: " + Arrays.toString(stat));
                    System.out.println("Има предмети за точно представяне на теглото на раницата");
                    break;
                }
            }

        }
    }
