package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_8.SourceCode;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();

        Manusia O1 = new Manusia(nama, umur);
        O1.tampilkanNama();
        O1.tampilkanUmur();
        O1.makan();

        Hewan H1 = new Hewan();
        H1.bersuara();
        H1.berjalan();
        H1.makan();
    }
}
