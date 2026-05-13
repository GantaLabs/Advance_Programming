package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_03;

public class ClothingProduct extends Product{
    private String size;
    private String brand;
    
    public ClothingProduct(String productId, String name, double price, int stockQuantity, String size, String brand) {
        super(productId, name, price, stockQuantity);
        this.size = size;
        this.brand = brand;
    }

    @Override
    public double calculateDiscount() {
        if(size.equals("L") || size.equals("XL")) {
            return getPrice() * 0.15;
        }
        return 0;
    }

    @Override
    public void getProductInfo() {
        super.getProductInfo();
        System.out.printf("| %-12s | %-25s | ", "Clothing", "Size: " + size + " | " + brand);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
