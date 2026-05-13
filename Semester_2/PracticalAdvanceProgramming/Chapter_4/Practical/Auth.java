package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_4.Practical;

import java.util.Scanner;

public class Auth {

    private Pelanggan[] daftarPelanggan;
    private Scanner input;

    public Auth(Pelanggan[] daftarPelanggan, Scanner input) {
        this.daftarPelanggan = daftarPelanggan;
        this.input = input;
    }

    public int prosesLogin() {
        System.out.print("Masukkan Nomor Pelanggan: ");
        String nomor = input.next();

        int index = cariIndex(nomor);

        if (index == -1) {
            System.out.println("Nomor pelanggan tidak ditemukan.");
            return -1;
        }

        Pelanggan p = daftarPelanggan[index];

        if (p.isDiblokir()) {
            System.out.println("Akun sudah diblokir dan tidak bisa digunakan.");
            return -1;
        }

        System.out.print("Masukkan PIN: ");
        int pin = input.nextInt();

        if (pin == p.getPin()) {
            p.resetSalahLogin();
            System.out.println("Login berhasil. Selamat datang " + p.getNama() + ".");
            return index;
        }

        p.tambahSalahLogin();
        System.out.println("PIN salah.");

        if (p.getSalahLogin() >= 3) {
            p.setDiblokir(true);
            System.out.println("Akun Anda diblokir karena salah PIN 3 kali.");
            return -1;
        }

        return -1;
    }

    public int cariIndex(String nomor) {
        for (int i = 0; i < daftarPelanggan.length; i++) {
            if (daftarPelanggan[i] != null) {
                if (daftarPelanggan[i].getNomorPelanggan().equals(nomor)) {
                    return i;
                }
            }
        }
        return -1;
    }
}

