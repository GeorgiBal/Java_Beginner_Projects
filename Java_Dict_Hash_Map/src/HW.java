import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<String, String> Catalog = new HashMap<>();
        Catalog.put("Money For Nothing", "Dire Straits");
        Catalog.put("Brothers In Arms", "Dire Straits");
        Catalog.put("Your Latest Trick", "Dire Straits");
        Catalog.put("Walk Of Life", "Dire Straits");
        Catalog.put("Why Worry", "Dire Straits");
        Catalog.put("Urgent", "Foreigner");
        Catalog.put("Snowman", "Foreigner");
        Catalog.put("I Want To Know", "Foreigner");
        Catalog.put("The Wall", "Pink Floyd");
        Catalog.put("Shine On You Crazy Diamond", "Pink Floyd");
        Catalog.put("Wish You Were Here", "Pink Floyd");
        Catalog.put("Time", "Pink Floyd");

        System.out.println("Каталогът съдържа " + Catalog.size() + " записа");
        System.out.println("Съдържание на каталога");

        Catalog.forEach((key, value) -> System.out.println("Група: " + value + " || Песен: " + key));

        System.out.print("Въведете търсене по група(Band) или по песен(Song): ");
        String choice = scan.nextLine().toLowerCase(Locale.ROOT);

        if (Objects.equals(choice, "band")) {
            System.out.print("Въведете име на група: ");
            String band = scan.nextLine();
            System.out.println();

            Catalog.forEach((key, value) ->
            {
                if (value.equals(band)) {

                    System.out.println(key);
                }
            });

        }

        if (Objects.equals(choice, "song")) {
            System.out.print("Въведете име на песен: ");
            String song = scan.nextLine();
            System.out.println();

            Catalog.forEach((key, value) ->
            {
                if (key.equals(song)) {
                    System.out.println(value);
                }
            });

        }

    }
}
