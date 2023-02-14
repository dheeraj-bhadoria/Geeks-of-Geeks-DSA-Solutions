package com.dheeraj.dsaproblems;

import java.util.ArrayList;

public class SubArraySum {

     /**
     * https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&sortBy=submissions
     *
     * Given an unsorted array A of size N that contains only non-negative integers,
     * find a continuous sub-array which adds to a given number S and return the left
     * and right index(1-based indexing) of that subarray.
     *In case of multiple subarrays, return the subarray indexes
     * which comes first on moving from left to right.

     * Note:- Both the indexes in the array should be according to 1-based indexing.
     * You have to return an arraylist consisting of two elements left and right.
     * In case no such subarray exists return an array consisting of element -1.
      *
      *
      * ///////////////////////////////////////////////////////////////////////
      *
      * Explanation:
      *
      * First, we initialize the left pointer to 0, right pointer to 0, and a variable sum to keep track of the sum of the elements in the current subarray.
      * Then, we use a while loop to iterate right pointer from 0 to n-1. At each iteration, we add the value at the current right pointer to the sum.
      * After adding the value, we check if the sum is greater than s. If it is,
      * we move the left pointer one step to the right and subtract the value at the new left position from the sum. We repeat this process until sum is no longer greater than s.
      * If sum is equal to s, we add the left + 1 and right + 1 (since we are using 1-based indexing) to the result ArrayList and return it.
      * If right pointer reaches n-1 and no subarray with sum s is found, we add -1 to the result ArrayList and return it.
     */

    public static ArrayList<Integer> subarraySum(int[] nums, int s) {
        int n = nums.length;
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0, right = 0, sum = 0;

        while (right < n) {
            sum += nums[right];

            while (sum > s && left <= right) {
                sum -= nums[left++];
            }

            if (sum == s) {
                result.add(left + 1);
                result.add(right + 1);
                return result;
            }

            right++;
        }

        result.add(-1);
        return result;
    }

}
