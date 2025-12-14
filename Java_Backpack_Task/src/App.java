import java.util.Arrays;
import java.util.Scanner;

public class App {
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

        System.out.println(kilos.length);
        int index = 0;
        int count = 1;
        System.out.println(Arrays.toString(kilos));

        while (true){
            System.out.println("updated: " + backpack);
            if (backpack - kilos[index] == 0) {
                System.out.println("Има предмети за точно представяне на теглото на раницата");
                break;
            }else if (backpack - kilos[index] > 0) {
                backpack -= kilos[index];
                System.out.println("yes " + index);
                System.out.println("> 0 : " + backpack);
                if (backpack == 1) {
                    //backpack = tempWeight;
                    backpack += kilos[index];
                    index++;
                }
                if (backpack == 2 && kilos[index + 1] != 2) {
                    //backpack = tempWeight;
                    backpack += kilos[index];
                    index++;
                }
            }else if(backpack - kilos[index] < 0) {
                //backpack += kilos[index];
                System.out.println("no " + index);
                index++;
                System.out.println("< 0 : " + backpack);
                System.out.println("index at: " + index);
            }
            if (index >= elements) {
                index = (index + count) - elements;
                count++;
                System.out.println(count);
                if (count >= elements) {
                    System.out.println("Няма предмети за точно представяне на теглото на раницата");
                    break;
                }
            }

                /*else if(backpack - kilos[index] < 0) {
                backpack += kilos[index];
                System.out.println("no " + index);
                index++;
                System.out.println(backpack);
                System.out.println(index);


                    //System.out.println("Няма предмети за точно представяне на теглото на раницата");
                    //break;
                }
                /*
                    if ((index + 1) - kilos.length == kilos.length) {
                        System.out.println("Няма предмети за точно представяне на теглото на раницата");
                        break;
                    }else {
                        System.out.println("at" + index);
                        index = (index + 1) - kilos.length;
                        System.out.println(index);
                    }

                }*/
        }
    }
}
