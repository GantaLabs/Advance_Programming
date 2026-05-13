package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_03;

import java.util.ArrayList;

public class Transaction {
    private String transactionId;
    private ArrayList<Product> items;

    public Transaction(String transactionId) {
        this.transactionId = transactionId;
        items = new ArrayList<>();
    }

    public void addItem(Product item) {
        items.add(item);
    }

    public void addItem(Product item, int quantity) {
        for(int i = 1; i <= quantity; i++){
            items.add(item);
        }
    }

    public double processSale() {
        double total = 0;

        for(Product p : items){
            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() - discount;

            total += finalPrice;
        }
        return total;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public ArrayList<Product> getItems() {
        return items;
    }

    public void setItems(ArrayList<Product> items) {
        this.items = items;
    }
}

