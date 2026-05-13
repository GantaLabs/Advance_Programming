package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_06;

import java.io.*;
import java.util.*;


public class BukuService {
    private final String file = "buku.txt";


    public List<Buku> getAll() {
        List<Buku> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
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
}
