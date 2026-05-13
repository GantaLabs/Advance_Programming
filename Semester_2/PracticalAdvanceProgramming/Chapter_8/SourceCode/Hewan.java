package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_8.SourceCode;

public class Hewan implements MakhlukHidup, Identitas {

    @Override
    public void makan() {
        System.out.println("Makan pakai tangan dan mulut");
    }

    @Override
    public void berjalan() {
        System.out.println("Jalan pakai 4 kaki");
    }

    @Override
    public void bersuara() {
        System.out.println("Suaranya nggak jelas");
    }

    @Override
    public void tampilkanNama() {
    }

    @Override
    public void tampilkanUmur() {
    }
}