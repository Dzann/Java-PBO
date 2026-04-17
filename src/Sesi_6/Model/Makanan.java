package Sesi_6.Model;
import Sesi_6.Interface.BisaDiskon;

public class Makanan extends Produk implements BisaDiskon {

    @Override
    public int hitungDiskon(){
        return (harga * qty) * PERSEN_DISKON / 100;
    }

    @Override
    public int hitungTotal(){
        return (harga * qty) - hitungDiskon();
    }
}