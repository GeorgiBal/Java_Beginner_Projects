import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] myArray = new Random().ints(20, 1, 11).toArray();

        System.out.println(Arrays.toString(myArray));

        HashMap<Integer,Integer> Counters = new HashMap<>(10);

        for (int i = 1; i <= 10; i++) {
            Counters.put(i, 0);
        }

        for (int CurrentElement : myArray) {
            int counter = Counters.get(CurrentElement) + 1;
            Counters.put(CurrentElement, counter);
        }

        for (Map.Entry<Integer, Integer> items : Counters.entrySet()) {
            System.out.printf("Елемент %d се повтаря на %d пъти", items.getKey(), items.getValue());
            System.out.println();
        }
    }
}
