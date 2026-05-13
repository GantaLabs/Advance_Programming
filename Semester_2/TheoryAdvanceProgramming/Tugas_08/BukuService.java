package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_08;

import java.io.*;
import java.util.*;


public class BukuService {
    private final String file = "Semester_2\\Advance_Programming\\Semester_2\\TheoryAdvanceProgramming\\Tugas_08\\buku.txt";

    public List<Buku> getAll() {
        List<Buku> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                list.add(Buku.fromString(line));
            }
        } catch (Exception e) {}
        return list;
    }

    public Buku findByKode(String kode) {
        for (Buku b : getAll()) {
            if (b.getKode().equals(kode)) return b;
        }
        return null;
    }

    public void tambah(Buku b) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(b.toFileString());
            bw.newLine();
        } catch (Exception e) {}
    }
}