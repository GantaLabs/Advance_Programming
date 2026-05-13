package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_10.Tugas;

import java.io.File;

public class BacaNama {
    public static void main(String[] args) {
        var dir = new File("Semester_2\\Advance_Programming\\Semester_2\\PracticalAdvanceProgramming\\Chapter_10");

        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();

            if (files != null && files.length > 0) {
                System.out.println("Daftar nama file dan folder yang ada di dalam direktori:");
                for (File file: files) {
                    System.out.println("- " + file.getName());
                }
            } else {
                System.out.println("Direktori ini kosong!");
            }
        } else {
            System.out.println("Path tidak ditemukan atau bukan sebuak direktori!");
        }
    }
}
