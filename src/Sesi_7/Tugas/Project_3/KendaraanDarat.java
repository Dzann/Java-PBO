package Sesi_7.Tugas.Project_3;

abstract class KendaraanDarat implements Kendaraan {
    protected String nama;

    public KendaraanDarat(String nama) {
        this.nama = nama;
    }

    public abstract void info();
}