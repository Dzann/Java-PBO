package Sesi_9;

public class Concat {
    public static void main(String[] args) {
        String namaDepan = "Muhammad";
        String namaBelakang = "Gidzan";

        String namaLengkap = namaDepan.concat(" ").concat(namaBelakang);
        System.out.println("Nama Lengkap: " + namaLengkap);
    }
}
