package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_7.Practical;

abstract class Kue {
    protected String nama;
    protected double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungHarga();

    @Override
    public String toString() {
        return "Nama: " + nama + ", Harga: " + harga;
    }
}