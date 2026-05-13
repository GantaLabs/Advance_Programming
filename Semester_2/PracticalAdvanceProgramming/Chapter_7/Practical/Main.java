package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_7.Practical;

public class Main {
    public static void main(String[] args) {

        Kue[] kueArray = new Kue[20];

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                kueArray[i] = new KuePesanan("KuePesanan" + i, 10000, i + 1);
            } else {
                kueArray[i] = new KueJadi("KueJadi" + i, 5000, i + 2);
            }
        }

        double totalHarga = 0;
        double totalHargaPesanan = 0;
        double totalBerat = 0;
        double totalHargaJadi = 0;
        double totalJumlah = 0;

        Kue kueTermahal = kueArray[0];

        System.out.println("===== DAFTAR KUE =====");
        int no = 1;

        for (Kue k : kueArray) {
            System.out.printf("%2d. %-12s | Harga: %,10.2f | Harga Akhir: %,10.2f\n",
                    no++,
                    k.getClass().getSimpleName(),
                    k.harga,
                    k.hitungHarga());

            totalHarga += k.hitungHarga();

            if (k instanceof KuePesanan) {
                KuePesanan kp = (KuePesanan) k;
                totalHargaPesanan += kp.hitungHarga();
                totalBerat += kp.getBerat();
            } else if (k instanceof KueJadi) {
                KueJadi kj = (KueJadi) k;
                totalHargaJadi += kj.hitungHarga();
                totalJumlah += kj.getJumlah();
            }

            if (k.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = k;
            }
        }

        System.out.println("\n===== RINGKASAN =====");
        System.out.printf("Total Harga Semua Kue   : %,10.2f\n", totalHarga);

        System.out.printf("\n[KuePesanan]\n");
        System.out.printf("Total Harga            : %,10.2f\n", totalHargaPesanan);
        System.out.printf("Total Berat            : %,10.2f\n", totalBerat);

        System.out.printf("\n[KueJadi]\n");
        System.out.printf("Total Harga            : %,10.2f\n", totalHargaJadi);
        System.out.printf("Total Jumlah           : %,10.2f\n", totalJumlah);

        System.out.println("\n===== KUE TERMAHAL =====");
        System.out.println(kueTermahal);
        System.out.printf("Harga Akhir            : %,10.2f\n", kueTermahal.hitungHarga());
    }
}