public class Students {
    public String Firstname;
    public String Lastname;
    public int number;

    Scores studentScores = new Scores();

    public Students() {
        this.Firstname = "Some";
        this.Lastname = "Student";
        this.number = 0;
    }

    public Students(String name, String Lastname, int number) {
        this.Firstname = name;
        this.Lastname = Lastname;
        this.number = number;
    }

    public void PrintInfo(){
        System.out.println("=================================================");
        System.out.println("Info:");
        System.out.println("Name: " + this.Firstname);
        System.out.println("Last Name: " + this.Lastname);
        System.out.println("Number: " + this.number);
        System.out.println();

        System.out.println("Scores:");
        System.out.println("Math: " + studentScores.math);
        System.out.println("Physics: " + studentScores.phys);
        System.out.println("Programming " + studentScores.programming);
        System.out.println();

        System.out.println("Score average: " + studentScores.Average());
    }
}
