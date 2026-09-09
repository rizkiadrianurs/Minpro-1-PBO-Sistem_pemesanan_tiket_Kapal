/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_pemesanan_tiket_kapal;

/**
 *
 * @author ACER
 */
public class Pemesanan {
    
    private String idPemesanan;
    private Penumpang penumpang;
    private Kapal kapal;
    private int jumlahTiket;

    public Pemesanan(String idPemesanan, Penumpang penumpang, Kapal kapal, int jumlahTiket) {
        this.idPemesanan = idPemesanan;
        this.penumpang = penumpang;
        this.kapal = kapal;
        this.jumlahTiket = jumlahTiket;
    }

    public String getIdPemesanan() {
        return idPemesanan;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public Kapal getKapal() {
        return kapal;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }

    public void setIdPemesanan(String idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }

    public void setKapal(Kapal kapal) {
        this.kapal = kapal;
    }

    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
    }

    public int getTotalHarga() {
        return kapal.getHargaTiket() * jumlahTiket;
    }
}
