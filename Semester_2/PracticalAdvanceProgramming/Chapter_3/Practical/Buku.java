package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_3.Practical;

public class Buku {

    private String kategori;
    private String namaBuku;
    private int tahunTerbit;
    private int jumlahHalaman;
    private String[] daftarNamaPenulis;
    private int jumlahPenulis;
    private int idx = 0;
    private String sinopsis;

    public Buku() {

    }

    public Buku(String kategori, String namaBuku, int tahunTerbit, int jumlahHalaman, int jumlahPenulis, String sinopsis) {
        this.kategori = kategori;
        this.namaBuku = namaBuku;
        this.tahunTerbit = tahunTerbit;
        this.jumlahHalaman = jumlahHalaman;
        this.jumlahPenulis = jumlahPenulis;
        this.sinopsis = sinopsis;

        this.daftarNamaPenulis = new String[jumlahPenulis];
        this.idx = 0;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setJumlahPenulis(int jumlahPenulis) {
        this.jumlahPenulis = jumlahPenulis;
        this.daftarNamaPenulis = new String[this.jumlahPenulis];
        this.idx = 0;
    }

    void tambahPenulis(String namaPenulis) {
        if (idx == jumlahPenulis) {
            System.out.println("Gagal Menambahkan Penulis; Slot Penulis sudah Penuh!");
        } else {
            daftarNamaPenulis[idx] = namaPenulis;
            idx++;
        }
    }

    public int hitungJumlahKataSinopsis() {
        if (sinopsis == null || sinopsis.isEmpty()) {
            return 0;
        }

        String[] kata = sinopsis.split(" ");
        return kata.length;
    }

    public int cekKesamaan(Buku bukuLain) {

        int sama = 0;
        int total = 6;

        if (this.kategori.equals(bukuLain.kategori)) sama++;
        if (this.namaBuku.equals(bukuLain.namaBuku)) sama++;
        if (this.tahunTerbit == bukuLain.tahunTerbit) sama++;
        if (this.jumlahHalaman == bukuLain.jumlahHalaman) sama++;
        if (this.jumlahPenulis == bukuLain.jumlahPenulis) sama++;

        if (this.sinopsis != null && bukuLain.sinopsis != null) {
            if (this.sinopsis.equals(bukuLain.sinopsis)) sama++;
        }

        return (sama * 100) / total;
    }

    public Buku copy() {

        Buku bukuBaru = new Buku();

        bukuBaru.kategori = this.kategori;
        bukuBaru.namaBuku = this.namaBuku;
        bukuBaru.tahunTerbit = this.tahunTerbit;
        bukuBaru.jumlahHalaman = this.jumlahHalaman;
        bukuBaru.jumlahPenulis = this.jumlahPenulis;
        bukuBaru.sinopsis = this.sinopsis;

        bukuBaru.daftarNamaPenulis = new String[this.jumlahPenulis];

        for (int i = 0; i < this.jumlahPenulis; i++) {
            bukuBaru.daftarNamaPenulis[i] = this.daftarNamaPenulis[i];
        }

        bukuBaru.idx = this.idx;

        return bukuBaru;
    }

    void infoBuku() {

        System.out.printf("""
                ======   %s   =====
                Kategori        : %s
                Tebal           : %d halaman
                Tahun Terbit    : %d
                Sinopsis        : %s
                Nama Penulis    : """,
                namaBuku, kategori, jumlahHalaman, tahunTerbit, sinopsis);

        for (int i = 0; i < jumlahPenulis; i++) {
            if (daftarNamaPenulis[i] == null) continue;

            if (i != 0) {
                System.out.println("                  - " + daftarNamaPenulis[i]);
                continue;
            }

            System.out.println(" - " + daftarNamaPenulis[i]);
        }
    }

    // Royalti 

    public double hitungRoyalti(double hargaBuku) {
        int jumlahTerjual = 100; // asumsi
        double totalPenjualan = hargaBuku * jumlahTerjual;
        double royalti = 0.10 * totalPenjualan;
        return royalti;
    }

    public double hitungRoyalti(double hargaBuku, double persen) {
        int jumlahTerjual = 100; // asumsi
        double totalPenjualan = hargaBuku * jumlahTerjual;
        double royalti = (persen / 100) * totalPenjualan;
        return royalti;
    }
}
