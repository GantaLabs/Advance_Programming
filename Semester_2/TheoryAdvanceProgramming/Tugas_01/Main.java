package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_01;

/**
 * Nama    : Roganda Tua Tampubolon
 * NIM     : 255150201111017
 * Kelas   : Pemrograman Lanjut - C
 */

public class Main {
    public static void main(String[] args) {

        BujurSangkar bujur = new BujurSangkar("Bujur Sangkar", 4);
        Lingkaran lingkaran = new Lingkaran("Lingkaran", 3);

        bujur.info();
        System.out.println("Luas: " + bujur.luas());
        System.out.println();

        lingkaran.info();
        System.out.printf("Luas: %.2f " , lingkaran.luas());
    }
}