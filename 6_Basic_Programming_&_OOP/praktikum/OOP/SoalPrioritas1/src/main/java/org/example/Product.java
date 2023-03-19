package org.example;

public class Product { //class bernama Product
    //atribut nama, deskripsi, harga, dan jumlah stok
    private String nama;
    private String deskripsi;
    private Integer harga;
    private Integer jumlahStok;

    //method getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getJumlahStok() {
        return jumlahStok;
    }

    public void setJumlahStok(Integer jumlahStok) {
        this.jumlahStok = jumlahStok;
    }
    public void getInfo() { //method getInfo
        System.out.println("===");
        System.out.println("INFO PRODUK");
        System.out.println("nama: " +getNama());
        System.out.println("deskripsi: "+getDeskripsi());
        System.out.println("harga: "+getHarga());
        System.out.println("jumlah stok: "+getJumlahStok());
        System.out.println("===");
    }
}
