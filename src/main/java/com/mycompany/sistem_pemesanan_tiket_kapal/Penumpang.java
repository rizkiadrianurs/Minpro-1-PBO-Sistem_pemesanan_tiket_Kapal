/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_pemesanan_tiket_kapal;

/**
 *
 * @author ACER
 */
public class Penumpang {
    
    private String nama;
    private String nik;
    private int umur;

    public Penumpang(String nama, String nik, int umur) {
        this.nama = nama;
        this.nik = nik;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public int getUmur() {
        return umur;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}