import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int n1,n2,n3,n4;
        for (n1 = 1; n1 <= 9; n1++) {
            for (n2 = 1; n2 <= 9; n2++) {
                for (n3 = 1; n3 <= 9; n3++) {
                    for (n4 = 1; n4 <= 9; n4++) {
                        if (n%n1 == 0 && n%n2 == 0 && n%n3 == 0 && n%n4 == 0) {
                            System.out.printf("%d%d%d%d ",n1,n2,n3,n4);
                        }
                    }
                }
            }
        }
    }
}
