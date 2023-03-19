package org.example.utils;

import java.util.ArrayList;
import java.util.List;
public class Tugasno4 {
    public static int[] arrayUnique(int[] arra1, int[] arra2) {
        List<Integer> uniqueArr = new ArrayList<Integer>();
        for (int i = 0; i < arra1.length; i++) {
            if (!contains(arra2, arra1[i]) && !uniqueArr.contains(arra1[i])) {
                uniqueArr.add(arra1[i]);
            }
        }
        return uniqueArr.stream().mapToInt(i -> i).toArray();
    }

    private static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
