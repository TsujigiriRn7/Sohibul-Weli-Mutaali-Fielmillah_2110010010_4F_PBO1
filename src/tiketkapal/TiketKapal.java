
package tiketkapal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


class TiketKapal {
    private String nama;
    private int usia;

    public TiketKapal(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

  
    public String toString() {
        return "Tiket{" +
                "nama='" + nama + '\'' +
                ", usia=" + usia +
                '}';
    }
}
