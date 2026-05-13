package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_04;

class Rekening {
    protected String nomorRekening;
    protected double saldo;


    public Rekening(String nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }


    public void tampilSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}

