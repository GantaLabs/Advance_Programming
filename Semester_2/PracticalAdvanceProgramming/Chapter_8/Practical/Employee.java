package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_8.Practical;

public class Employee implements Payable {

    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    public double getTotalInvoiceAmount() {
        double total = 0;
        for (Invoice inv : invoices) {
            total += inv.getPayableAmount();
        }
        return total;
    }

    @Override
    public double getPayableAmount() {
        return salaryPerMonth - getTotalInvoiceAmount();
    }

    public void display() {
        System.out.println("ID Karyawan : " + registrationNumber);
        System.out.println("Nama : " + name);
        System.out.println("Gaji Awal : " + salaryPerMonth);
        System.out.println("Total Hutang: " + getTotalInvoiceAmount());
        System.out.println("Gaji Bersih : " + getPayableAmount());
        System.out.println("Detail Belanja : ");
        System.err.println();

        for (Invoice inv : invoices) {
            inv.display();
        }
    }
}