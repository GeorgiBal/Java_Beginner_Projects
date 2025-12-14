import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int itemCount = 0;
        int index = 0;
        boolean isSearching = true;
        System.out.print("Enter backpack capacity (in kg): ");
        int capacity = input.nextInt();
        System.out.print("Enter amount of items (between 2 and 5): ");
        int n = input.nextInt();
        int[] items = new int[n];

        System.out.println("Enter weight for " + n + " items");
        for (int i = 0; i < items.length; i++) {
            items[i] = input.nextInt();
        }

        while(capacity > 0 && isSearching){
            if(capacity - items[index] >= 0){
                capacity -= items[index];
                itemCount++;
                System.out.println("Item " + itemCount + " weights " + items[index] + " kilograms");
                System.out.println("Remaining capacity: " + capacity + " kg");

            } else {
                if(index + 1 <= items.length - 1){
                    if(capacity % items[index + 1] == 0){
                        index++;
                    } else {
                        index += 2;
                    }
                } else {
                    isSearching = false;
                    System.out.println("Items can't fill the capacity of the backpack perfectly. Remaining capacity: " + capacity);
                }
            }
        }
        System.out.println("Total amount of items used: " + itemCount);
    }
}