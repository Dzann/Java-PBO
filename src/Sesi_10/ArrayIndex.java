package Sesi_10;

public class ArrayIndex {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5};

        try {
            System.out.println(angka[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Program Selesai .");
        }
    }
}
