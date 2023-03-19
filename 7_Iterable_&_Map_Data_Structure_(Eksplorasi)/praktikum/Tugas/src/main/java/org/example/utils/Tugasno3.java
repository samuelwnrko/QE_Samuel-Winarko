package org.example.utils;

public class Tugasno3 {
    public static int[] findPair(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while (left<right){
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target){
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }

}
