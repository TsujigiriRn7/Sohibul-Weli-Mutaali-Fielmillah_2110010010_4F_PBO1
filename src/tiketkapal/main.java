
package tiketkapal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<TiketVIP> tiketVIPList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean running = true;
        while (running) {
            System.out.println("== Aplikasi Pembelian Tiket Kapal ==");
            System.out.println("1. Tambah Tiket");
            System.out.println("2. Tampilkan Tiket");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");

            try {
                int pilihan = Integer.parseInt(reader.readLine());

                switch (pilihan) {
                    case 1:
                        System.out.print("Nama: ");
                        String nama = reader.readLine();

                        System.out.print("Usia: ");
                        int usia = Integer.parseInt(reader.readLine());

                        System.out.print("Tujuan: ");
                        String tujuan = reader.readLine();

                        System.out.print("Harga: ");
                        double harga = Double.parseDouble(reader.readLine());

                        TiketVIP tiket = new TiketVIP(nama, usia, tujuan, harga);
                        tiketVIPList.add(tiket);
                        System.out.println("Tiket berhasil ditambahkan!");
                        break;
                    case 2:
                        System.out.println("== Daftar Tiket Kapal Pesiar ==");
                        for (TiketVIP t : tiketVIPList) {
                            System.out.println(t);
                        }
                        break;
                    case 3:
                        running = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                        break;
                }
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan IO: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Masukkan angka yang benar.");
            }
        }
    }
}