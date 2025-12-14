import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean verifying = true;
        int n = 0;
        int itemCount = 0;
        int index = 0;
        int minElement = Integer.MAX_VALUE;
        boolean isSearching = true;
        System.out.print("Enter backpack capacity (in kg): ");
        int capacity = input.nextInt();
        System.out.print("Enter amount of items (between 2 and 5): ");
        while(verifying) {
            n = input.nextInt();
            if(n < 2){
                System.out.println("Number too small");
                System.out.print("Enter amount of items (between 2 and 5): ");
            } else if (n > 5){
                System.out.println("Number too big");
                System.out.print("Enter amount of items (between 2 and 5): ");
            } else {
                verifying = false;
            }
        }

        int[] items = new int[n];

        System.out.println("Enter weight for " + n + " items (can't be less than 2 kilograms)");
        for (int i = 0; i < items.length; i++) {
            while(items[i] < 2){
                items[i] = input.nextInt();
                if(items[i] < 2){
                    System.out.println("Items can't weight less than 2 kilograms\n");
                }
            }
            System.out.println("Valid Input! Item " + (i + 1) + " weights " + items[i] + " kilograms\n");

            if(items[i] < minElement){
                minElement = items[i];
            }

        }

        System.out.println("------------------------------------------");

        while(capacity > 0 && isSearching){
            if(capacity % items[index] == 0 || capacity - items[index] >= minElement  && minElement % (capacity % items[index]) == 0 || (capacity - items[index]) % items[index + 1] == 0){
                capacity -= items[index];
                itemCount++;
                System.out.println("Item " + itemCount + " weights " + items[index] + " kilograms");
                System.out.println("Remaining capacity: " + capacity + " kg");

            } else {
                if(index + 1 <= items.length - 1){
                    if(capacity % items[index + 1] == 0 || capacity - items[index + 1] >= minElement){
                        index++;
                    } else if(index + 2 <= items.length - 1){
                        index += 2;
                    } else {
                        isSearching = false;
                        System.out.println("Items can't fill the capacity of the backpack perfectly. Remaining capacity: " + capacity);
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