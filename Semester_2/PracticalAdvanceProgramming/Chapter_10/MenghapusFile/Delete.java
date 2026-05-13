package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_10.MenghapusFile;

import java.io.File;

public class Delete {

    public static void main(String[] args) {

        var file = new File("D:\\\\Universitas Brawijaya_Roganda\\\\BELAJAR_MANDIRI\\\\Code\\\\Semester_2\\\\Advance_Programming\\\\Semester_2\\\\PracticalAdvanceProgramming\\\\Chapter_10\\\\test-baru.txt");

        if (file.exists()) {

            var result = file.delete();

            System.out.println(
                (result ? "Berhasil" : "Gagal")
                + " menghapus file"
            );

        } else {

            System.out.println("File tidak ada");
        }
    }
}