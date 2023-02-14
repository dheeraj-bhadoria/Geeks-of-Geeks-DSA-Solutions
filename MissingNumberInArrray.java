package com.dheeraj.dsaproblems;

public class MissingNumberInArrray {

    /**
     * Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
     *
     * In this code, we first calculate the expected sum of all the elements from 1 to N using the formula n * (n + 1) / 2.
     * Then, we calculate the actual sum of the elements in the given array by iterating through it and adding each element to the actualSum variable.
     * Finally, we subtract the actualSum from the expectedSum to get the missing element.
     */


    public int findMissingElement(int[] nums) {
        int n = nums.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

}
