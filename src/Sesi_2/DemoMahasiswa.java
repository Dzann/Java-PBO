package Sesi_2;
class Mahasiswa {
    //atribut properti
    // "Private" hanya bisa diakses didalam kelas itu sendiri
    private String nama;
    private int umur;

    // ======Constructor======
    // Constructor adalah method khusus yang digunakan untuk menginisialisasi objek
    Mahasiswa(String nama, int umur) {
        this.nama = nama; // "this" digunakan untuk merujuk pada objek saat ini / membedakan antara atribut dan parameter yang memiliki nama yang sama
        this.umur = umur;
    }

    // ======Getter======
    // Getter adalah method yang digunakan untuk mengambil nilai dari atribut yang bersifat private
    public String getNama() {
        return this.nama;
    }

    public int getUmur() {
        return this.umur;
    }

    // ======Setter======
    // Setter adalah method yang digunakan untuk mengubah nilai dari atribut yang bersifat private
    public void setNama(String nama) {
        // "this" digunakan untuk merujuk pada objek saat ini / membedakan antara atribut dan parameter yang memiliki nama yang sama
        this.nama = nama;
    }

    public void setUmur(int umur) {
        if (umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur harus lebih dari 0");
        }
    }

    // method tambahan untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur + " tahun");
    }
}
// method utama untuk menjalankan program
public class DemoMahasiswa {
    public static void main(String[] args) {
        // Membuat objek mahasiswa dengan menggunakan constructor
        Mahasiswa mahasiswa1 = new Mahasiswa("Gidzan", 19);
        Mahasiswa mahasiswa2 = new Mahasiswa("Sahawe", 22);

       // menggunakan getter untuk mengambil nilai atribut dan menampilkannya
        System.out.println("Data Awal");
        System.out.println("Informasi Mahasiswa 1: " + mahasiswa1.getNama() + ", " + mahasiswa1.getUmur() + " tahun");
        System.out.println("Informasi Mahasiswa 2: " + mahasiswa2.getNama() + ", " + mahasiswa2.getUmur() + " tahun");

        // menggunakan setter untuk mengubah nilai atribut
        mahasiswa1.setNama("Gidzan");
        mahasiswa1.setUmur(20);

        mahasiswa2.setNama("Abdul");
        mahasiswa2.setUmur(23);

        // menampilkan informasi mahasiswa setelah diubah menggunakan method tampilkanInfo
        System.out.println("\nData Setelah Diubah");
        mahasiswa1.tampilkanInfo();
        mahasiswa2.tampilkanInfo();
    }
}