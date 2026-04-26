package Sesi_7.Tugas.Project_3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DataKendaraan<String> data = new DataKendaraan<>();

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Mobil");
            System.out.println("2. Tambah Motor");
            System.out.println("3. Tampilkan Data");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            int pilih = input.nextInt();
            input.nextLine();

            if (pilih == 1) {
                System.out.print("Nama Mobil: ");
                String nama = input.nextLine();
                Mobil m = new Mobil(nama);
                m.nyalakan();
                data.tambah("Mobil: " + nama);

            } else if (pilih == 2) {
                System.out.print("Nama Motor: ");
                String nama = input.nextLine();
                Motor m = new Motor(nama);
                m.nyalakan();
                data.tambah("Motor: " + nama);

            } else if (pilih == 3) {
                System.out.println("Data Kendaraan:");
                data.tampil();

            } else if (pilih == 4) {
                System.out.println("Keluar...");
                break;
            }
        }

        input.close();
    }
}
