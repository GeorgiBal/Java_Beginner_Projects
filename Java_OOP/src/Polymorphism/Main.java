package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};
        for (Vehicle x: racers){
            x.go();
        }
    }
}

class Vehicle{
    public void go(){
        System.out.println("The vehicle starts!");
    }
}

class Car extends Vehicle{
    @Override
    public void go(){
        System.out.println("The car starts!");
    }
}

class Bicycle extends Vehicle{
    @Override
    public void go(){
        System.out.println("The bicycle starts!");
    }
}

class Boat extends Vehicle{
    @Override
    public void go(){
        System.out.println("The boat starts!");
    }
}