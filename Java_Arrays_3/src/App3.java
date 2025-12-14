import java.util.Locale;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] products = scan.nextLine().split(" ");

        String[] quantity = scan.nextLine().split(" ");

        String[] price = scan.nextLine().split(" ");

        while (true){
            String product = scan.nextLine();
            if (product.toLowerCase(Locale.ROOT).equals("done")) {
                break;
            }else{
                for (int i = 0; i < products.length; i++) {
                    if (product.equals(products[i])) {
                        System.out.printf("%s costs: %s; Available quantity: %s", products[i], price[i], quantity[i]);
                        System.out.println();
                    }
                }
            }
        }
    }
}
