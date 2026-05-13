package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_7.Practical;

class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga() {
        return harga * jumlah * 2;
    }

    public double getJumlah() {
        return jumlah;
    }

    @Override
    public String toString() {
        return "KueJadi -> " + super.toString() + ", Jumlah: " + jumlah;
    }
}