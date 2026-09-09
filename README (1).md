# Minpro 1 PBO Sistem Pemesanan TiketKapal

## Deskripsi Singkat Program
Program ini adalah **Sistem Pemesanan Tiket Kapal** berbasis Java (console/CLI) yang dibuat menggunakan konsep Pemrograman Berorientasi Objek (PBO). Program ini memungkinkan pengguna untuk melakukan pemesanan tiket kapal, melihat daftar pemesanan, mengubah data pemesanan, dan menghapus data pemesanan secara interaktif melalui menu di terminal.

Program ini menerapkan konsep-konsep OOP seperti:
- **Encapsulation**: setiap kelas (`Kapal`, `Penumpang`, `Pemesanan`) menyembunyikan atributnya sebagai `private` dan hanya bisa diakses/diubah lewat *getter* dan *setter*.
- **Association / Composition**: kelas `Pemesanan` memiliki relasi terhadap objek `Penumpang` dan `Kapal` (satu pemesanan terdiri dari satu penumpang dan satu kapal).
- **Single Responsibility**: setiap kelas memiliki tanggung jawab masing-masing — `Kapal` menyimpan data kapal, `Penumpang` menyimpan data penumpang, `Pemesanan` menggabungkan keduanya menjadi satu transaksi pemesanan.

## Struktur Kelas
| Kelas | Tanggung Jawab |
|---|---|
| `Kapal` | Menyimpan data kapal: nama kapal, tujuan, dan harga tiket. |
| `Penumpang` | Menyimpan data penumpang: nama, NIK, dan umur. |
| `Pemesanan` | Menggabungkan data `Penumpang` dan `Kapal` menjadi satu data pemesanan, lengkap dengan jumlah tiket dan perhitungan total harga. |
| `Sistem_pemesanan_tiket_Kapal` | Kelas utama (`main`) yang menjalankan program, berisi menu interaktif dan logika CRUD (Create, Read, Update, Delete) data pemesanan. |

## Penjelasan Alur Program

Program sistem pemesanan tiket kapal memiliki alur sebagai berikut:

1. **Program dimulai**  
   Program dijalankan melalui method `main` pada kelas `Sistem_pemesanan_tiket_Kapal`.

2. **Menampilkan menu utama**  
   Program menampilkan menu utama secara berulang menggunakan perulangan `do-while`. Perulangan akan terus berjalan hingga pengguna memilih opsi **Keluar**.

   | No. | Menu | Fungsi |
   |---|---|---|
   | 1 | **Tambah Pemesanan** | Menambahkan data pemesanan tiket kapal. |
   | 2 | **Tampilkan Pemesanan** | Menampilkan seluruh data pemesanan yang tersimpan. |
   | 3 | **Ubah Pemesanan** | Mengubah data pemesanan yang telah tersimpan. |
   | 4 | **Hapus Pemesanan** | Menghapus data pemesanan yang dipilih. |
   | 5 | **Keluar** | Mengakhiri program. |

3. **Penyimpanan data**  
   Data pemesanan disimpan sementara di dalam memori menggunakan `ArrayList<Pemesanan>`. Data dapat ditambah, ditampilkan, diubah, dan dihapus selama program masih berjalan.

4. **Program berakhir**  
   Ketika pengguna memilih menu **Keluar**, perulangan `do-while` dihentikan dan program selesai dijalankan.

### 1. Tambah Pemesanan
Pengguna memasukkan ID pemesanan, nama, NIK, dan umur penumpang, lalu memilih salah satu dari 3 kapal yang tersedia (KM Bukit Siguntang, KM Lambelu, KM Dorolonda) beserta jumlah tiket. Sistem kemudian membuat objek `Penumpang`, `Kapal`, dan `Pemesanan` baru, lalu menambahkannya ke `daftarPemesanan` dan menampilkan total harga yang harus dibayar (`getTotalHarga()`).

### 2. Tampilkan Pemesanan
Sistem menampilkan seluruh data pemesanan yang tersimpan di `daftarPemesanan`, termasuk data penumpang, data kapal, jumlah tiket, dan total harga masing-masing pemesanan. Jika belum ada data, sistem memberi tahu bahwa data masih kosong.

### 3. Ubah Pemesanan
Pengguna memasukkan ID pemesanan yang ingin diubah. Jika ID ditemukan dalam `daftarPemesanan`, pengguna dapat memasukkan data baru (nama, NIK, umur, pilihan kapal, dan jumlah tiket), yang kemudian menggantikan data lama melalui method *setter* pada objek terkait. Jika ID tidak ditemukan, sistem menampilkan pesan bahwa data tidak ada.

### 4. Hapus Pemesanan
Pengguna memasukkan ID pemesanan yang ingin dihapus. Jika ditemukan, data akan dihapus dari `daftarPemesanan`. Jika tidak ditemukan, sistem menampilkan pesan bahwa data tidak ada.

### 5. Keluar
Program menghentikan perulangan menu dan menampilkan pesan penutup.

## Penjelasan Letak Penerapan Nilai Tambah
- **Perhitungan otomatis total harga**: method `getTotalHarga()` pada kelas `Pemesanan` menghitung `hargaTiket * jumlahTiket` secara otomatis, sehingga pengguna tidak perlu menghitung manual.
- **Validasi input pilihan kapal**: jika pengguna memasukkan pilihan kapal yang tidak tersedia (bukan 1, 2, atau 3), sistem tidak akan menyimpan data dan memberi pesan "Pilihan kapal tidak tersedia."
- **Pencarian data berbasis ID unik**: fitur ubah dan hapus data memanfaatkan `idPemesanan` sebagai identifier unik untuk mencari data yang tepat di dalam `ArrayList`, bukan berdasarkan index array secara langsung.
- **Penggunaan try-with-resources** pada `Scanner` di method `main`, sehingga resource input otomatis tertutup saat program selesai.

## Cara Menjalankan Program
1. Pastikan Java (JDK) dan Maven sudah terinstal.
2. Clone repository ini.
3. Jalankan perintah berikut di root folder project:
   ```bash
   mvn compile
   mvn exec:java -Dexec.mainClass="com.mycompany.sistem_pemesanan_tiket_kapal.Sistem_pemesanan_tiket_Kapal"
   ```
4. Ikuti menu yang muncul di terminal.

## Struktur Folder
```
Sistem_pemesanan_tiket_Kapal/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/
                └── mycompany/
                    └── sistem_pemesanan_tiket_kapal/
                        ├── Kapal.java
                        ├── Penumpang.java
                        ├── Pemesanan.java
                        └── Sistem_pemesanan_tiket_Kapal.java
```
