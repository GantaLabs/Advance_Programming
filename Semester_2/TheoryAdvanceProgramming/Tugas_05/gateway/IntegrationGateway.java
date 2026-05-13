package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_05.gateway;


import Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_05.interfaces.Confidential;
import Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_05.interfaces.MedicalRecord;
import Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_05.interfaces.Versioned;

public class IntegrationGateway<T extends MedicalRecord & Versioned & Confidential> {

    private T record;

    public IntegrationGateway(T record) {
        this.record = record;
    }

    public SecureResponse<T> fetchData(String patientId, int clearanceLevel) {
        if (!record.getPatientId().equals(patientId)) {
            return new SecureResponse<>(false, null, "Patient ID tidak ditemukan.");
        }

        if (clearanceLevel < record.getSecurityLevel()) {
            record.maskSensitiveData();
            return new SecureResponse<>(true, record, "Akses terbatas. Data sensitif disembunyikan.");
        }

        return new SecureResponse<>(true, record, "Akses penuh diberikan.");
    }
}