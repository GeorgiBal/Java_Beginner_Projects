package Inheritance;

public class Main {
    public static void main(String[] args) {
        Student ivan = new Student("Ivan", 16);
        System.out.println(ivan.getName());
        CollegeStudent kiro = new CollegeStudent("Kiro", 22, 19409);
        System.out.println(kiro.getNum());
        ivan.study();
        kiro.study();
        kiro.studyHarder();

    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void study(){
        System.out.println("I am studying");
    }
}


class CollegeStudent extends Student{
    public int num;

    public CollegeStudent(String name, int age, int num) {
        super(name, age);
        this.num = num;
    }

    void studyHarder(){
        System.out.println("I am studying harder");
    }

    public int getNum() {
        return num;
    }
}