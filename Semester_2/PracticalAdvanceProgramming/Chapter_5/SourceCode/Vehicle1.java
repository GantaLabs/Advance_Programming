package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_5.SourceCode;

public class Vehicle1 {

    private double load;
    private final double maxLoad = 10000;

    // public Vehicle1(double max) {
    //     this.maxLoad = max;
    // }

    public double getLoad() {
        return this.load;
    }

    public double getMaxLoad() {
        return this.maxLoad;
    }

    public boolean addBox(double weight) {
        double temp = this.load + weight;

        if (temp <= maxLoad) {
            this.load = temp;
            return true;
        } else {
            return false;
        }
    }
}
