import java.util.ArrayList;
import java.util.Scanner;

public class Utilities {

    public static ArrayList<Students> studentscore = new ArrayList<>();

    public static void start() {

        Scanner scan = new Scanner(System.in);

        Students student01 = new Students("Ivan" ,"Ivanov" , 19401);
        studentscore.add(student01);

        Students student02 = new Students("Georgi" ,"Georgiev" , 19402);
        studentscore.add(student02);

        Students student03 = new Students("Petko" ,"Petkov" , 19403);
        studentscore.add(student03);

        Students student04 = new Students("Stoqn" ,"Stoqnov" , 19404);
        studentscore.add(student04);

        Students student05 = new Students("Kiril" ,"Kirilov" , 19405);
        studentscore.add(student05);

        for (Students student: studentscore) {

            System.out.println("Enter score for students: " + student.number);

            System.out.print("Enter score for math: ");
            student.studentScores.math = scan.nextDouble();

            System.out.print("Enter score for physics: ");
            student.studentScores.phys = scan.nextDouble();

            System.out.print("Enter score for programming: ");
            student.studentScores.programming = scan.nextDouble();

            System.out.println();
        }

    }
    public static void PrintData(){
        for (Students student: studentscore) {
            student.PrintInfo();
        }
    }
}
