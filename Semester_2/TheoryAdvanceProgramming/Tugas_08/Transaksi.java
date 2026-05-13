package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_08;
public class Transaksi {
    private String kode;
    private String nis;
    private String kodeBuku;
    private String tglPinjam;
    private String tglKembali;
    private int status;

    public Transaksi(String kode, String nis, String kodeBuku,
                    String tglPinjam, String tglKembali, int status) {
        this.kode = kode;
        this.nis = nis;
        this.kodeBuku = kodeBuku;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
        this.status = status;
    }

    public String getKode() { return kode; }
    public String getNis() { return nis; }
    public String getKodeBuku() { return kodeBuku; }
    public String getTglPinjam() { return tglPinjam; }
    public String getTglKembali() { return tglKembali; }
    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }
    public void setTglKembali(String tgl) { this.tglKembali = tgl; }

    public String toFileString() {
        return kode + "|" + nis + "|" + kodeBuku + "|" + tglPinjam + "|" + tglKembali + "|" + status;
    }

    public static Transaksi fromString(String data) {
        String[] d = data.split("\\|");
        return new Transaksi(d[0], d[1], d[2], d[3], d[4], Integer.parseInt(d[5]));
    }
}