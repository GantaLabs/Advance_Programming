package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_01;

class BujurSangkar extends BidangDuaDimensi {
    private double sisi;

    public BujurSangkar(String nama, double sisi) {
        super(nama);
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }
}
