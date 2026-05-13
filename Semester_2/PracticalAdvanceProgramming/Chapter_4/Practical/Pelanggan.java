package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_4.Practical;

public class Pelanggan {

    private String nomorPelanggan;
    private String nama;
    private int pin;
    private double saldo;
    private boolean diblokir;
    private int salahLogin;

    public Pelanggan() {
        this.diblokir = false;
        this.salahLogin = 0;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public void setNomorPelanggan(String nomorPelanggan) {
        this.nomorPelanggan = nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isDiblokir() {
        return diblokir;
    }

    public void setDiblokir(boolean diblokir) {
        this.diblokir = diblokir;
    }

    public int getSalahLogin() {
        return salahLogin;
    }

    public void tambahSalahLogin() {
        this.salahLogin++;
    }

    public void resetSalahLogin() {
        this.salahLogin = 0;
    }
}
