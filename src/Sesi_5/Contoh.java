package Sesi_5;

class Tabungan {
    private double saldo;

    void tambah(double jumlah) {
        saldo += jumlah;
    }

    void ambil(double jumlah) {
        saldo -= jumlah;
    }

    void infoSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}

public class Contoh {
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan();
        tabungan.tambah(100000);
        // tabungan.ambil(50000);
        tabungan.infoSaldo(); // Output: Saldo: 50000.0
    }
}
