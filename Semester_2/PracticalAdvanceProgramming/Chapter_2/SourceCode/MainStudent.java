package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_2.SourceCode;

import java.util.Scanner;
public class MainStudent {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    Student anna = new Student();
    anna.setName("Anna");
    anna.setAddress("Malang");
    anna.setAge(20);
    anna.setMath(100);
    anna.setScience(89);
    anna.setEnglish(80);
    anna.displayMessage();

    //menggunakan constructor lain
    System.out.println("===================");
    Student chris = new Student("Chris", "Kediri", 21);
    chris.setMath(70);
    chris.setScience(60);
    chris.setEnglish(90);
    chris.displayMessage();


    //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
    System.out.println("===================");
    anna = new Student("anna", "Batu", 18);
    anna.displayMessage();

    //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
    System.out.println("===================");
    chris.setAddress("Surabaya");
    chris.setAge(22);
    chris.displayMessage();
    System.out.println();

    //Contoh menggunakan constructor dengan parameter semua
    System.out.println("===================");
    Student david = new Student("David", "Malang", 19, 80, 90, 100);
    david.displayMessage();
    System.out.println("");

    System.out.print("Masukkan jumlah siswa: ");
    int jumlah = input.nextInt();
    input.nextLine();

    Student[] students = new Student[jumlah];

        for(int i = 0; i < jumlah; i++){
            System.out.println("Data siswa ke-" + (i+1));

            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("Alamat: ");
            String alamat = input.nextLine();

            System.out.print("Umur: ");
            int umur = input.nextInt();

            System.out.print("Nilai Math: ");
            double math = input.nextDouble();

            System.out.print("Nilai English: ");
            double english = input.nextDouble();

            System.out.print("Nilai Science: ");
            double science = input.nextDouble();
            input.nextLine();

            students[i] = new Student(nama, alamat, umur, math, english, science);
            System.out.println();
        }

    System.out.println("\n=== DATA SISWA ===");
        for(int i = 0; i < jumlah; i++){
            students[i].displayMessage();
            System.out.println("====================");
            System.out.println("");
        }

        System.out.println();
        Student.jumlahObjek();
    }
}