import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        int point = scan.nextInt();
        int big = Math.max(first,second);
        int small = Math.min(first,second);
        int dis1 = Math.abs(small-point);
        int dis2 = Math.abs(point-big);
        int dis = Math.min(dis1,dis2);
        if (point >= small && point <= big) {
            System.out.println("in");
        }else{
            System.out.println("out");
        }
        System.out.println(dis);
    }
}
