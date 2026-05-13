package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_03;

import java.util.ArrayList;

public class ShopManagementSystem {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Transaction> transactions = new ArrayList<>();

        // tambah produk
        products.add(new FoodProduct("F01","Roti",15000,20,"2026-03-20"));
        products.add(new FoodProduct("F02","Susu",10000,8,"2026-03-25"));

        products.add(new ElectronicProduct("E01","Mouse",200000,15,"1 Tahun"));
        products.add(new ElectronicProduct("E02","Keyboard",600000,5,"2 Tahun"));

        products.add(new ClothingProduct("C01","Kaos",120000,12,"L","Nike"));
        products.add(new ClothingProduct("C02","Jaket",300000,7,"XL","Adidas"));

        // tampilkan daftar produk
        System.out.println("========================================== DAFTAR PRODUK =============================================");
        System.out.printf("| %-8s | %-20s | %-10s | %-8s | %-12s | %-25s |\n", "ID", "Nama", "Harga", "Stock", "Tipe", "Info");
        System.out.println("------------------------------------------------------------------------------------------------------");
        
        for(Product p : products){
            p.getProductInfo();
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------------------------------------------");

        // transaksi 1
        Transaction t1 = new Transaction("T01");

        t1.addItem(products.get(0));
        t1.addItem(products.get(2));
        t1.addItem(products.get(4));

        transactions.add(t1);

        // transaksi 2
        Transaction t2 = new Transaction("T02");

        t2.addItem(products.get(1));
        t2.addItem(products.get(1));
        t2.addItem(products.get(3));

        transactions.add(t2);

        // struk penjualan
        for(Transaction t : transactions){
            String format = "| %-6s | %-20s | %-10s | %-3s | %-5s | %-10s | %-10s |\n";

            System.out.println("\n=================================== TRANSAKSI " + t.getTransactionId() + " ====================================");
            System.out.printf(format,"ID","Nama","Harga","Qty","Stock","Diskon","Subtotal");
            System.out.println("--------------------------------------------------------------------------------------");

            double total = 0;
            ArrayList<Product> processed = new ArrayList<>();

            for(Product p : t.getItems()){
                if(processed.contains(p)){
                    continue;
                }

                int qty = 0;

                for(Product item : t.getItems()){
                    if(item == p){
                        qty++;
                    }
                }

                double harga = p.getPrice();
                double diskon = p.calculateDiscount();
                double subtotal = (harga * qty) - diskon;

                // update stock
                p.updateStock(-qty);

                int stockSekarang = p.getStockQuantity();

                total += subtotal;

                System.out.printf(format, p.getProductId(), p.getName(), (int)harga, qty, stockSekarang, (int)diskon, (int)subtotal);
                processed.add(p);
            }
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("TOTAL BAYAR: " + (int)total);
        }

        // cari produk terlaris
        Product terlaris = null;
        int max = 0;

        for(Product p : products){
            int count = 0;

            for(Transaction t : transactions){
                for(Product item : t.getItems()){
                    if(item.getProductId().equals(p.getProductId())){
                        count++;
                    }
                }
            }

            if(count > max){
                max = count;
                terlaris = p;
            }
        }

        if(terlaris != null){
            System.out.println("\n========================================== PRODUK TERLARIS =====================================================");
            System.out.printf("| %-8s | %-20s | %-10s | %-8s | %-12s | %-25s | %-7s |\n", "ID", "Nama", "Harga", "Stock", "Tipe", "Info", "Terjual");
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            terlaris.getProductInfo();
            System.out.printf("%-7s |\n", max);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }
}

