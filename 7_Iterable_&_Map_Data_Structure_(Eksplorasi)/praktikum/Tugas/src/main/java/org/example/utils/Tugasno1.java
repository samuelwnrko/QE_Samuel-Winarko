package org.example.utils;

public class Tugasno1 {
    public static String[] joinArrays(String[] arr1, String[] arr2){
        //membuat array baru dari array 1 + array 2
        String[] arr1plus2 = new String[arr1.length + arr2.length];
        //panjang array tanpa duplikat
        int lengthNoDuplicate = 0;

        //masukkan array1 ke array 1 plus 2
        for (int i = 0; i < arr1.length; ++i){
            arr1plus2[lengthNoDuplicate] = arr1[i];
            ++lengthNoDuplicate;
        }

        //cek elemen array2 apakah ada yg terduplikat pada array 1
        //kemudian masukkan array2 yang tidak ada duplikat ke array 1plus2
        for (int i = 0; i < arr2.length; ++i){
            boolean isDuplicate = false;

            for (int j = 0; j < arr1.length; ++j){
                if (arr2 [i].equals(arr1[j])){
                    isDuplicate= true;
                    break;
                }
            }
            if (!isDuplicate){
                arr1plus2[lengthNoDuplicate] = arr2[i];
                ++lengthNoDuplicate;
            }
        }
        // buat array baru dengan panjang array 1 plus 2 tanpa duplikat
        String[] newStringNoDuplicate = new String[lengthNoDuplicate];

        //masukan elemen array 1 plus 2 ke array baru tanpa duplikat
        for (int i = 0; i < lengthNoDuplicate; ++i){
            newStringNoDuplicate[i] = arr1plus2[i];
        }
        //kembalikan array baru tanpa duplikat
        return newStringNoDuplicate;
    }
}
