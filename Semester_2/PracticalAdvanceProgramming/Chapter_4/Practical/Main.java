package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_4.Practical;

//Import
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pelanggan[] daftarPelanggan = new Pelanggan[100];
        int jumlahPelanggan = 0;

        Auth auth = new Auth(daftarPelanggan, input);
        Transaksi transaksi = new Transaksi(daftarPelanggan, input);

        while (true) {

            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Daftar Akun Baru");
            System.out.println("2. Login");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();

            if (menu == 1) {

                Pelanggan p = new Pelanggan();

                input.nextLine(); 
                System.out.print("Masukkan nama pelanggan: ");
                p.setNama(input.nextLine());

                System.out.println("Pilih prefix rekening:");
                System.out.println("38 = Silver");
                System.out.println("56 = Gold");
                System.out.println("74 = Platinum");
                System.out.print("Masukkan prefix: ");
                String prefix = input.next();

                while (!(prefix.equals("38") || prefix.equals("56") || prefix.equals("74"))) {
                    System.out.print("Prefix tidak valid, masukkan ulang: ");
                    prefix = input.next();
                }

                String nomor = prefix + generateRandomNumber(8);
                p.setNomorPelanggan(nomor);

                System.out.print("Buat PIN (4 digit): ");
                int pin = input.nextInt();
                p.setPin(pin);

                p.setSaldo(10000);

                daftarPelanggan[jumlahPelanggan] = p;
                jumlahPelanggan++;

                System.out.println("Akun berhasil dibuat.");
                System.out.println("Nomor Pelanggan Anda: " + nomor);
                System.out.println("Saldo Awal: 10000");

            } else if (menu == 2) {

                int index = auth.prosesLogin();

                if (index != -1) {
                    menuSetelahLogin(index, input, transaksi, daftarPelanggan);
                }

            } else if (menu == 3) {

                System.out.println("Terima kasih telah menggunakan sistem.");
                break;

            } else {
                System.out.println("Menu tidak valid.");
            }
        }
    }

    private static void menuSetelahLogin(int index, Scanner input, Transaksi transaksi, Pelanggan[] daftar) {

        while (true) {
            System.out.println("\n=== Menu Transaksi ===");
            System.out.println("1. Pembelian");
            System.out.println("2. Top Up");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Logout");
            System.out.print("Pilih: ");
            int pilih = input.nextInt();

            if (pilih == 1) {
                transaksi.prosesPembelian(index);

            } else if (pilih == 2) {
                transaksi.prosesTopUp(index);

            } else if (pilih == 3) {
                System.out.println("Saldo Anda saat ini: " + daftar[index].getSaldo());

            } else if (pilih == 4) {
                System.out.println("Logout berhasil.");
                break;

            } else {
                System.out.println("Menu tidak valid.");
            }
        }
    }

    private static String generateRandomNumber(int digit) {
        String angka = "";
        for (int i = 0; i < digit; i++) {
            angka += (int) (Math.random() * 10);
        }
        return angka;
    }
}
