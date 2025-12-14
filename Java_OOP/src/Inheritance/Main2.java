package Inheritance;

public class Main2 {
    public static void main(String[] args) {
        Teacher tomov = new Teacher(100000000, "Qvor", 100, "Java, C, C++, Tui unui");
        System.out.println(tomov.subject);
        tomov.teach();
    }
}

class Employee{
    double salary;
    String name;
    int age;

    public Employee(double salary, String name, int age) {
        this.salary = salary;
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Employee {
    String subject;

    public Teacher(double salary, String name, int age, String subject) {
        super(salary, name, age);
        this.subject = subject;
    }

    public void teach(){
        System.out.println("I teach");
    }
}

class Programmer extends Employee {
    String language;

    public Programmer(double salary, String name, int age, String language) {
        super(salary, name, age);
        this.language = language;
    }

    public void code(){
        System.out.println("I code");
    }
}