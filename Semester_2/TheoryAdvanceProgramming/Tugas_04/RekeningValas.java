package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_04;

class RekeningValas extends Rekening implements TransferGlobal {


    public RekeningValas(String nomorRekening, double saldo) {
        super(nomorRekening, saldo);
    }


    @Override
    public void prosesTransaksi(double jumlah) {
        if (ProtokolKeamanan.validasi()) {
            saldo -= jumlah;
            System.out.println("Transaksi berhasil: -" + jumlah);
        }
    }


    @Override
    public void validasiOTP() {
        System.out.println("OTP berhasil divalidasi");
    }


    @Override
    public void konversiMataUang(double kurs) {
        double hasil = saldo * kurs;
        System.out.println("Saldo setelah konversi: " + hasil);
    }


    @Override
    public void kirimKeLuarNegeri(String negaraTujuan) {
        System.out.println("Transfer ke: " + negaraTujuan);
    }
}

