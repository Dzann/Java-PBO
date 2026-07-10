package Sesi_10;

public class THrowSederhana {
    public static void main(String[] args) {
        int umur = 15;
        try {
            if (umur < 18) {
                throw new IllegalArgumentException("Umur harus 18 tahun ke atas.");
            }
            System.out.println("Selamat datang di situs kami!");
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Program Selesai .");
        }
    }
}
