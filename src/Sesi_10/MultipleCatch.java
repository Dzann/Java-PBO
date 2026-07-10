package Sesi_10;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int angka = Integer.parseInt("abc");
            int hasil = 10 / 0;
            int[] array = {1, 2, 3};
            System.out.println(angka);
            System.out.println(hasil);
            System.out.println(array[10]);
        } catch (NumberFormatException e) {
            System.out.println("Terjadi kesalahan format angka: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan aritmatika: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi kesalahan indeks array: " + e.getMessage());
        } finally {
            System.out.println("Program Selesai .");
        }
    }
}
