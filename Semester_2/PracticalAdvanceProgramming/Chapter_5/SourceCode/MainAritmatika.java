package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_5.SourceCode;

import java.util.Scanner;

public class MainAritmatika {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan nilai 1 : ");
        int nil1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int nil2 = in.nextInt();

        // memanggil method static
        Aritmatika.hitungPengurangan(nil1, nil2);

        System.out.print("masukkan nilai 1 : ");
        nil1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        nil2 = in.nextInt();

        // memanggil method static
        Aritmatika.hitungPerkalian(nil1, nil2);

        System.out.print("masukkan nilai 1 : ");
        int value1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int value2 = in.nextInt();

        // memanggil method NON-static harus melalui objek
        Aritmatika a = new Aritmatika();
        a.hitungPenjumlahan(value1, value2);

        // Pembagian dengan parameter String
        System.out.print("masukkan nilai 1 : ");
        String s1 = in.nextLine();
        System.out.print("masukkan nilai 2 : ");
        String s2 = in.nextLine();
        Aritmatika b = new Aritmatika();
        System.out.println("Hasil pembagian s1 dan s2 adalah : "+b.hitungPembagian(s1, s2));

        in.close();
    }
}