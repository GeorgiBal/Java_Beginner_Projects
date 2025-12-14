import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double[] coins = {0.50, 0.20, 0.10};
        CoffeeMachine cm = new CoffeeMachine(70, 50, 100, 50, 70);
        cm.MakeMilkCoffee(2);
        System.out.println(cm.Change(coins, 0.7));
        System.out.println(cm.coffee_powder);
        System.out.println(cm.Buy());
    }

    public static class CoffeeMachine {
        public double coffee_powder, milk, water, sugar, tea, price;
        public ArrayList<Double> returnedMoney = new ArrayList<>();

        public CoffeeMachine(double coffee_powder, double milk, double water, double sugar, double tea){
            this.coffee_powder = coffee_powder;
            this.milk = milk;
            this.water = water;
            this.sugar = sugar;
            this.tea = tea;
        }

        public void MakeBlackCoffee() {
            BlackCoffee bc = new BlackCoffee();
            this.coffee_powder -= bc.coffee_powder;
            this.water -= bc.water;
            this.price = bc.price;
        }

        public void MakeMilkCoffee(double sugar) {
            MilkCoffee mc = new MilkCoffee();
            this.coffee_powder -= mc.coffee_powder;
            this.water -= mc.water;
            this.milk -= mc.milk;
            this.sugar -= sugar;
            this.price = mc.price;
        }

        public void MakeTea(double sugar) {
            Tea tea = new Tea();
            this.tea -= tea.tea;
            this.water -= tea.water;
            this.sugar -= sugar;
            this.price = tea.price;
        }

        public ArrayList<Double> Change(double[] coins, double money){
            double change = 0;
            if (money > this.price) {
                change = money - this.price;
                change *= 10;
                change = Math.round(change);
                change /= 10;
            }else if (money < this.price) {
                returnedMoney.add(null);
                return returnedMoney;
            }else if (money == this.price) {
                returnedMoney.add(0.0);
                return returnedMoney;
            }
            for (int i = 0; i < coins.length; i++) {
                while (change - coins[i] >= 0){
                    change -= coins[i];
                    change *= 10;
                    change = Math.round(change);
                    change /= 10;
                    returnedMoney.add(coins[i]);
                }
            }
            return returnedMoney;
        }

        public boolean Buy(){
            return this.returnedMoney.get(0) != null;
        }
    }
    public static class BlackCoffee{
        double coffee_powder = 10;
        double water = 80;
        double price = 0.60;
    }
    public static class MilkCoffee{
        double coffee_powder = 8;
        double milk = 20;
        double water = 60;
        double price = 0.70;
    }

    public static class Tea{
        double tea = 10;
        double water = 80;
        double price = 0.50;
    }
}