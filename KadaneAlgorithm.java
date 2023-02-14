package com.dheeraj.dsaproblems;

public class KadaneAlgorithm {

    /**
     * Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
     */


    /**
     * The problem of finding the contiguous sub-array with the maximum sum can be solved using the Kadane's algorithm. The algorithm is as follows:
     * Initialize two variables maxSum and currentSum to INT_MIN (minimum value of an integer).
     * Start a loop from 0 to N-1, where N is the size of the given array.
     * At each iteration of the loop, update the value of currentSum as currentSum + arr[i]. If currentSum becomes negative, set it to 0.
     * Update the value of maxSum as the maximum of maxSum and currentSum.
     * Return the value of maxSum.
     *
     */


    public int findMaxSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }


    /**
     * In this code, we initialize maxSum and currentSum to INT_MIN and use a loop to iterate through the given array.
     * At each iteration, we update the value of currentSum as currentSum + arr[i] and update the value of maxSum as the maximum of maxSum and currentSum.
     * If currentSum becomes negative, we set it to 0 as a negative currentSum will not contribute to the maximum sum. Finally, we return the value of maxSum.
     */

}
