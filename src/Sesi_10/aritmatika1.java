package Sesi_10;

public class aritmatika1 {
    public static void main(String[] args) {

        try {
            int hasil = 10 / 0;
            System.out.println(hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Program Selesai .");
        }

    }
}
