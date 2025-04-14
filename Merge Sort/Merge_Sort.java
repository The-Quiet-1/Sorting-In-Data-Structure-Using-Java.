/*
 * This Java program implements the Merge Sort algorithm, which follows the divide-and-conquer approach
 * to sort an array of integers. The algorithm works by recursively dividing the array into halves,
 * sorting each half, and then merging the sorted halves back together.
 */

//package Sorting;

import java.util.Scanner;

class Merge {
    /*
     * The Divide method recursively splits the array into two halves until each subarray
     * contains only one element (base case). Then it calls the Conquer method to merge them.
     *
     * array The array to be sorted
     * start The starting index of the current sub-array
     * end The ending index of the current sub-array
     */
    public void Divide(int array[], int start, int end) {
        // Base case: if the sub-array has 0 or 1 elements, it's already sorted
        if (start >= end) {
            return;
        }

        // Calculate the middle point to divide the array into two halves
        // Using start + (end-start)/2 instead of (start+end)/2 to avoid potential overflow
        int mid = start + (end - start) / 2;

        // Recursively divide the left half of the array
        Divide(array, start, mid);

        // Recursively divide the right half of the array
        Divide(array, mid + 1, end);

        // Merge the two sorted halves
        Conquer(array, start, mid, end);
    }

    /*
     * The Conquer method merges two sorted sub-arrays into a single sorted array.
     *
     * array The original array being sorted
     * start The starting index of the first sub-array
     * mid The ending index of the first sub-array (mid+1 starts the second sub-array)
     * end The ending index of the second sub-array
     */
    public void Conquer(int array[], int start, int mid, int end) {
        // Create a temporary array to store the merged result
        int[] NewArray = new int[end - start + 1];

        // Initialize pointers for the two sub-arrays and the merged array
        int start1 = start;      // Pointer for the left sub-array
        int end1 = mid + 1;      // Pointer for the right sub-array
        int x = 0;               // Pointer for the merged array

        // Merge the two sub-arrays by comparing elements
        while (start1 <= mid && end1 <= end) {
            if (array[start1] < array[end1]) {
                // If left element is smaller, add it to the merged array
                NewArray[x] = array[start1];
                x++;
                start1++;
            } else {
                // If right element is smaller or equal, add it to the merged array
                NewArray[x] = array[end1];
                x++;
                end1++;
            }
        }

        // Copy any remaining elements from the left sub-array
        while (start1 <= mid) {
            NewArray[x] = array[start1];
            x++;
            start1++;
        }

        // Copy any remaining elements from the right sub-array
        while (end1 <= end) {
            NewArray[x] = array[end1];
            x++;
            end1++;
        }

        // Copy the merged elements back to the original array
        for (int i = 0, j = start; i < NewArray.length; i++, j++) {
            array[j] = NewArray[i];
        }
    }
}

public class Merge_Sort {
    /*
     * The main method handles user input and demonstrates the merge sort algorithm.
     * It collects array elements from the user, displays the unsorted array,
     * performs the sort, and then displays the sorted array.
     */
    public static void main(String[] args) {
        int n, i;
        int[] array;
        Scanner get = new Scanner(System.in);

        System.out.println();

        // Get the number of elements to sort from the user
        System.out.print("Number Of Element You Want to Sort: ");
        n = get.nextInt();

        // Initialize the array with the specified size
        array = new int[n];

        // Collect array elements from the user
        System.out.println("Input Elements In An Array:---");
        for (i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " Element: ");
            array[i] = get.nextInt();
        }
        System.out.println("-----------------------------------");

        // Display the unsorted array
        System.out.println("UnSorted Data Are---");
        for (i = 0; i < n; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        System.out.println("-----------------------------------");

        // Create Merge object and sort the array
        Merge obj = new Merge();
        obj.Divide(array, 0, n - 1);

        // Display the sorted array
        System.out.println("Data Are Sorted Using Merge Sort");
        for (i = 0; i < n; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        System.out.println("-----------------------------------");
    }
}
