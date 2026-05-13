package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_10.Tugas;

import java.io.File;

public class cekUkuranFile {
    public static void main(String[] args) {
        var file = new File("MenulisFile/test.txt");

        if (file.exists()) {
            long b = file.length();

            double kb =  (double) b/1024;
            double mb = kb/1024;

            if (mb < 1) {
                System.out.printf("Ukuran file: %f KB\n", kb);
            } else {
                System.out.printf("Ukuran file: %.1f MB\n", mb);
            }
        } else {
            System.out.println("File tidak ditemukan!");
        }
    }
}
