package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_04;

public class Main {
    public static void main(String[] args) {
        RekeningValas rekening = new RekeningValas("12345", 1000000);


        rekening.validasiOTP();
        rekening.prosesTransaksi(200000);
        rekening.konversiMataUang(0.000065);
        rekening.kirimKeLuarNegeri("Jepang");
        rekening.tampilSaldo();

        System.out.println("------------------------------");
    }
}
