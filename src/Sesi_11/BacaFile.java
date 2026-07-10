package Sesi_11;

import java.io.*;
import java.util.Scanner;

public class BacaFile {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Administrator\\Documents\\Semester 4\\JAVA\\PBO\\src\\Sesi_11\\data.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
    }
}
