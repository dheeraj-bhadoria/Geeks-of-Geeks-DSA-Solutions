package com.dheeraj.dsaproblems;

public class KthSmallestElement {

    /**
     * Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array.
     * It is given that all array elements are distinct.
     *
     * Expected Time Complexity: O(n)
     * Expected Auxiliary Space: O(log(n))
     * Constraints:
     * 1 <= N <= 105
     * 1 <= arr[i] <= 105
     * 1 <= K <= N
     */


    /**
     * Explanation:
     *
     * The kthSmallest function is the main function that takes an array arr and an integer k as input and returns the Kth smallest element in the array.
     * The quickSelect function is a helper function that uses the QuickSelect algorithm to find the Kth smallest element in a subarray defined by the start and end indices.
     * In the quickSelect function, we start by selecting the last element as the pivot.
     * Then, we use two pointers left and right to partition the array into two parts: elements that are less than the pivot and elements that are greater than or equal to the pivot.
     * We swap elements in the array until the left pointer is equal to the right pointer, which means that the pivot is in its final position.
     * Then, we swap the pivot with the element at the left pointer.
     * If the k index is equal to the left pointer, we return the pivot.
     * If k is less than the left pointer, we recursively call the quickSelect function on the subarray to the left of the pivot.
     * If k is greater than the left pointer, we recursively call the quickSelect function on the subarray to the right of the pivot.
     */

    public static int kthSmallest(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, k - 1);
    }

    private static int quickSelect(int[] arr, int start, int end, int k) {
        int pivot = arr[end];
        int left = start;
        int right = end;

        while (true) {
            while (arr[left] < pivot && left < right) {
                left++;
            }

            while (arr[right] >= pivot && left < right) {
                right--;
            }

            if (left == right) {
                break;
            }

            swap(arr, left, right);
        }

        swap(arr, left, end);

        if (k == left) {
            return arr[k];
        } else if (k < left) {
            return quickSelect(arr, start, left - 1, k);
        } else {
            return quickSelect(arr, left + 1, end, k);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
