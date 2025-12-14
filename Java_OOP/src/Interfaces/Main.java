package Interfaces;

public class Main {
    public static void main(String[] args) {
        MountainBike bike = new MountainBike(20);

        bike.applyBrake(5);
        System.out.println("Speed after brake: " + bike.speed);

        bike.speedUp(10);
        System.out.println("Speed after speed up: " + bike.speed);
    }
}


interface Bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class MountainBike implements Bicycle{
    public int speed;
    public MountainBike(int speed){
        this.speed = speed;
    }

    @Override
    public void applyBrake(int decrement){
        speed -= decrement;
    }

    @Override
    public void speedUp(int increment){
        speed += increment;
    }
}