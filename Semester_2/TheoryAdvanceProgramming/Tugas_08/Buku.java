package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_08;

public class Buku {
    private String kode;
    private String judul;
    private String jenis;

    public Buku(String kode, String judul, String jenis) {
        this.kode = kode;
        this.judul = judul;
        this.jenis = jenis;
    }

    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }

    public String getJenis() {
        return jenis;
    }

    public String toFileString() {
        return kode + "|" + judul + "|" + jenis;
    }

    public static Buku fromString(String data) {
        String[] d = data.split("\\|");
        return new Buku(d[0], d[1], d[2]);
    }
}