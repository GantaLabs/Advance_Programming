package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_8.Practical;

public class Invoice implements Payable {

    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    public void display() {
        System.out.println("Produk : " + productName);
        System.out.println("Jumlah : " + quantity);
        System.out.println("Harga/item : " + pricePerItem);
        System.out.println("Total : " + getPayableAmount());
        System.out.println();
    }
}