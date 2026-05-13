package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_05.interfaces;

public interface Confidential {
    // 1 = PUBLIC, 2 = RESTRICTED, 3 = SECRET
    int getSecurityLevel();
    void maskSensitiveData();
}