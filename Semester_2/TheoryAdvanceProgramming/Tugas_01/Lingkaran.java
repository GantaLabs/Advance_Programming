package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_01;

class Lingkaran extends BidangDuaDimensi {
    private double radius;

    public Lingkaran(String nama, double radius) {
        super(nama);
        this.radius = radius;
    }

    @Override
    public double luas() {
        return Math.PI * radius * radius;
    }
}
