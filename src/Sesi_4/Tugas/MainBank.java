package Sesi_4.Tugas;

class Bank {

    // Method Overloading
    void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan);
    }

    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan);
    }

    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan +
                " di bank " + bankTujuan + " dengan berita: " + berita);
    }

    void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }
}

// Class turunan BNI
class BankBNI extends Bank {

    @Override
    void sukuBunga() {
        System.out.println("Suku Bunga dari BNI adalah : 4%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BNI";
        int biaya = 2500;
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan +
                " di bank " + bankTujuan + " | Biaya transfer: " + biaya);
    }
}

// Class turunan BCA
class BankBCA extends Bank {

    @Override
    void sukuBunga() {
        System.out.println("Suku Bunga dari BCA adalah : 4.5%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BCA";
        int biaya = 3000;
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan +
                " di bank " + bankTujuan + " | Biaya transfer: " + biaya);
    }
}

// Main Class
public class MainBank {

    public static void main(String[] args) {

        Bank bank = new Bank();
        BankBNI bni = new BankBNI();
        BankBCA bca = new BankBCA();

        // Method Overloading
        bank.transferUang(100000, "123456789");
        bank.transferUang(200000, "987654321", "Mandiri");
        bank.transferUang(300000, "111222333", "BRI", "Bayar Hutang");
        bank.sukuBunga();

        System.out.println();

        // Method Overriding
        bni.transferUang(400000, "555666777", "");
        bni.sukuBunga();

        System.out.println();

        bca.transferUang(500000, "888999000", "");
        bca.sukuBunga();
    }
}