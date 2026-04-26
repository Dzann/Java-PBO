package Sesi_7.Tugas.Collections2;

import java.util.ArrayDeque;

public class ContohArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> antrian = new ArrayDeque<>();

        antrian.add("Andi");
        antrian.add("Budi");
        antrian.add("Caca");

        System.out.println("Antrian awal: " + antrian);

        antrian.poll(); // hapus depan
        System.out.println("Setelah dipanggil: " + antrian);

        antrian.addFirst("Zaki");
        System.out.println("Tambah depan: " + antrian);
    }
}