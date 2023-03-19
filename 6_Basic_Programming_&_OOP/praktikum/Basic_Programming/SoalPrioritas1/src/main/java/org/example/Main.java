package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Nomor 1
        System.out.println("Nomor 1");
        //Segitiga
        float alas = 20; //input alas segitiga
        float tinggi = 25; //input tinggi segitiga
        double luassegitiga = 0.5 * (alas * tinggi); //rumus luas segitiga
        System.out.println("Luas Segitiga : " + luassegitiga); //print output luas segitiga

        //Persegi Panjang
        float panjang = 40; //input panjang dari persegi panjang
        float lebar = 6; //input lebar persegi panjang
        double luaspersegipanjang = panjang * lebar; //rumus luas persegi panjang
        System.out.println("Luas Persegi Panjang : " + luaspersegipanjang); //output luas persegi panjang

        //Lingkaran
        double jari2 = 7; //input jari-jari lingkaran
        double luaslingkaran = 3.14 * (jari2 * jari2); //rumus luas lingkaran
        System.out.println("Luas Lingkaran : " + luaslingkaran); ////output luas lingkaran

        //Nomor 2
        System.out.println("\nNomor 2");
        System.out.print("Harga Beli : "); //memasukkan harga beli
        int hargabeli = input.nextInt();
        System.out.print("Harga Jual : "); //memasukkan harga jual
        int hargajual = input.nextInt();

        if (hargabeli < hargajual) {
            System.out.println("Untung sebesar : " + (hargajual - hargabeli)); //jika harga beli lebih besar dari harga jual
        } else if (hargabeli > hargajual) {
            System.out.println("Rugi sebesar : " + (hargajual - hargabeli)); //jika harga jual lebih besar dari harga beli
        } else {
            System.out.println("Sama saja"); //jika harga beli setara dengan harga jual
        }
    }
}