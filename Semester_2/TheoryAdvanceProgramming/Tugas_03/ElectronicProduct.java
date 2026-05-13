package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_03;

public class ElectronicProduct extends Product{
    private String warrantyPeriod;

    public ElectronicProduct(String productId, String name, double price, int stockQuantity, String warrantyPeriod) {
        super(productId, name, price, stockQuantity);
        this.warrantyPeriod = warrantyPeriod;
    }
    
    @Override
    public double calculateDiscount() {
        double discount = getPrice() * 0.05;

        if(getPrice() > 500000) {
            discount += getPrice() * 0.02; 
        }
        return discount;
    }

    @Override
    public void getProductInfo() {
        super.getProductInfo();
        System.out.printf("| %-12s | %-25s | ", "Electronic", "Garansi: " + warrantyPeriod);
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
}
