package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_4.SourceCode;

public class Vehicle1 {
public double load, maxLoad; 

    public Vehicle1(double max) { 
        this.maxLoad = max; 
    } // [cite: 125]

    public double getLoad() { 
        return this.load; 
    } 

    public double getMaxLoad() {    
        return this.maxLoad; 
    } 

    public boolean addBox(double weight) {
        double temp = 0.0D; 
        temp = this.load + weight; 
        
        if (temp <= maxLoad) { 
            this.load = this.load + weight; 
            return true; 
        } else { 
            return false; 
        } 
    } 
}
