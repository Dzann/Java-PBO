package Sesi_4;

class Produk {
    protected String nama;
    protected int harga;

    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String tampilInfo() {
        return "Nama: " + nama + " | Harga: " + harga;
    }
}

class ProdukFisik extends Produk {
    private double beratKG;

    public ProdukFisik(String nama, int harga, double beratKG) {
        super(nama, harga);
        this.beratKG = beratKG;
    }

    @Override
    public String tampilInfo() {
        return "|FISIK| " + super.tampilInfo() + " | Berat: " + beratKG + " KG";
    }
}

class ProdukDigital extends Produk {
    private String masaAktif;

    public ProdukDigital(String nama, int harga, String masaAktif) {
        super(nama, harga);
        this.masaAktif = masaAktif;
    }

    @Override
    public String tampilInfo() {
        return "|DIGITAL| " + super.tampilInfo() + " | Masa Aktif: " + masaAktif;
    }
}

class Kasir {
    public Integer hitungBayar(int harga, int qty) {
        return harga * qty;
    }

    public Integer hitungBayar(int harga, int qty, int diskonPersen) {
        int total = harga * qty;
        int diskon = (total * diskonPersen) / 100;
        return total - diskon;
    }
}

public class DemoPolimorph {
    public static void main(String[] args) {
        System.out.println("=== DEMO OVERRIDING ===");
        System.out.println("Memanggil tampilInfo() pada masing-masing produk:");

        Produk p1 = new Produk("Kaos", 85000);
        ProdukFisik p2 = new ProdukFisik("Sepatu Lari", 350000, 0.8);
        ProdukDigital p3 = new ProdukDigital("Office 365", 600000, "1 Tahun");

        System.out.println(p1.tampilInfo());
        System.out.println(p2.tampilInfo());
        System.out.println(p3.tampilInfo());

        System.out.println("=== DEMO OVERLOADING ===");
        System.out.println("Memanggil hitungBayar() dengan berbagai parameter:");

        Kasir kasir = new Kasir();

        int total1 = kasir.hitungBayar(50000, 2);   
        int total2 = kasir.hitungBayar(50000, 2, 15);

        System.out.println("Total Bayar (tanpa diskon): " + total1);
        System.out.println("Total Bayar (dengan diskon): " + total2);

    }

}
