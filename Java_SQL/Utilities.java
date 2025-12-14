package my_project;

public class Utilities {
    public static void printData(){
        DBAccess.executeQuery("Select * from students;");
    }
}
