public class Scores {
    public double math;
    public double phys;
    public double programming;

    public Scores() {
        this.math = 0;
        this.phys = 0;
        this.programming = 0;
    }

    public Scores(double math, double phys, double programming) {
        this.math = math;
        this.phys = phys;
        this.programming = programming;
    }

    public double Average(){
        double average = (this.math + this.phys + this.programming)/3;
        return average;
    }
}
