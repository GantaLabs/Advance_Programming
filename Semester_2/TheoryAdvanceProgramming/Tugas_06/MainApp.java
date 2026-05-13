package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_06;

import java.util.*;

public class MainApp {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        PegawaiService pegawaiService = new PegawaiService();


        System.out.print("Login NIP: ");
        String nip = input.nextLine();


        if (!pegawaiService.login(nip)) {
            System.out.println("Login gagal!");
            return;
        }


        SiswaService siswaService = new SiswaService();
        // BukuService bukuService = new BukuService();
        TransaksiService transaksiService = new TransaksiService();


        int pilih;
        do {
            System.out.println("\n1. Tambah Siswa");
            System.out.println("2. Lihat Siswa");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembali Buku");
            System.out.println("0. Exit");


            pilih = input.nextInt();
            input.nextLine();


            switch (pilih) {
                case 1:
                    System.out.print("NIS: ");
                    String nis = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = input.nextLine();


                    siswaService.tambah(new Siswa(nis, nama, alamat));
                    break;


                case 2:
                    for (Siswa s : siswaService.getAll()) {
                        System.out.println(s.toFileString());
                    }
                    break;


                case 3:
                    System.out.print("Kode: ");
                    String kode = input.nextLine();
                    System.out.print("NIS: ");
                    String nisPinjam = input.nextLine();
                    System.out.print("Kode Buku: ");
                    String kodeBuku = input.nextLine();


                    if (transaksiService.countPinjamanAktif(nisPinjam) >= 2) {
                        System.out.println("Maksimal 2 buku!");
                        break;
                    }


                    transaksiService.pinjam(
                        new Transaksi(kode, nisPinjam, kodeBuku,
                        "2026-04-18", "null", 0)
                    );
                    break;


                case 4:
                    System.out.print("Kode Transaksi: ");
                    String kodeKembali = input.nextLine();


                    transaksiService.kembali(kodeKembali, "2026-04-18");
                    break;
            }


        } while (pilih != 0);
    }
}
