package org.example;

import org.example.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        //set nama, deskripsi, harga, dan jumlah stok coffee
        product.setNama("coffee");
        product.setDeskripsi("this is coffee");
        product.setHarga(15000);
        product.setJumlahStok(10);
        product.getInfo(); //menampilkan info coffee

        //set nama, deskripsi, harga, dan jumlah stok milk
        product.setNama("milk");
        product.setDeskripsi("this is fresh milk");
        product.setHarga(25000);
        product.setJumlahStok(10);
        product.getInfo(); //menampilkan info milk

        //set nama, deskripsi, harga, dan jumlah stok apple juice
        product.setNama("apple juice");
        product.setDeskripsi("this is juice");
        product.setHarga(18000);
        product.setJumlahStok(20);
        product.getInfo(); //menampilkan info apple juice
    }
}