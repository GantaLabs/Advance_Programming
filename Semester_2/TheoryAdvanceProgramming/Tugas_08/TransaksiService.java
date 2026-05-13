package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_08;
import java.io.*;
import java.util.*;

public class TransaksiService {
    private final String file = "Semester_2\\Advance_Programming\\Semester_2\\TheoryAdvanceProgramming\\Tugas_08\\transaksi.txt";

    public List<Transaksi> getAll() {
        List<Transaksi> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(Transaksi.fromString(line));
            }
        } catch (Exception e) {}
        return list;
    }

    public int countPinjamanAktif(String nis) {
        int count = 0;
        for (Transaksi t : getAll()) {
            if (t.getNis().equals(nis) && t.getStatus() == 0) {
                count++;
            }
        }
        return count;
    }

    public void pinjam(Transaksi t) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(t.toFileString());
            bw.newLine();
        } catch (Exception e) {}
    }

    public void kembali(String kode, String tglKembali) {
        List<Transaksi> list = getAll();

        for (Transaksi t : list) {
            if (t.getKode().equals(kode)) {
                t.setStatus(1);
                t.setTglKembali(tglKembali);
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Transaksi t : list) {
                bw.write(t.toFileString());
                bw.newLine();
            }
        } catch (Exception e) {}
    }
}