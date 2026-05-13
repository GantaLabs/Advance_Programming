package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_8.Practical;

public class MainPrak {
    public static void main(String[] args) {

        Invoice inv1 = new Invoice("Beras", 2, 50000);
        Invoice inv2 = new Invoice("Minyak", 1, 20000);
        Invoice inv3 = new Invoice("Gula", 3, 15000);

        Invoice[] invoices = {inv1, inv2, inv3};

        Employee emp = new Employee(101, "Budi", 3000000, invoices);


        Payable[] payables = new Payable[invoices.length + 1];

        int i = 0;
        for (Invoice inv : invoices) {
            payables[i++] = inv;
        }
        payables[i] = emp;

        System.out.println();
        for (Payable p : payables) {
            System.out.println("Jumlah bayar : " + p.getPayableAmount());
        }

        System.out.println();
        System.out.println("Detail Karyawan :");
        emp.display();
    }
}