package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_1.SourceCode;

public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    private double sekon;
    private double kecepatanSekon;

    public void setNoPlat(String s){
        noPlat = s;
    }
    public void setWarna(String s){
        warna = s;
    }
    public void setManufaktur(String s){
        manufaktur = s;
    }
    public void setKecepatan(int i){
        kecepatan = i;
    }

    public double setWaktu(double i){
        this.waktu = i;
        return waktu;
    }

    public double rubahSekon(){
        sekon = waktu * 3600;
        return sekon;
    }

    public double rubahKecepatan(){
        kecepatanSekon = kecepatan / 3600.0;
        return kecepatanSekon;
    }

    public double hitungJarak(){
        double jarakMeter = kecepatan * 1000 * waktu; 
        double jarakKm = jarakMeter / 1000; 
        return jarakKm;
    }

    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek "+manufaktur);
        System.out.println("mempunyai nomor plat "+noPlat);
        System.out.println("serta memililki warna "+warna);
        System.out.println("dan mampu menempuh kecepatan "+kecepatan);
        System.out.println("dalam waktu "+waktu+" jam");
        System.out.println("atau "+rubahSekon()+" detik");
        System.out.printf("kecepatan per detik: %.2f km/s%n", rubahKecepatan());
        System.out.printf("jarak yang ditempuh: %.2f km%n", hitungJarak());
        System.out.printf("jarak yang ditempuh: %.2f m%n", hitungJarak() * 1000);
    }
}