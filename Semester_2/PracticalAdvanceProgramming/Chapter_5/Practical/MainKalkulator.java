package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_5.Practical;

class Kalkulator {

    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    public int kali(int a, int b) {
        return a * b;
    }

    public double bagi(int a, int b) {
        if (b == 0) {
            System.out.println("Tidak bisa dibagi nol!");
            return 0;
        }
        return (double) a / b;
    }

    public void Sederhana(int pembilang, int penyebut) {
        int fpb = cariFPB(pembilang, penyebut);
        pembilang /= fpb;
        penyebut /= fpb;

        System.out.println("Hasil sederhana: " + pembilang + "/" + penyebut);
    }

    private int cariFPB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

public class MainKalkulator {
    public static void main(String[] args) {

        System.out.println("Penjumlahan: " + Kalkulator.tambah(10, 5));
        System.out.println("Pengurangan: " + Kalkulator.kurang(10, 5));


        Kalkulator k = new Kalkulator();

        System.out.println("Perkalian: " + k.kali(10, 5));
        System.out.println("Pembagian: " + k.bagi(10, 5));

        k.Sederhana(8, 12);
    }
}
