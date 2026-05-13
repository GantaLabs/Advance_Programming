package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_5.Practical;

class Jaket {

    public static final int HARGA_A = 100000;
    public static final int HARGA_B = 125000;
    public static final int HARGA_C = 175000;

    public int hitungHargaA(int jumlah) {
        if (jumlah > 100) {
            return jumlah * 95000;
        }
        return jumlah * HARGA_A;
    }

    public int hitungHargaB(int jumlah) {
        if (jumlah > 100) {
            return jumlah * 120000;
        }
        return jumlah * HARGA_B;
    }

    public int hitungHargaC(int jumlah) {
        if (jumlah > 100) {
            return jumlah * 160000;
        }
        return jumlah * HARGA_C;
    }
}

public class MainJaket {
    public static void main(String[] args) {

        Jaket j = new Jaket();

        int jumlahA = 120;
        int jumlahB = 80;
        int jumlahC = 150;

        System.out.println("Jumlah Jaket A: " + jumlahA);
        System.out.println("Jumlah Jaket B: " + jumlahB);
        System.out.println("Jumlah Jaket C : " + jumlahC);
        System.out.println();

        int totalA = j.hitungHargaA(jumlahA);
        int totalB = j.hitungHargaB(jumlahB);
        int totalC = j.hitungHargaC(jumlahC);

        int totalSemua = totalA + totalB + totalC;

        System.out.println("Total Jaket A: Rp " + totalA);
        System.out.println("Total Jaket B: Rp " + totalB);
        System.out.println("Total Jaket C: Rp " + totalC);
        System.out.println("Total Semua: Rp " + totalSemua);
    }
}
