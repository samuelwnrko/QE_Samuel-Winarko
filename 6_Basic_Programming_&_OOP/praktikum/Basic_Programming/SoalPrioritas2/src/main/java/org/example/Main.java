package org.example;
public class Main {
    public static void main(String[] args) {
        drawXYZ(5); //untuk input height awal pada nomor 1
        printAsterisk(5);//untuk input awal pada segitiga nomor 2
    }
    public static void drawXYZ(int n) {
        System.out.println("Nomor 1");
        for (int i = 1; i <= n*n; i++) {
            if (i%3 == 0) {
                System.out.print("X"); // untuk setiap kelipatan 3
            } else if (i%2 == 1) {
                System.out.print("Y"); // untuk setiap bilangan ganjil
            } else {
                System.out.print("Z"); // untuk setiap bilangan genap
            }
            //setelah kelipatan 5 akan melakukan enter ke baris baru
            if (i%n == 0) {
                System.out.println();
            }
        }
    }
    public static void printAsterisk(int z) {
        System.out.println("\nNomor 2");
        for (int i = 1; i <= z; i++) {
            //looping yang digunakan untuk spasi pada bintang.
            for (int j = z; j >= i; j--) {
                System.out.print(" ");
            }

            //looping yang digunakan untuk bintang setiap baris dan spasi setelah bintang tersebut.
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // untuk baris baru pada setiap baris yang sudah selesai
            System.out.println();
        }
    }
}