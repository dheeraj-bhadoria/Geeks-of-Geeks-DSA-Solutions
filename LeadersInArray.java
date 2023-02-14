package com.dheeraj.dsaproblems;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    /**
     * Given an array A of positive integers. Your task is to find the leaders in the array.
     * An element of array is leader if it is greater than or equal to all the elements to its right side.
     * The rightmost element is always a leader.
     *
     * Constraints:
     * 1 <= n <= 107
     * 0 <= Ai <= 107
     */



    /**
     * To find the leaders in an array, we can use a loop to iterate through the array from right to left.
     * We keep track of the maximum element found so far in a separate variable max.
     * Whenever we encounter an element that is greater than or equal to max, we add it to a list of leaders and update max with the current element.
     *
     *
     * Explanation:
     *
     * We start by initializing the variable max with the minimum value that an integer can take, Integer.MIN_VALUE.
     * We also create an empty ArrayList to store the leaders.
     * Then, we start a for loop that runs from the end of the array (the rightmost element) to the start of the array.
     * In each iteration, we check if the current element is greater than or equal to the max variable.
     * If it is, we add it to the list of leaders and update max to be the current element.
     * Finally, we return the list of leaders.
     *
     * Note: The rightmost element of the array is always a leader, so it will be added to the list of leaders in the first iteration of the loop.
     */

    public static List<Integer> leaders(int[] A) {
        int max = Integer.MIN_VALUE;
        List<Integer> leaders = new ArrayList<>();

        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] >= max) {
                max = A[i];
                leaders.add(A[i]);
            }
        }

        return leaders;
    }
}
