package com.dheeraj.dsaproblems;

import java.util.HashMap;

public class majorityElement {

    /**
     *
     * Given an array A of N elements. Find the majority element in the array.
     * A majority element in an array A of size N is an element that appears more than N/2 times in the array.
     *
     * Constraints:
     * 1 ≤ N ≤ 107
     * 0 ≤ Ai ≤ 106
     */

    /**
     * One approach to solve this problem is to use a HashMap to store the count of each element in the array.
     * Then, we iterate through the HashMap and check if the count of any element is greater than N/2.
     * If yes, then that element is the majority element.

     */


    /**
     * Explanation:
     *
     * We create a HashMap map to store the count of each element in the array.
     * We iterate through the array nums and add the count of each element in the HashMap.
     * We then iterate through the key set of the HashMap and check if the count of any element is greater than N/2.
     * If yes, then we return that element as the majority element.
     * If no majority element is found, we return -1.
     *
     */
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int num : map.keySet()) {
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }
        return -1;
    }

}
