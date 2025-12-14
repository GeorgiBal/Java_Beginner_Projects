import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number(1 - 1000): ");
        int n = scan.nextInt();
        double p1,p2,p3,p4,p5;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            if (num > 800) {
                n5++;
            }else if (num >= 600 && num < 800) {
                n4++;
            }else if (num >= 400 && num < 600) {
                n3++;
            }else if (num >= 200 && num < 400) {
                n2++;
            }else if (num < 200) {
                n1++;
            }
        }
        p1 = n1*100.0 / n;
        System.out.println(p1 + "%");
        p2 = n2*100.0 / n;
        System.out.println(p2 + "%");
        p3 = n3*100.0 / n;
        System.out.println(p3 + "%");
        p4 = n4*100.0 / n;
        System.out.println(p4 + "%");
        p5 = n5*100.0 / n;
        System.out.println(p5 + "%");
    }
}
