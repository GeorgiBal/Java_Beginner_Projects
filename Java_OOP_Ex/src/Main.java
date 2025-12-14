import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "M5", 250, 250000, "Ivan");
        Car car2 = new Car("BMW", "M4", 200, 200000, "Ivan");
        Car car3 = new Car("Audi", "Q8", 180, 180000, "Ivan");

        Car[] cars = {car1, car2, car3};
        Car[] c = findCar(cars, "BMW");
        System.out.println(Arrays.toString(c));
        System.out.println(findPower(cars));
        System.out.println(findAveragePrice(cars));
    }

    public static Car[] findCar(Car[] car, String brand){
        Car[] brands = new Car[car.length];
        int index = 0;
        for (int i = 0; i < car.length; i++) {
            if(car[i].brand.equals(brand)){
                brands[index] = car[i];
                index ++;
            }
        }
        return brands;
    }

    public static Car findPower(Car[] car){
        int temp_power = car[0].power;
        Car temp_car = car[0];
        for (int i = 1; i < car.length; i++) {
            if(car[i].power > temp_power){
                temp_power = car[i].power;
                temp_car = car[i];
            }
        }
        return temp_car;
    }

    public static double findAveragePrice(Car[] car){
        double price = 0;
        for (int i = 0; i < car.length; i++) {
            price += car[i].price;
        }
        return price/car.length;
    }
}

class Car {
    String brand, model;
    int power;
    double price;
    String owner;

    public Car(String brand, String model, int power, double price, String owner) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.price = price;
        this.owner = owner;
    }
}