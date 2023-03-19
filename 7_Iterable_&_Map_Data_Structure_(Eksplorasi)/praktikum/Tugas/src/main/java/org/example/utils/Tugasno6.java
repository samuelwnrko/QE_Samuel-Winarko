package org.example.utils;

public class Tugasno6 {
    public static int findMaxSumSubArray(int[] arr, int k) {
        int maxSum = 0;
        int currentSum = 0;
        int start = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (i >= k - 1) {
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                currentSum -= arr[start];
                start++;
            }
        }

        return maxSum;
    }

}
