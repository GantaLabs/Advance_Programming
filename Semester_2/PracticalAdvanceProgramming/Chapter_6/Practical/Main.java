package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_6.Practical;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println(new Manusia("Budi", true, "111", true));
        System.out.println();
        System.out.println(new Manusia("Siti", false, "222", true));
        System.out.println();
        System.out.println(new Manusia("Alex", true, "333", false));

        System.out.println("================================");

        System.out.println(new MahasiswaFILKOM("Ani", false, "444", false,
                "165150612345678", 2.9));
        System.out.println();
        System.out.println(new MahasiswaFILKOM("Budi", true, "555", false,
                "165150412345678", 3.2));
        System.out.println();
        System.out.println(new MahasiswaFILKOM("Caca", false, "666", false,
                "165150712345678", 3.8));

        System.out.println("================================");

        System.out.println(new Pekerja("Doni", true, "777", true,
                3000, LocalDate.now().minusYears(2), 2));
        System.out.println();
        System.out.println(new Pekerja("Eka", false, "888", true,
                4000, LocalDate.now().minusYears(9), 0));
        System.out.println();
        System.out.println(new Pekerja("Fajar", true, "999", true,
                5000, LocalDate.now().minusYears(20), 10));

        System.out.println("================================");


        System.out.println(new Manager("Gilang", true, "1010", true,
                7500, LocalDate.now().minusYears(15), 3, "IT"));
    }
}
