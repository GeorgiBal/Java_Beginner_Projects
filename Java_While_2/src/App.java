import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = scan.nextInt();
        int n1,n2,n3;
        char l1,l2;
        for (n1 = 1; n1 < n; n1++) {
            for (n2 = 1; n2 < n; n2++) {
                for (l1 = 'a'; l1 < 'a' + l; l1++) {
                    for (l2 = 'a'; l2 < 'a' + l; l2++) {
                        for (n3 = Math.max(n1,n2) + 1; n3 <= n; n3++) {
                            System.out.printf("%d%d%c%c%d ",n1,n2,l1,l2,n3);
                        }
                    }
                }
            }
        }
    }
}
