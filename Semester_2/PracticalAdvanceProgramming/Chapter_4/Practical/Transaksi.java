package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_4.Practical;

import java.util.Scanner;

public class Transaksi {

    private Pelanggan[] daftarPelanggan;
    private Scanner input;

    public Transaksi(Pelanggan[] daftarPelanggan, Scanner input) {
        this.daftarPelanggan = daftarPelanggan;
        this.input = input;
    }

    public void prosesPembelian(int index) {
        Pelanggan p = daftarPelanggan[index];

        System.out.print("Masukkan nominal pembelian: ");
        double nominal = input.nextDouble();

        if (nominal <= 0) {
            System.out.println("Nominal tidak valid.");
            return;
        }

        double saldoSetelah = p.getSaldo() - nominal;

        if (saldoSetelah < 10000) {
            System.out.println("Transaksi gagal karena saldo pasca transaksi kurang dari 10000.");
            return;
        }

        double cashback = hitungCashback(p.getNomorPelanggan(), nominal);

        p.setSaldo(saldoSetelah + cashback);

        System.out.println("Transaksi berhasil.");
        System.out.println("Cashback: " + cashback);
        System.out.println("Saldo saat ini: " + p.getSaldo());
    }

    public void prosesTopUp(int index) {
        Pelanggan p = daftarPelanggan[index];

        System.out.print("Masukkan nominal top up: ");
        double nominal = input.nextDouble();

        if (nominal <= 0) {
            System.out.println("Top up tidak valid.");
            return;
        }

        p.setSaldo(p.getSaldo() + nominal);

        System.out.println("Top up berhasil.");
        System.out.println("Saldo terbaru: " + p.getSaldo());
    }

    private double hitungCashback(String nomor, double pembelian) {
        if (pembelian <= 1000000) {
            return 0;
        }

        String prefix = nomor.substring(0, 2);

        switch (prefix) {
            case "38":
                return pembelian * 0.05;

            case "56":
                return pembelian * 0.07 + pembelian * 0.02;

            case "74":
                return pembelian * 0.10 + pembelian * 0.05;

            default:
                return 0;
        }
    }
}

