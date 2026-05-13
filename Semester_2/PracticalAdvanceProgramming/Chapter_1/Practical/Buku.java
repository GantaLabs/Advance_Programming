package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_1.Practical;


public class Buku {
    private String kategori;
    private String namaBuku;
    private int tahunTerbit;
    private int jumlahHalaman;
    private String[] daftarNamaPenulis;
    private int jumlahPenulis;
    private int idx = 0;


    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    // ketika jumlah penulis di-set, kita alokasikan array daftarNamaPenulis
    public void setJumlahPenulis(int jumlahPenulis) {
        this.jumlahPenulis = jumlahPenulis;
        this.daftarNamaPenulis = new String[this.jumlahPenulis];
        this.idx = 0;
    }

    // menambahkan penulis (sama seperti sebelumnya)
    void tambahPenulis (String namaPenulis) {
        if (idx == jumlahPenulis) {
            System.out.println("Gagal Menambahkan Penulis; Slot Penulis sudah Penuh!");
        } else {
            daftarNamaPenulis[idx] = namaPenulis;
            idx++;
        }
    }

    void infoBuku () {
        System.out.printf("""
                ======   %s   =====
                Kategori        : %s
                Tebal           : %d halaman
                Tahun Terbit    : %d
                Nama Penulis    : """,
                namaBuku, kategori, jumlahHalaman, tahunTerbit);

        for (int i = 0; i < jumlahPenulis; i++) {
            if (daftarNamaPenulis[i] == null) continue;
            if (i != 0) {
                System.out.println("                  - " + daftarNamaPenulis[i]);
                continue;
            }
            System.out.println(" - " + daftarNamaPenulis[i]);
        }
    }
}
