package com.rplbo.uasprojectpos;

public class Barang {
    private String kode;
    private int stok;
    private int nextNum;
    private String nama;
    private long harga;
    public Barang(String kode,int stok,int nexNum,String nama,long harga){
        this.harga =harga;
        this.kode =kode;
        this.nextNum =nexNum;
        this.stok=stok;

    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getStok() {
        return stok;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public long getHarga() {
        return harga;
    }
}
