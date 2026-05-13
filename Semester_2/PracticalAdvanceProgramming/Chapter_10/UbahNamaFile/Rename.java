package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_10.UbahNamaFile;

import java.io.File;

public class Rename {

    public static void main(String[] args) {

        var file = new File("D:\\Universitas Brawijaya_Roganda\\BELAJAR_MANDIRI\\Code\\Semester_2\\Advance_Programming\\Semester_2\\PracticalAdvanceProgramming\\Chapter_10\\test.txt");
        var fileBaru = new File("D:\\Universitas Brawijaya_Roganda\\BELAJAR_MANDIRI\\Code\\Semester_2\\Advance_Programming\\Semester_2\\PracticalAdvanceProgramming\\Chapter_10\\test-baru.txt");

        if (file.exists() && !fileBaru.exists()) {

            var result = file.renameTo(fileBaru);

            System.out.println(
                (result ? "Berhasil" : "Gagal")
                + " mengubah nama file"
            );

        } else {

            System.out.println(
                "File tidak ada atau file dengan nama yang baru sudah ada"
            );
        }
    }
}