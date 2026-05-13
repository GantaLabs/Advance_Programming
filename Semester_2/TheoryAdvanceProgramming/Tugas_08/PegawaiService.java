package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_08;

import java.io.*;

public class PegawaiService {
    private final String file = "Semester_2\\Advance_Programming\\Semester_2\\TheoryAdvanceProgramming\\Tugas_08\\pegawai.txt";

    public boolean login(String nip) {
        return findByNip(nip) != null;
    }

    public Pegawai findByNip(String nip) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                Pegawai p = Pegawai.fromString(line);
                if (p.getNip().equals(nip)) return p;
            }
        } catch (Exception e) {}
        return null;
    }
}