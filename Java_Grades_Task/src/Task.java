import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        HashMap<Integer, HashMap<String, ArrayList<Double>>> Students = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        double average = 0;
        while (true){
            System.out.print("Въведете курсов номер на ученика или 0 за да прекратите: ");
            int num_grades = 0;
            double total_grades = 0;
            int num = scan.nextInt();
            if (num == 0) {
                break;
            }

            HashMap<String, ArrayList<Double>> Subjects = new HashMap<>();

            while (true){
                System.out.print("Въведте предмет или СТОП за да прекратите: ");
                String subject = scan.next();
                if (subject.equals("СТОП")) {
                    break;
                }

                ArrayList<Double> grades = new ArrayList<>();

                while (true){
                    System.out.print("Въведте оценка или 0 за да прекратите: ");
                    double grade = scan.nextDouble();
                    if (grade == 0) {
                        break;
                    }else if (grade < 2 || grade > 6) {
                        System.out.println("Въведете валидна оценка (2 - 6) или 0 за да прекратите!!!");
                    }else {
                        grades.add(grade);
                        num_grades++;
                        total_grades += grade;
                    }
                }
                average = total_grades/num_grades;
                Subjects.put(subject, grades);
            }
            Students.put(num, Subjects);
            System.out.println("Student : " + num);
            Subjects.forEach((key, value) ->
                    {
                        System.out.println(key + " : " + value);
                    }
            );
            System.out.print("Average : ");
            System.out.format("%.2f", average);
            System.out.println();
        }

    }
}
