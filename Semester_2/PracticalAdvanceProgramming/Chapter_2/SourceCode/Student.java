package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_2.SourceCode;

public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    // private double average;

    private static int studentCount = 0;
    
    public Student(){
        name = "";
        address = "";
        age = 0;
        studentCount++;

    }
    public Student(String n, String a, int ag){
        name = n;
        address = a;
        age = ag;
        studentCount++;
    }

    public Student(String n, String a, int ag, double math, double english, double science){
        name = n;
        address = a;
        age = ag;
        mathGrade = math; 
        englishGrade = english;
        scienceGrade = science;
        studentCount++;
    }

    public void setName(String n){
        name = n;
    }
    public void setAddress(String a){
        address = a;
    }
    public void setAge(int ag){
        age = ag;
    }
    public void setMath(int math){
        mathGrade = math;
    }
    public void setEnglish(int english){
        englishGrade = english;
    }
    public void setScience(int science){
        scienceGrade = science;
    }
    private double getAverage(){
        double result = 0;
        result = (mathGrade+scienceGrade+englishGrade)/3;
        return result;
    }

    public boolean isPassed(){
        boolean result = false;
        if(getAverage() >= 60){
            result = true;
        }
        return result;
    }

    public void displayMessage(){
        System.out.println("Siswa dengan nama "+name);
        System.out.println("beramalat di "+address);
        System.out.println("berumur "+age);
        System.out.println("mempunyai nilai rata rata "+getAverage());
        if (isPassed()){
            System.out.println("Siswa ini dinyatakan lulus");
        } else {
            System.out.println("Siswa ini dinyatakan tidak lulus");
        }
    }

    public static void jumlahObjek(){
        System.out.println("Jumlah objek Student yang dibuat: " + studentCount);
    }

}