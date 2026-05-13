package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_03;

public abstract class Product {
    private String productId;
    private String name;
    private double price;
    private int stockQuantity;

    public Product(String productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public abstract double calculateDiscount();

    public void getProductInfo() {
        System.out.printf("| %-8s | %-20s | %-10s | %-8s ", productId, name, (int)price, stockQuantity);
    }

    public void updateStock(int quantity) {
        stockQuantity += quantity;
    }
    
    public void updateStock(int quantity, String reason) {
        stockQuantity += quantity;
        System.out.println("Stock updated karena: " + reason);
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
