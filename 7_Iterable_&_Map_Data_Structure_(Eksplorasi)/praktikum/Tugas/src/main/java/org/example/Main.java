package org.example;

import java.util.Arrays;
import static org.example.utils.Tugasno1.joinArrays;
import static org.example.utils.Tugasno2.*;
import static org.example.utils.Tugasno3.*;
import static org.example.utils.Tugasno4.*;
import static org.example.utils.Tugasno5.*;
import static org.example.utils.Tugasno6.*;

public class Main {


    public static void main(String[] args) {
        String[] arr1 = {"kazuya", "jin", "lee"};
        String[] arr2 = {"kazuya", "feng"};

        String[] arr3 = {"lee", "jin"};
        String[] arr4 = {"kazuya", "panda"};

        //soal1
        System.out.println("Soal nomor 1");
        String[] tugasno1Input1 = joinArrays(arr1, arr2);
        System.out.println(Arrays.toString(tugasno1Input1));
        String[] tugasno1Input2 = joinArrays(arr3, arr4);
        System.out.println(Arrays.toString(tugasno1Input2));

        //soal2
        System.out.println("\nSoal nomor 2");
        String input1 = "76523752";
        System.out.println(uniqueNumbers(input1));
        String input2 = "1122";
        System.out.println(uniqueNumbers(input2));

        //soal3
        System.out.println("\nSoal nomor 3");
        int[] tugasno3input1 = {1, 2, 3, 4, 5, 6};
        int target = 6;
        System.out.println(Arrays.toString(findPair(tugasno3input1, target)));
        int[] tugasno3input2 = {2, 5, 9, 11};
        int target2 = 11;
        System.out.println(Arrays.toString(findPair(tugasno3input2, target2)));

        //soal4
        System.out.println("\nSoal nomor 4");
        int[] arra1 = {1, 2, 3, 4};
        int[] arra2 = {1, 3, 5, 10, 16};
        int[] result1 = arrayUnique(arra1, arra2);
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i != result1.length - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
        int[] arra3 = {3, 8};
        int[] arra4 = {2, 8};
        int[] result2 = arrayUnique(arra3, arra4);
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i != result2.length - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
        //soal5
        System.out.println("\nSoal nomor 5");
        int[] nums = {2, 3, 3, 3, 6, 9, 9};
        int length = removeDuplicates(nums);
        System.out.println("" + length);

        int[] nums2 = {2, 2, 2, 11};
        int length2 = removeDuplicates(nums2);
        System.out.println("" + length2);

        //soal6
        System.out.println("\nSoal nomor 6");
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int maxSum = findMaxSumSubArray(arr, k);
        System.out.println("" + maxSum);
        int[] array2 = {2, 3, 4, 1, 5};
        int k2 = 2;
        int maxSum2 = findMaxSumSubArray(array2, k2);
        System.out.println("" + maxSum2);
    }
}