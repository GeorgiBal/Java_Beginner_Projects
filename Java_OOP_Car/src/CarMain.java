import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CarClass[] cars = new CarClass[0];

        String Marka;
        String Model;

        System.out.println("1. ADD");
        System.out.println("2. REMOVE");
        System.out.println("3. PRINT");
        System.out.println("4. EXIT");

        boolean check = true;

        int addCounter = 0;
        int index = 0;

        while (check) {

            System.out.print("МОЛЯ ИЗБЕРЕТЕ МЕЖДУ 1 и 4 : ");
            int choice = scan.nextInt();

            switch (choice) {

                case 1:

                    index++;
                    System.out.print("Моля въведете МАРКА : ");
                    Marka = scan.next();
                    System.out.print("Моля въведете МОДЕЛ : ");
                    Model = scan.next();

                    System.out.println();

                    CarClass[] temp = new CarClass[index];
                    for (int i = 0; i < cars.length; i++) {
                        temp[i] = cars[i];
                    }
                    cars = temp;

                    cars[addCounter] = new CarClass(Marka, Model);
                    addCounter++;
                    break;

                case 2:
                    if (cars.length == 0) {
                        System.out.println("Няма въведени коли!");
                        System.out.println();
                    } else {
                        System.out.print("Моля въведете МАРКА : ");
                        Marka = scan.next();
                        System.out.print("Моля въведете МОДЕЛ : ");
                        Model = scan.next();

                        System.out.println();

                        int counter = 0;

                        for (int i = 0; i < cars.length; i++) {
                            if (cars[i].Marka.equals(Marka) && cars[i].Model.equals(Model)) {
                                CarClass[] removedCar = new CarClass[cars.length - 1];
                                for (int j = 0; j < cars.length; j++) {
                                    if (j == i) {
                                        continue;
                                    }
                                    removedCar[counter++] = cars[j];
                                }
                                cars = removedCar;
                                index--;
                                addCounter--;
                            }
                        }
                    }
                    break;

                case 3:
                    if (cars.length == 0) {
                        System.out.println("Няма въведени коли!");
                        System.out.println();
                    } else {
                        for (CarClass car : cars) {
                            System.out.println("МАРКА: " + car.getMarka());
                            System.out.println("МОДЕЛ: " + car.getModel());
                            System.out.println();
                        }
                    }
                    break;

                case 4:
                    check = false;
                    break;

                default:
                    System.out.println("НЕВАЛИДНА КОМАНДА !");
            }
        }
    }
}
