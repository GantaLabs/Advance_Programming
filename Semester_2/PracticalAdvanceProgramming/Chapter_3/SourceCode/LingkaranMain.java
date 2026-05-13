package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_3.SourceCode;

public class LingkaranMain {
    public static void main(String[] args) {
        lingkaran l = new lingkaran(3);
        l.setTinggi(10);
        l.displayMessage();
        lingkaran l2 = new lingkaran(4, 10);
        l2.displayMessage();

        lingkaran Lstring = new lingkaran("67", "2");
        Lstring.displayMessage();
    }
}