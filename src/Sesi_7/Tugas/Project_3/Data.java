package Sesi_7.Tugas.Project_3;

import java.util.ArrayList;

class DataKendaraan<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void tambah(T data) {
        list.add(data);
    }

    public void tampil() {
        for (T item : list) {
            System.out.println(item);
        }
    }
}