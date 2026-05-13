package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_10.Tugas;

import java.io.File;

public class HapusDirektori {
    public static void main (String[] args) {
        var dir = new File("ListFile");

        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();

            if (files != null && files.length > 0) {
                for (File file: files) {
                    boolean isDeleted = file.delete();

                    if (isDeleted) {
                        System.out.println("Berhasil menghapus file: " + file.getName());
                    } else {
                        System.out.println("Gagal menghapus file: "+ file.getName());
                    }
                }
            }

            boolean isDeleted = dir.delete();

            if (isDeleted) {
                System.out.println("Berhasil menghapus direktori!");
            } else {
                System.out.println("Gagal menghapus direktori!");
            }
        } else {
            System.out.println("Path tidak ditemukan atau bukan sebuah direktori!");
        }
    }
}
