package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_6.Practical;

import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah,
                   double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    public double getGaji() {
        return super.getGaji() + (0.10 * super.getGaji());
    }

    public String toString() {
        return super.toString() +
                "\nDepartemen: " + departemen;
    }
}
