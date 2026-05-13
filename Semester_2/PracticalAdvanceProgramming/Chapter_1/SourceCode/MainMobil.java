package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_1.SourceCode;

import java.util.Scanner;;
public class MainMobil {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    //instan objek bernama m1
    Mobil m1 = new Mobil();
    m1.setKecepatan(50);
    m1.setManufaktur("Toyota");
    m1.setNoPlat("AB 1231 UA");
    m1.setWarna("Merah");
    m1.displayMessage();
    System.out.println("================");
    //instan objek baru bernama m2
    Mobil m2 = new Mobil();
    m2.setKecepatan(100);
    m2.setManufaktur("Mitsubishi");
    m2.setNoPlat("N 1134 AG");
    m2.setWarna("Pink");
    m2.displayMessage();
    System.out.println("================");
    //merubah warna dari objek m1
    System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
    m1.setWarna("Hijau");
    //menampilkan hasil perubahan
    m1.displayMessage();

    Mobil m3 = new Mobil();
    System.out.println("================");
    System.out.print("Masukkan nomor plat mobil : ");
    m3.setNoPlat(input.nextLine());
    System.out.print("Masukkan warna mobil : ");
    m3.setWarna(input.nextLine());
    System.out.print("Masukkan manufaktur mobil : ");
    m3.setManufaktur(input.nextLine());
    System.out.print("Masukkan kecepatan mobil : ");
    m3.setKecepatan(input.nextInt());
    System.out.print("Masukkan waktu mobil (Dalam Jam) : ");
    m3.setWaktu(input.nextDouble());
    m3.displayMessage();
    }
}