package com.dheeraj.dsaproblems;

import java.util.Arrays;

public class MinNumberOfJump {
    /**
     * Given an array of N integers arr[] where each element represents the maximum length of the jump that can be made forward from that element.
     * This means if arr[i] = x, then we can jump any distance y such that y ≤ x.
     * Find the minimum number of jumps to reach the end of the array (starting from the first element).
     * If an element is 0, then you cannot move through that element.
     */


    /**
     *
     * The problem of finding the minimum number of jumps to reach the end of an array can be solved using dynamic programming.
     * The algorithm is as follows:
     * Initialize an array jumps with size N (size of the given array) with the values INT_MAX (maximum value of an integer).
     * Set jumps[0] to 0 as the starting position is already reached.
     * Start a loop from 0 to N-1, where N is the size of the given array.
     * At each iteration of the loop, update the value of jumps[i] as the minimum of jumps[i] and jumps[j] + 1,
     * where j is the maximum value such that j + arr[j] >= i and jumps[j] ≠ INT_MAX.
     * Return the value of jumps[N-1] if it is not equal to INT_MAX, otherwise return -1.
     */
    public int findMinJumps(int[] arr) {
        int n = arr.length;
        int[] jumps = new int[n];
        Arrays.fill(jumps, Integer.MAX_VALUE);
        jumps[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE) {
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                    break;
                }
            }
        }
        return jumps[n - 1] != Integer.MAX_VALUE ? jumps[n - 1] : -1;
    }

    /**
     * In this code, we initialize an array jumps with size N and set its values to INT_MAX.
     * We then set jumps[0] to 0 as the starting position is already reached.
     * Next, we use a loop to iterate through the given array and update the value of jumps[i] as the minimum of jumps[i] and jumps[j] + 1,
     * where j is the maximum value such that j + arr[j] >= i and jumps[j] ≠ INT_MAX. Finally,
     * we return the value of jumps[N-1] if it is not equal to INT_MAX, otherwise return -1.
     */
}
