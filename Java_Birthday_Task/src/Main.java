import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        double WMPrice = scan.nextDouble();
        int PPrice = scan.nextInt();

        int toysNum = 0;
        int savedMoney = 0;
        int BDMoney = 10;

        for (int years = 0; years < age; years++) {
            if(years %2 == 0){
                savedMoney += (BDMoney - 1);
                BDMoney += 10;
            }else{
                toysNum++;
            }
        }
        savedMoney += toysNum*PPrice;
        if(savedMoney > WMPrice){
            System.out.println("Yes! " + (savedMoney - WMPrice));
        }else{
            System.out.println("No! " + (WMPrice - savedMoney));
        }


    }
}
