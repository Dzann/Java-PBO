package Sesi_11;

import java.io.*;

public class MenulisFIle {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("src/sesi_11/data.txt");
            writer.write("Belajar Pemborgraman file handling\n");
            writer.close();
            System.out.println("Data berhasil ditulis ke file.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis ke file: " + e.getMessage());
        }
    }
}
