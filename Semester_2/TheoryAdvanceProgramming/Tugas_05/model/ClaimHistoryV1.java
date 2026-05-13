package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_05.model;


import Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_05.interfaces.Confidential;
import Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_05.interfaces.MedicalRecord;
import Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_05.interfaces.Versioned;

public class ClaimHistoryV1 implements MedicalRecord, Versioned, Confidential {
    private String patientId;
    private String patientName;
    private String nomorKlaim;
    private String diagnosaKlaim;
    private int securityLevel;

    public ClaimHistoryV1(String patientId, String patientName, String nomorKlaim, String diagnosaKlaim, int securityLevel) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.nomorKlaim = nomorKlaim;
        this.diagnosaKlaim = diagnosaKlaim;
        this.securityLevel = securityLevel;
    }

    @Override
    public String getPatientId() {
        return patientId;
    }

    @Override
    public String getPatientName() {
        return patientName;
    }

    @Override
    public int getVersion() {
        return 1;
    }

    @Override
    public int getSecurityLevel() {
        return securityLevel;
    }

    @Override
    public void maskSensitiveData() {
        nomorKlaim = "******";
        diagnosaKlaim = "******";
    }

    @Override
    public String toString() {
        return "ClaimHistoryV1" +
                "\n  Patient ID     : " + patientId +
                "\n  Name           : " + patientName +
                "\n  Nomor Klaim    : " + nomorKlaim +
                "\n  Diagnosa Klaim : " + diagnosaKlaim +
                "\n  Version        : " + getVersion() +
                "\n  Sec Level      : " + securityLevel;
    }
}
