package Sesi_7.Tugas.Collections2;

import java.util.ArrayList;

public class ContohArrayList {
    public static void main(String[] args) {
        ArrayList<String> makanan = new ArrayList<>();

        makanan.add("Nasi Goreng");
        makanan.add("Mie Ayam");
        makanan.add("Sate");

        System.out.println("Daftar Makanan:");
        for (String m : makanan) {
            System.out.println(m);
        }
    }
}