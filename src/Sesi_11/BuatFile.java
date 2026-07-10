package Sesi_11;

import java.io.*;

public class BuatFile {
    public static void main(String[] args) {
        try {
            File file = new File("src/sesi_11/data.txt");
            if (file.createNewFile()) {
                System.out.println("File berhasil dibuat: " + file.getName());
            } else {
                System.out.println("File sudah ada.");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membuat file: " + e.getMessage());
        }
    }
}
