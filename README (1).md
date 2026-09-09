# Minpro 1 PBO Sistem Pemesanan Tiket Kapal

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

## Detail Menu Program
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

## Penerapan Nilai Tambah

Program menerapkan beberapa konsep pemrograman berorientasi objek dan validasi input untuk meningkatkan keamanan data serta kualitas program, yaitu:

1. **Access Modifier**  
   Program menerapkan access modifier `private` pada atribut kelas `Pemesanan`, seperti `idPemesanan`, `namaPemesan`, `kapal`, `tujuan`, `hargaTiket`, dan `jumlahTiket`. Dengan demikian, data tidak dapat diakses secara langsung dari luar kelas.

2. **Encapsulation**  
   Program menerapkan konsep encapsulation dengan menyediakan method `getter` dan `setter` untuk mengakses dan mengubah nilai atribut pada kelas `Pemesanan`. Dengan demikian, akses terhadap data dapat dikontrol melalui method yang telah disediakan.

3. **Validasi Input**  
   Program menerapkan validasi terhadap input pengguna, salah satunya pada pilihan kapal. Jika pengguna memasukkan pilihan yang tidak tersedia, yaitu selain `1`, `2`, atau `3`, sistem akan menampilkan pesan **"Pilihan kapal tidak tersedia."** dan tidak menyimpan data pemesanan.

#### 1. Tambah Pemesanan (Menu 1)

[svg](https://github.com/ajirifqi04/Praktikum-PBO-2026/tree/master#1-tambah-pemesanan-menu-1)

- Pengguna memasukkan data pemesanan berupa ID pemesanan, nama penumpang, NIK, umur, pilihan kapal, dan jumlah tiket.
- Sistem menampilkan tiga pilihan kapal yang dilengkapi dengan nama kapal, tujuan, dan harga tiket.
- Sistem menentukan nama kapal, tujuan, dan harga tiket berdasarkan pilihan pengguna menggunakan percabangan `switch`.
- Jika pilihan kapal tidak tersedia, yaitu selain `1`, `2`, atau `3`, sistem menampilkan pesan **"Pilihan kapal tidak tersedia."** dan data tidak disimpan.
- Jika pilihan valid, sistem membuat objek `Penumpang`, `Kapal`, dan `Pemesanan` menggunakan constructor.
- Objek `Pemesanan` kemudian ditambahkan ke dalam `ArrayList` `daftarPemesanan`.
- Sistem menghitung total harga secara otomatis menggunakan method `getTotalHarga()` dan menampilkan pesan bahwa pemesanan berhasil disimpan.

#### 2. Tampilkan Pemesanan (Menu 2)

[svg](https://github.com/ajirifqi04/Praktikum-PBO-2026/tree/master#2-tampilkan-pemesanan-menu-2)

- Sistem memeriksa isi `ArrayList` `daftarPemesanan` untuk mengetahui apakah terdapat data pemesanan.
- Jika belum terdapat data, sistem menampilkan pesan **"Belum ada data pemesanan."**
- Jika terdapat data, sistem menggunakan perulangan `for` untuk mengambil setiap objek `Pemesanan` yang tersimpan.
- Sistem menampilkan informasi pemesanan yang meliputi ID pemesanan, nama penumpang, NIK, umur, nama kapal, tujuan, harga tiket, jumlah tiket, dan total harga.
- Total harga ditampilkan berdasarkan hasil perhitungan method `getTotalHarga()`.

#### 3. Ubah Pemesanan (Menu 3)

[svg](https://github.com/ajirifqi04/Praktikum-PBO-2026/tree/master#3-ubah-pemesanan-menu-3)

- Pengguna memasukkan ID pemesanan yang ingin diubah.
- Sistem melakukan perulangan pada `ArrayList` untuk mencari data berdasarkan `idPemesanan`.
- Jika ID ditemukan, pengguna memasukkan data pemesanan baru berupa nama penumpang, NIK, umur, pilihan kapal, dan jumlah tiket.
- Sistem menentukan nama kapal, tujuan, dan harga tiket berdasarkan pilihan kapal menggunakan percabangan `switch`.
- Jika pilihan kapal valid, data pada objek `Penumpang` dan `Kapal` diperbarui menggunakan method `setter`, kemudian jumlah tiket pada objek `Pemesanan` juga diperbarui.
- Jika ID tidak ditemukan, sistem menampilkan pesan **"Data dengan ID tersebut tidak ditemukan."**

#### 4. Hapus Pemesanan (Menu 4)

[svg](https://github.com/ajirifqi04/Praktikum-PBO-2026/tree/master#4-hapus-pemesanan-menu-4)

- Pengguna memasukkan ID pemesanan yang ingin dihapus.
- Sistem melakukan perulangan untuk mencari data berdasarkan `idPemesanan`.
- Jika ID ditemukan, sistem menghapus objek `Pemesanan` dari `ArrayList` menggunakan method `remove()`.
- Setelah data berhasil dihapus, sistem menampilkan pesan **"Data berhasil dihapus."**
- Jika ID tidak ditemukan, sistem menampilkan pesan **"Data dengan ID tersebut tidak ditemukan."**

#### 5. Keluar (Menu 5)

[svg](https://github.com/ajirifqi04/Praktikum-PBO-2026/tree/master#5-keluar-menu-5)

- Pengguna memilih menu **5. Keluar** untuk mengakhiri program.
- Sistem menampilkan pesan **"Program selesai."** dan **"Terima kasih."**
- Nilai `pilihan` menjadi `5`, sehingga kondisi pada perulangan `do-while` tidak terpenuhi.
- Perulangan berhenti dan program selesai dijalankan.

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
