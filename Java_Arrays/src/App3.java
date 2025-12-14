import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String[] split_text = text.split(" ");
        int[] newArray = new int[split_text.length];

        for (int i = 0; i < split_text.length; i++) {
            newArray[i] = Integer.parseInt(split_text[i]);
        }

        int count = 0;
        int element = 0;

        for (int i = 0; i < split_text.length; i++) {
            int elementCount = 0;
            int tempElement = newArray[i];
            for (int j = 0; j < split_text.length; j++) {
                if (tempElement == newArray[j]) {
                    elementCount++;
                }
            }
            if (elementCount > count) {
                element = tempElement;
                count = elementCount;
            }
        }
        System.out.println(element);
    }
}
