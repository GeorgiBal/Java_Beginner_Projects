package STUDENT_GROUP;

class Students {

    //СЪЗДАВАМЕ ПОЛЕТАТА НА ОБЕКТА НИ
    private int number;
    private String name;
    private String family;
    private double avgscore;

    //<editor-fold desc="CONSTRUCTORS">

    // DEFAULT CONSTRUCTOR
    public Students() {

    }

    // CONSTRUCTOR WITH PARAMETERS
    public Students(int number, String name, String family, double avgscore) {
        this.number = number;
        this.name = name;
        this.family = family;
        this.avgscore = avgscore;
    }
    //</editor-fold>



    //<editor-fold desc="GET and SET">
    // GET-SET ------------------------------------------------------------------- BEGIN

    public int getNumber () {
        return number;
    }

    public void setNumber ( int number){
        this.number = number;
    }

    public String getName () {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getFamily () {
        return family;
    }

    public void setFamily (String family){
        this.family = family;
    }

    public double getAvgscore () {
        return avgscore;
    }

    public void setAvgscore ( double avgscore){ this.avgscore = avgscore;}


// GET-SET ------------------------------------------------------------------------- END
    //</editor-fold>


}
