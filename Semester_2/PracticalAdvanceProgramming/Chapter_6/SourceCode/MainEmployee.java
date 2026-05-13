        package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_6.SourceCode;

public class MainEmployee {
    public static void main(String[] args) {
        Manager boss = new Manager("Steven", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        Employee staff = new Employee("Donni", 50000, 1989, 10, 1);
        System.out.println("nama boss : "+boss.getName()+", salary = "+boss.getSalary());
        System.out.println("nama staff : "+staff.getName()+", salary = "+staff.getSalary());
        Employee gt = new Employee("Ganta");
        System.out.println("nama gt : "+gt.getName()+", salary = "+gt.getSalary());
    }
}