package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_10.MenulisFile;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TulisFile3 {

    public static void main(String[] args) {

        var keyboard = new Scanner(System.in);
        System.out.print("Masukkan teks yang akan disimpan: ");
        var text = keyboard.nextLine();

        try (var writer = new PrintWriter("test.txt")) {
            writer.println(text);
        } catch (IOException e) {
            System.err.println("Gagal menulis ke file");
        }
        keyboard.close();
    }
}