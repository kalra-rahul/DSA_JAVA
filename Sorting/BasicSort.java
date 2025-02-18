package Sorting;

import java.util.*;

public class BasicSort {

    public static void BubbleSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(i);
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    } 

    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    } 

    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int ci = i;
            while(ci > 0 && arr[ci] > arr[ci-1]){
                int temp = arr[ci];
                arr[ci] = arr[ci-1];
                arr[ci-1] = temp;
                ci--;
            }
        }
        System.out.println(Arrays.toString(arr));
    } 

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = (largest < arr[i]) ? arr[i] : largest;
        }

        int count[] = new int[largest+1];

        for(int num : arr){
            count[num]++;
        }

        int ci = 0;
        int ai = 0;

        while(ci < count.length && ai < arr.length){
            if(count[ci] == 0){
               ci++;
            }else{
                arr[ai] = ci;
                count[ci]--;
                ai++;
            }
        }

        System.out.println(Arrays.toString(arr));
    } 

    public static void countingSort2(int arr[]){
        if (arr.length == 0) return;

        // Step 1: Find the max value in the array
        int max = Arrays.stream(arr).max().getAsInt();

        // Step 2: Create a count array to store frequency of each element
        int[] count = new int[max + 1];

        for (int num : arr) {
            count[num]++;
        }

        // Step 3: Modify count array to store the cumulative frequency
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        System.out.println(Arrays.toString(count));
        // Step 4: Create the output array
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) { // Stable sorting (traverse from right)
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;  // Decrease count for next occurrence
            System.out.println(Arrays.toString(output));
        }

        //System.out.println(Arrays.toString(output));
    }


    public static void main(String args[]){
        int arr[] = {5,1,3,2,4,4};
        //BubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        countingSort2(arr);
    } 
}
