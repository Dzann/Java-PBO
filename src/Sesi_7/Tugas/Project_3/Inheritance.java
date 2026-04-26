package Sesi_7.Tugas.Project_3;

class Mobil extends KendaraanDarat {

    public Mobil(String nama) {
        super(nama);
    }

    @Override
    public void nyalakan() {
        System.out.println(nama + " dinyalakan (Mobil)");
    }

    @Override
    public void info() {
        System.out.println("Mobil: " + nama);
    }
}

class Motor extends KendaraanDarat {

    public Motor(String nama) {
        super(nama);
    }

    @Override
    public void nyalakan() {
        System.out.println(nama + " dinyalakan (Motor)");
    }

    @Override
    public void info() {
        System.out.println("Motor: " + nama);
    }
}
