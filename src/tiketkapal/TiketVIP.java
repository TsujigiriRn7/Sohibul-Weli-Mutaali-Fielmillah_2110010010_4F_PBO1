
package tiketkapal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TiketVIP extends TiketKapal {
    private String tujuan;
    private double harga;

    public TiketVIP(String nama, int usia, String tujuan, double harga) {
        super(nama, usia);
        this.tujuan = tujuan;
        this.harga = harga;
    }

    public String getTujuan() {
        return tujuan;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

  
    public String toString() {
        return "Tiket Yang Terdaftar :" +
                "\nnama='" + getNama() + '\'' +
                ",\nusia=" + getUsia() +
                ",\ntujuan='" + tujuan + '\'' +
                ",\nharga=" + harga +
                ' ';
    }
}
