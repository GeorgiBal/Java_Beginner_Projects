import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int n1,n2,n3,n4,n5,n6;

        for (n1 = 0; n1 <= 9; n1++) {
            for (n2 = 0; n2 <= 9; n2++) {
                for (n3 = 0; n3 <= 9; n3++) {
                    for (n4 = 0; n4 <= 9; n4++) {
                        for (n5 = 0; n5 <= 9; n5++) {
                            for (n6 = 0; n6 <= 9; n6++) {
                                int num = n1*n2*n3*n4*n5*n6;
                                if (num == n) {
                                    System.out.printf("%d%d%d%d%d%d ",n1,n2,n3,n4,n5,n6);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
