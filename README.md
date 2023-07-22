# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pembelian tiket kapal pesiar menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Program di ini adalah sebuah aplikasi sederhana untuk pembelian tiket kapal pesiar. Program ini menggunakan Java dan memiliki dua kelas utama yaitu TiketKapal dan TiketVIP.

Secara keseluruhan, program ini memungkinkan pengguna untuk menambahkan tiket kapal pesiar VIP dengan nama, usia, tujuan, dan harga, serta menampilkan daftar tiket yang telah ditambahkan sebelumnya. Pengguna dapat mengulang proses hingga memilih opsi untuk keluar dari aplikasi.

Program ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode
**Penjelasan Source Code Aplikasi Pembelian Tiket Kapal**

Pada source code tersebut, terdapat sebuah aplikasi sederhana untuk pembelian tiket kapal pesiar. Aplikasi ini memanfaatkan konsep pewarisan atau inheritance, di mana terdapat dua kelas yaitu `TiketKapal` dan `TiketVIP`. Berikut penjelasan lebih detail mengenai setiap kelas dan fungsinya:

**1. Kelas TiketKapal**
Kelas ini merupakan kelas dasar (superclass) yang merepresentasikan tiket kapal. Berikut atribut dan metode yang dimiliki kelas ini:

- **Atribut**
  - `nama`: Menyimpan nama penumpang tiket kapal.
  - `usia`: Menyimpan usia penumpang tiket kapal.

- **Metode**
  - `TiketKapal(String nama, int usia)`: Konstruktor untuk menginisialisasi objek TiketKapal dengan nama dan usia penumpang.
  - `getNama()`: Mengembalikan nama penumpang tiket.
  - `getUsia()`: Mengembalikan usia penumpang tiket.
  - `setUsia(int usia)`: Mengubah usia penumpang tiket.
  - `toString()`: Mengembalikan representasi string dari objek TiketKapal.

**2. Kelas TiketVIP**
Kelas ini merupakan turunan (subclass) dari kelas TiketKapal. Kelas TiketVIP merepresentasikan tiket kapal pesiar kelas VIP dengan tambahan atribut dan metode. Berikut atribut dan metode yang dimiliki kelas ini:

- **Atribut**
  - `tujuan`: Menyimpan tujuan perjalanan kapal pesiar VIP.
  - `harga`: Menyimpan harga tiket kapal pesiar VIP.

- **Metode**
  - `TiketVIP(String nama, int usia, String tujuan, double harga)`: Konstruktor untuk menginisialisasi objek TiketVIP dengan nama, usia, tujuan, dan harga tiket.
  - `getTujuan()`: Mengembalikan tujuan perjalanan kapal pesiar VIP.
  - `getHarga()`: Mengembalikan harga tiket kapal pesiar VIP.
  - `setHarga(double harga)`: Mengubah harga tiket kapal pesiar VIP.
  - `toString()`: Mengembalikan representasi string dari objek TiketVIP. Metode ini telah dioverride dari kelas TiketKapal untuk mencetak informasi tambahan, yaitu tujuan dan harga tiket.

**3. Kelas Main**
Kelas `Main` merupakan kelas utama dari program ini yang berisi fungsi `main` sebagai pintu masuk eksekusi program. Berikut adalah penjelasan lebih detail dari bagian ini:

- Pertama, terdapat deklarasi dan inisialisasi objek `ArrayList<TiketVIP>` dengan nama `tiketVIPList` untuk menyimpan daftar tiket kapal pesiar VIP.
- Selanjutnya, program akan membaca input dari pengguna menggunakan `BufferedReader` untuk melakukan beberapa tugas, seperti menambah tiket, menampilkan daftar tiket, dan keluar dari program.
- Pengguna dapat memilih opsi melalui angka (1, 2, atau 3) yang akan diambil menggunakan `Integer.parseInt(reader.readLine())`.
- Opsi yang tersedia:
  - Opsi 1 (`case 1`): Menambahkan tiket baru ke dalam `tiketVIPList` berdasarkan input nama, usia, tujuan, dan harga tiket.
  - Opsi 2 (`case 2`): Menampilkan daftar tiket kapal pesiar VIP yang telah ditambahkan ke dalam `tiketVIPList`.
  - Opsi 3 (`case 3`): Keluar dari program dengan mengubah nilai `running` menjadi `false`.
  - Default: Menampilkan pesan jika opsi yang dimasukkan tidak valid.

**Penutup**

Dengan aplikasi ini, pengguna dapat memanfaatkan kelas `TiketKapal` dan `TiketVIP` untuk membeli tiket kapal pesiar kelas VIP dan melihat daftar tiket yang telah dibeli. Pengguna dapat memilih opsi yang sesuai dengan angka untuk melakukan tugas tertentu dalam aplikasi.
## Pembuat

Nama: Sohibul Weli Mutaali Fielmillah 
NPM: 2110010010
