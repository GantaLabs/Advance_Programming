package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_7.SourceCode;

class ProductionEmployee extends Employee {
    private int quantity; 
    private double pricePerItem; 

    public ProductionEmployee(String name, String noKTP, int quantity, double pricePerItem) {
        super(name, noKTP); 
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double earnings() { 
        return quantity * pricePerItem; 
    }

    @Override
    public String toString() {
        return String.format("Production employee: %s\n%s: %d\n%s: $%,.2f", 
            super.toString(), "quantity produced", quantity, 
            "price per item", pricePerItem); 
    }
}

public class MainProduksi {
    public static void main(String[] args) {
        // Membuat minimal 4 objek ProductionEmployee [cite: 407]
        ProductionEmployee p1 = new ProductionEmployee("Andi", "111", 100, 2500);
        ProductionEmployee p2 = new ProductionEmployee("Budi", "222", 150, 2500);
        ProductionEmployee p3 = new ProductionEmployee("Caca", "333", 80, 3000);
        ProductionEmployee p4 = new ProductionEmployee("Deni", "444", 200, 2000);

        // Menampung dalam array Employee (Polimorfisme) [cite: 345, 356]
        Employee[] employees = {p1, p2, p3, p4};

        System.out.println("Proses Data Karyawan Produksi:");
        for (Employee e : employees) {
            System.out.println(e); // Memanggil toString() subclass [cite: 359]
            System.out.printf("Pendapatan: $%,.2f\n\n", e.earnings()); // Polimorfisme [cite: 382]
        }
    }
}
