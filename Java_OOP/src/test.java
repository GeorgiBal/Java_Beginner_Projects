import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cat = scan.nextLine();
        String gender = scan.nextLine();
        int years = 0;
        if (gender.equals("m")) {
            switch (cat) {
                case "British Shorthair" -> years = 13;
                case "Siamese" -> years = 15;
                case "Persian" -> years = 14;
                case "Ragdoll" -> years = 16;
                case "American Shorthair" -> years = 12;
                case "Siberian" -> years = 11;
            }
            int catMonths = years*2;
            System.out.println(catMonths + " cat months");
        }else if (gender.equals("f")) {
            switch (cat) {
                case "British Shorthair" -> years = 14;
                case "Siamese" -> years = 16;
                case "Persian" -> years = 15;
                case "Ragdoll" -> years = 17;
                case "American Shorthair" -> years = 13;
                case "Siberian" -> years = 12;
            }
            int catMonths = years*2;
            System.out.println(catMonths + " cat months");
        }else {
            System.out.println(cat + " is invalid cat!");
        }
    }
}
