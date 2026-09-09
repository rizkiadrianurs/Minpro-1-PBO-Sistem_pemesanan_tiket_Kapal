# Minpro 1 PBO — Sistem Pemesanan Tiket Kapal

---

**Nama**  : Rizki Adrianur Saputra  
**NIM**   : 2509116049  
**Kelas** : B

---

## Deskripsi Singkat Program

Program ini merupakan **Sistem Pemesanan Tiket Kapal** berbasis Java yang dijalankan melalui console/CLI. Program dibuat dengan menerapkan konsep **Pemrograman Berorientasi Objek (PBO)** dan menyediakan fitur untuk mengelola data pemesanan tiket kapal secara interaktif.

Pengguna dapat melakukan beberapa proses, yaitu:

- Menambahkan data pemesanan.
- Menampilkan seluruh data pemesanan.
- Mengubah data pemesanan.
- Menghapus data pemesanan.
- Mengakhiri program melalui menu keluar.

Program menyimpan data pemesanan sementara selama program berjalan menggunakan `ArrayList<Pemesanan>`.

---

## Konsep Pemrograman Berorientasi Objek

Program menerapkan beberapa konsep utama dalam PBO, yaitu:

### 1. Encapsulation

Setiap atribut pada kelas `Kapal`, `Penumpang`, dan `Pemesanan` menggunakan access modifier `private`. Atribut tersebut tidak dapat diakses secara langsung dari luar kelas dan diakses melalui method `getter` dan `setter`.

### 2. Association / Composition

Kelas `Pemesanan` memiliki hubungan dengan objek `Penumpang` dan `Kapal`. Satu objek pemesanan terdiri dari data satu penumpang dan satu kapal yang dipilih.

### 3. Single Responsibility

Setiap kelas memiliki tanggung jawab masing-masing sesuai dengan fungsinya:

- `Kapal` bertanggung jawab menyimpan data kapal.
- `Penumpang` bertanggung jawab menyimpan data penumpang.
- `Pemesanan` bertanggung jawab menggabungkan data penumpang dan kapal menjadi sebuah transaksi pemesanan.
- `Sistem_pemesanan_tiket_Kapal` bertanggung jawab menjalankan program dan mengelola proses CRUD.

---

## Struktur Kelas

| Kelas | Tanggung Jawab |
|---|---|
| `Kapal` | Menyimpan data kapal berupa nama kapal, tujuan, dan harga tiket. |
| `Penumpang` | Menyimpan data penumpang berupa nama, NIK, dan umur. |
| `Pemesanan` | Menggabungkan data `Penumpang` dan `Kapal`, jumlah tiket, serta menghitung total harga. |
| `Sistem_pemesanan_tiket_Kapal` | Menjalankan program utama, menampilkan menu, dan mengelola proses CRUD data pemesanan. |

---

## Penjelasan Alur Program

Program sistem pemesanan tiket kapal memiliki alur sebagai berikut:

### 1. Program Dimulai

Program dijalankan melalui method `main` pada kelas `Sistem_pemesanan_tiket_Kapal`.

### 2. Menu Utama

Program menampilkan menu utama secara berulang menggunakan perulangan `do-while`. Perulangan akan terus berjalan sampai pengguna memilih menu **Keluar**.

| No. | Menu | Fungsi |
|---|---|---|
| 1 | **Tambah Pemesanan** | Menambahkan data pemesanan tiket kapal. |
| 2 | **Tampilkan Pemesanan** | Menampilkan seluruh data pemesanan yang tersimpan. |
| 3 | **Ubah Pemesanan** | Mengubah data pemesanan yang telah tersimpan. |
| 4 | **Hapus Pemesanan** | Menghapus data pemesanan yang dipilih. |
| 5 | **Keluar** | Mengakhiri program. |

### 3. Penyimpanan Data

Data pemesanan disimpan sementara di dalam memori menggunakan `ArrayList<Pemesanan>`. Data dapat ditambah, ditampilkan, diubah, dan dihapus selama program masih berjalan.

### 4. Program Berakhir

Ketika pengguna memilih menu **Keluar**, kondisi perulangan `do-while` tidak terpenuhi sehingga perulangan berhenti dan program selesai dijalankan.

---

# Detail Menu Program

## 1. Tambah Pemesanan (Menu 1)

Pada menu ini, pengguna dapat menambahkan data pemesanan tiket kapal.

**Alur proses:**

- Pengguna memasukkan ID pemesanan, nama penumpang, NIK, umur, pilihan kapal, dan jumlah tiket.
- Sistem menampilkan tiga pilihan kapal beserta tujuan dan harga tiket.
- Sistem menentukan nama kapal, tujuan, dan harga tiket berdasarkan pilihan pengguna menggunakan percabangan `switch`.
- Jika pilihan kapal tidak tersedia, yaitu selain `1`, `2`, atau `3`, sistem menampilkan pesan **"Pilihan kapal tidak tersedia."** dan data tidak disimpan.
- Jika pilihan valid, sistem membuat objek `Penumpang`, `Kapal`, dan `Pemesanan` menggunakan constructor.
- Objek `Pemesanan` kemudian ditambahkan ke dalam `ArrayList` `daftarPemesanan`.
- Sistem menghitung total harga secara otomatis menggunakan method `getTotalHarga()`.
- Sistem menampilkan pesan bahwa data pemesanan berhasil disimpan.

---

## 2. Tampilkan Pemesanan (Menu 2)

Pada menu ini, sistem menampilkan seluruh data pemesanan yang telah tersimpan.

**Alur proses:**

- Sistem memeriksa isi `ArrayList` `daftarPemesanan`.
- Jika belum terdapat data, sistem menampilkan pesan **"Belum ada data pemesanan."**
- Jika terdapat data, sistem menggunakan perulangan `for` untuk mengambil setiap objek `Pemesanan`.
- Sistem menampilkan ID pemesanan, nama penumpang, NIK, umur, nama kapal, tujuan, harga tiket, jumlah tiket, dan total harga.
- Total harga diperoleh dari hasil perhitungan method `getTotalHarga()`.

---

## 3. Ubah Pemesanan (Menu 3)

Pada menu ini, pengguna dapat mengubah data pemesanan yang telah tersimpan.

**Alur proses:**

- Pengguna memasukkan ID pemesanan yang ingin diubah.
- Sistem melakukan perulangan pada `ArrayList` untuk mencari data berdasarkan `idPemesanan`.
- Jika ID ditemukan, pengguna memasukkan data baru berupa nama penumpang, NIK, umur, pilihan kapal, dan jumlah tiket.
- Sistem menentukan nama kapal, tujuan, dan harga tiket berdasarkan pilihan kapal menggunakan percabangan `switch`.
- Jika pilihan kapal valid, data objek `Penumpang` dan `Kapal` diperbarui menggunakan method `setter`.
- Jumlah tiket pada objek `Pemesanan` juga diperbarui.
- Jika ID tidak ditemukan, sistem menampilkan pesan **"Data dengan ID tersebut tidak ditemukan."**

---

## 4. Hapus Pemesanan (Menu 4)

Pada menu ini, pengguna dapat menghapus data pemesanan berdasarkan ID pemesanan.

**Alur proses:**

- Pengguna memasukkan ID pemesanan yang ingin dihapus.
- Sistem melakukan perulangan untuk mencari data berdasarkan `idPemesanan`.
- Jika ID ditemukan, objek `Pemesanan` dihapus dari `ArrayList` menggunakan method `remove()`.
- Sistem menampilkan pesan **"Data berhasil dihapus."**
- Jika ID tidak ditemukan, sistem menampilkan pesan **"Data dengan ID tersebut tidak ditemukan."**

---

## 5. Keluar (Menu 5)

Menu ini digunakan untuk mengakhiri program.

**Alur proses:**

- Pengguna memilih menu **5. Keluar**.
- Sistem menampilkan pesan **"Program selesai."** dan **"Terima kasih."**
- Nilai `pilihan` menjadi `5`, sehingga kondisi pada perulangan `do-while` tidak terpenuhi.
- Perulangan berhenti dan program selesai dijalankan.

---

# Penerapan Nilai Tambah

Program menerapkan beberapa konsep pemrograman berorientasi objek dan validasi input untuk meningkatkan keamanan data serta kualitas program.

### 1. Access Modifier

Program menerapkan access modifier `private` pada atribut kelas `Pemesanan`, seperti `idPemesanan`, `namaPemesan`, `kapal`, `tujuan`, `hargaTiket`, dan `jumlahTiket`.

Dengan demikian, data tidak dapat diakses secara langsung dari luar kelas.

### 2. Encapsulation

Program menerapkan konsep encapsulation dengan menyediakan method `getter` dan `setter` untuk mengakses dan mengubah nilai atribut pada kelas `Pemesanan`.

Dengan demikian, akses terhadap data dapat dikontrol melalui method yang telah disediakan.

### 3. Validasi Input

Program menerapkan validasi terhadap input pengguna, salah satunya pada pilihan kapal.

Jika pengguna memasukkan pilihan yang tidak tersedia, yaitu selain `1`, `2`, atau `3`, sistem akan menampilkan pesan **"Pilihan kapal tidak tersedia."** dan tidak menyimpan data pemesanan.

---

# Struktur Folder

```text
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

---

# Gambaran Output
1. 
