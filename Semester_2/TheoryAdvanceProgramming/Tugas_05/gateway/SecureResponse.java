package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_05.gateway;


import Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_05.interfaces.Confidential;
import Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_05.interfaces.MedicalRecord;

public class SecureResponse<T extends MedicalRecord & Confidential> {

    private boolean success;
    private T data;
    private String message;

    public SecureResponse(boolean success, T data, String message) {
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public boolean isSuccess() { return success; }
    public T getData() { return data; }
    public String getMessage() { return message; }

    @Override
    public String toString() {
        return "SecureResponse" +
               "\n  Success : " + success +
               "\n  Message : " + message +
               "\n  Data    :\n" + data;
    }
}
