package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_06;

import java.io.*;
import java.util.*;


public class SiswaService {
    private final String file = "siswa.txt";


    public List<Siswa> getAll() {
        List<Siswa> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(Siswa.fromString(line));
            }
        } catch (Exception e) {}
        return list;
    }


    public void tambah(Siswa s) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(s.toFileString());
            bw.newLine();
        } catch (Exception e) {}
    }


    public Siswa findByNis(String nis) {
        for (Siswa s : getAll()) {
            if (s.getNis().equals(nis)) return s;
        }
        return null;
    }
}
