package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_7.SourceCode;

public abstract class Employee {

    private String name;
    private String noKTP;

    private int bulanLahir;
    
    public int getTanggalLahir(){
        return  bulanLahir;
    }

    public void setTanggalLahir(int i){
        bulanLahir = i;
    }

    public Employee(String name, String noKTP) {
        this.name = name;
        this.noKTP = noKTP;
    }

    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String toString() {
        return String.format(
            " " + getName() +
            "\nNo. KTP :" + getNoKTP()
        );
    }

    public abstract double earnings();

}
