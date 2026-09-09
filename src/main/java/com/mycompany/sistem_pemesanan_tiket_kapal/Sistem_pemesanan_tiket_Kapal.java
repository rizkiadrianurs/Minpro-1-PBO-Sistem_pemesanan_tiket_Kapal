/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistem_pemesanan_tiket_kapal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Sistem_pemesanan_tiket_Kapal {

 public static void main(String[] args) {

     try (Scanner input = new Scanner(System.in)) {
         ArrayList<Pemesanan> daftarPemesanan = new ArrayList<>();
         
         int pilihan;
         
         do {
             System.out.println();
             System.out.println("|=================================|");
             System.out.println("|  SISTEM PEMESANAN TIKET KAPAL   |");
             System.out.println("|=================================|");
             System.out.println("1. Tambah Pemesanan");
             System.out.println("2. Tampilkan Pemesanan");
             System.out.println("3. Ubah Pemesanan");
             System.out.println("4. Hapus Pemesanan");
             System.out.println("5. Keluar");
             System.out.println("===================================");
             System.out.print("Pilih menu: ");
             
             pilihan = input.nextInt();
             input.nextLine();
             
             switch (pilihan) {
                case 1 -> {
                    System.out.println();
                    System.out.println("===== TAMBAH PEMESANAN =====");

                    System.out.print("ID Pemesanan   : ");
                    String idPemesanan = input.nextLine();

                    System.out.print("Nama Penumpang : ");
                    String nama = input.nextLine();

                    System.out.print("NIK            : ");
                    String nik = input.nextLine();

                    System.out.print("Umur           : ");
                    int umur = Integer.parseInt(input.nextLine()); 

                    System.out.println();
                    System.out.println("Pilihan Kapal:");
                    System.out.println("1. KM Bukit Siguntang - Balikpapan - Rp150000");
                    System.out.println("2. KM Lambelu - Makassar - Rp200000");
                    System.out.println("3. KM Dorolonda - Parepare - Rp175000");
                    System.out.print("Pilih kapal: ");
                    int pilihKapal = input.nextInt();
                    input.nextLine();
                    
                    System.out.print("Jumlah Tiket : ");
                    int jumlahTiket = input.nextInt();
                    input.nextLine();

                    String namaKapal = "";
                    String tujuan = "";
                    int harga = 0;

                    switch (pilihKapal) {
                        case 1 -> {
                            namaKapal = "KM Bukit Siguntang";
                            tujuan = "Balikpapan";
                            harga = 150000;
                        }
                        case 2 -> {
                            namaKapal = "KM Lambelu";
                            tujuan = "Makassar";
                            harga = 200000;
                        }
                        case 3 -> {
                            namaKapal = "KM Dorolonda";
                            tujuan = "Parepare";
                            harga = 175000;
                        }
                        default -> System.out.println("Pilihan kapal tidak tersedia.");
                    }

                    if (harga > 0) {
                        Penumpang penumpang = new Penumpang(nama, nik, umur);
                        Kapal kapal = new Kapal(namaKapal, tujuan, harga); 
                        Pemesanan pemesananBaru = new Pemesanan(idPemesanan, penumpang, kapal, jumlahTiket);

                        daftarPemesanan.add(pemesananBaru);

                        System.out.println();
                        System.out.println("Pemesanan berhasil disimpan!");
                        System.out.println("Total Harga : Rp" + pemesananBaru.getTotalHarga());
                    }
                }
                 case 2 -> {
                     System.out.println();
                     System.out.println("--- DAFTAR PEMESANAN ---");
                     if (daftarPemesanan.isEmpty()) {
                         
                         System.out.println("Belum ada data pemesanan.");
                         
                     } else {
                         
                         for (int i = 0; i < daftarPemesanan.size(); i++) {
                             
                             Pemesanan p = daftarPemesanan.get(i);
                             
                             System.out.println();
                             System.out.println("Data ke-" + (i + 1));
                             System.out.println("ID Pemesanan  : " + p.getIdPemesanan());
                             System.out.println("Nama Penumpang: " + p.getPenumpang().getNama());
                             System.out.println("NIK           : " + p.getPenumpang().getNik());
                             System.out.println("Umur          : " + p.getPenumpang().getUmur());
                             System.out.println("Nama Kapal    : " + p.getKapal().getNamaKapal());
                             System.out.println("Tujuan        : " + p.getKapal().getTujuan());
                             System.out.println("Harga Tiket   : " + p.getKapal().getHargaTiket());
                             System.out.println("Jumlah Tiket  : " + p.getJumlahTiket());
                             System.out.println("Total Harga   : " + p.getTotalHarga());
                         }
                     }
                 }
                case 3 -> {
                System.out.println();
                System.out.println("--- UBAH PEMESANAN ---");

                System.out.print("Masukkan ID Pemesanan: ");
                String idCari = input.nextLine();

                boolean ditemukan = false;

                for (Pemesanan p : daftarPemesanan) {

                    if (p.getIdPemesanan().equals(idCari)) {

                        System.out.print("Nama Penumpang Baru : ");
                        String namaBaru = input.nextLine();

                        System.out.print("NIK Baru : ");
                        String nikBaru = input.nextLine();

                        System.out.print("Umur Baru : ");
                        int umurBaru = input.nextInt();
                        input.nextLine();

                        System.out.println();
                        System.out.println("Pilihan Kapal:");
                        System.out.println("1. KM Bukit Siguntang - Balikpapan - Rp150000");
                        System.out.println("2. KM Lambelu - Makassar - Rp200000");
                        System.out.println("3. KM Dorolonda - Parepare - Rp175000");
                        System.out.print("Pilih kapal: ");
                        int pilihKapalBaru = input.nextInt();
                        input.nextLine();

                        System.out.print("Jumlah Tiket Baru : ");
                        int jumlahBaru = input.nextInt();
                        input.nextLine();

                        String namaKapalBaru = "";
                        String tujuanBaru = "";
                        int hargaBaru = 0;

                        switch (pilihKapalBaru) {
                            case 1 -> {
                                namaKapalBaru = "KM Bukit Siguntang";
                                tujuanBaru = "Balikpapan";
                                hargaBaru = 150000;
                            }
                            case 2 -> {
                                namaKapalBaru = "KM Lambelu";
                                tujuanBaru = "Makassar";
                                hargaBaru = 200000;
                            }
                            case 3 -> {
                                namaKapalBaru = "KM Dorolonda";
                                tujuanBaru = "Parepare";
                                hargaBaru = 175000;
                            }
                            default -> System.out.println("Pilihan kapal tidak tersedia.");
                        }

                        if (hargaBaru > 0) {
                            p.getPenumpang().setNama(namaBaru);
                            p.getPenumpang().setNik(nikBaru);
                            p.getPenumpang().setUmur(umurBaru);

                            p.getKapal().setNamaKapal(namaKapalBaru);
                            p.getKapal().setTujuan(tujuanBaru);
                            p.getKapal().setHargaTiket(hargaBaru);

                            p.setJumlahTiket(jumlahBaru);

                            System.out.println();
                            System.out.println("Data berhasil diubah.");
                        }

                        ditemukan = true;
                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("Data dengan ID tersebut tidak ditemukan.");
                }
            }
                 case 4 ->                     {
                     System.out.println();
                     System.out.println("--- HAPUS PEMESANAN ---");
                     System.out.print("Masukkan ID Pemesanan: ");
                     String idHapus = input.nextLine();
                     boolean ditemukan = false;
                     for (int i = 0; i < daftarPemesanan.size(); i++) {
                         
                         if (daftarPemesanan.get(i)
                                 .getIdPemesanan()
                                 .equals(idHapus)) {
                             
                             daftarPemesanan.remove(i);
                             
                             System.out.println("Data berhasil dihapus.");
                             
                             ditemukan = true;
                             break;
                         }
                     }       if (!ditemukan) {
                         System.out.println("Data dengan ID tersebut tidak ditemukan.");
                     }                          }
                 case 5 -> {
                     System.out.println();
                     System.out.println("Program selesai.");
                     System.out.println("Terima kasih.");
                 }
                 default -> {
                     System.out.println();
                     System.out.println("Menu tidak tersedia.");
                 }
             }
             
         } while (pilihan != 5);
     }
    }
}