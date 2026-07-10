package Sesi_11;

import java.io.*;

public class MengambilInfo {
    public static void main(String[] args) {
        try {
            File file = new File("src/sesi_11/data.txt");
            if (file.exists()) {
                System.out.println("Nama File: " + file.getName());
                System.out.println("Ukuran File: " + file.length() + " bytes");
                System.out.println("Path File: " + file.getAbsolutePath());
                System.out.println("Dapat Dibaca: " + file.canRead());
                System.out.println("Dapat Ditulis: " + file.canWrite());
            } else {
                System.out.println("File tidak ditemukan.");
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
