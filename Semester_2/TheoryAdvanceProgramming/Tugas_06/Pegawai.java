package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_06;

public class Pegawai {
    private String nip;
    private String nama;
    private String tglLahir;


    public Pegawai(String nip, String nama, String tglLahir) {
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = tglLahir;
    }


    public String getNip() {
        return nip;
   
    }
    public String getNama() {
        return nama;
    }


    public String getTglLahir() {
        return tglLahir;
    }


    public String toFileString() {
        return nip + "|" + nama + "|" + tglLahir;
    }


    public static Pegawai fromString(String data) {
        String[] d = data.split("\\|");
        return new Pegawai(d[0], d[1], d[2]);
    }
}

