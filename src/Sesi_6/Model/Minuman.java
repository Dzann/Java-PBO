package Sesi_6.Model;

import Sesi_6.Interface.BisaDiskon;
import Sesi_6.Interface.BisaStok;

public class Minuman extends Produk implements BisaStok, BisaDiskon {

    @Override
    public int hitungDiskon(){
        return (harga * qty) * PERSEN_DISKON / 100;
    }

    @Override
    public int hitungTotal(){
        return (harga * qty) - hitungDiskon();
    }

    @Override
    public boolean cekStok(){
        return stok >= qty;
    }

    @Override
    public void kurangiStok(){
        if (cekStok()) {
            stok -= qty;
        }
    }

    @Override
    public void tampil(){
        super.tampil();
        System.out.println("Stok   : " + stok);
    }

}