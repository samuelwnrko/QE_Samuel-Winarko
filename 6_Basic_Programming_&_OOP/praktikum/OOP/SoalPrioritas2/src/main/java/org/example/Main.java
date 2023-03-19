package org.example;

import org.example.Calculator;
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        //memasukkan x dan y untuk output masing-masing
        System.out.println("Penjumlahan :"+calculator.add(3,4));
        System.out.println("Pengurangan :"+calculator.substract(15,4));
        System.out.println("Perkalian :"+calculator.multiply(10,10));
        System.out.println("Pembagian :"+calculator.divide(12,3));
    }
}