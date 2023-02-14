package com.dheeraj.dsaproblems;

public class SortArrayOf01and2 {

    /**
     *
     * The problem of sorting an array containing only 0s, 1s, and 2s can be easily solved by using two pointer approach. The algorithm is as follows:
     *
     * Initialize two pointers low and high to the beginning and end of the array, respectively.
     *
     * Start a loop from low to high and at each iteration:
     *
     * If the current element is 0, swap it with arr[low] and increment both low and the current index.
     * If the current element is 2, swap it with arr[high] and decrement high.
     * If the current element is 1, do nothing and increment the current index.
     * After the loop, the array is sorted in ascending order.
     *
     */

    public void sortArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int i = 0;
        while (i <= high) {
            if (arr[i] == 0) {
                swap(arr, i, low);
                low++;
                i++;
            } else if (arr[i] == 2) {
                swap(arr, i, high);
                high--;
            } else {
                i++;
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    /**
     * In this code, we initialize two pointers low and high to the beginning and end of the array, respectively.
     * Next, we use a loop to iterate through the array and perform the appropriate action based on the value of the current element.
     * If the current element is 0, we swap it with arr[low] and increment both low and the current index.
     * If the current element is 2, we swap it with arr[high] and decrement high. If the current element is 1, we do nothing and increment the current index. After the loop, the array is sorted in ascending order.
     */
}

