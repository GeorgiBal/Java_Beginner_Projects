class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void talk() {
        System.out.println("I can talk");
    }
}

class Dog extends Animal{

    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void talk() {
        System.out.println("Bark\n");
    }

    @Override public String toString(){
        return "Name: " + name + "\n" +
                "Age: " + age;
    }
}

class Cat extends Animal{

    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void talk() {
        System.out.println("Meaw\n");
    }

    @Override public String toString(){
        return "Name: " + name + "\n" +
                "Age: " + age;
    }
}

public class Main{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Toshko", 5);
        Cat cat1 = new Cat("Daniel", 4);

        System.out.println(dog1);
        dog1.talk();

        System.out.println(cat1);
        cat1.talk();
    }
}
