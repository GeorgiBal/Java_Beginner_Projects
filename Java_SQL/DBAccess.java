package my_project;

import java.sql.*;

public class DBAccess {
    static final String DB_URL = "jdbc:mysql://localhost/students";
    static final String USER = "root";
    static final String PASS = "12345678";

    public static void executeQuery(String QUERY) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            ResultSet res_set = statement.executeQuery(QUERY);
            while (res_set.next()) {
                System.out.println("Course number: " + res_set.getInt("course_number"));
                System.out.println("First name: " + res_set.getString("first_name"));
                System.out.println("Last name: " + res_set.getString("last_name"));
                double maths_grade = res_set.getInt("maths_grade");
                double physics_grade = res_set.getInt("physics_grade");
                double biology_grade = res_set.getInt("biology_grade");
                double avg = (maths_grade + physics_grade + biology_grade)/3;
                System.out.println("Average grade: " + avg);
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
