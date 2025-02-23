package Sorting;

import java.util.Arrays;

public class QuickSort {

    public static int quickSortingPartition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; //to make place smaller than pivot
        System.out.println(Arrays.toString(arr));
        while (si<=ei) {
            if(arr[si] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[si];
                arr[si] = temp;

            }
            si++; 
            System.out.println(Arrays.toString(arr));
        }
        return i;
    }



    public static void quickSorting(int arr[], int si, int ei){
        System.out.println(si + " " + ei);
        if(si >= ei){
            return;
        }

        int pIdx = quickSortingPartition(arr,si,ei);
        quickSorting(arr,si,pIdx-1);
        quickSorting(arr,pIdx+1,ei);
    }

    public static void main(String args[]){
        // int arr[] = {5,4,1,3,2};
        int arr[] = {1,4,5,2,3};
        quickSorting(arr,0,arr.length-1);
        //System.out.println(Arrays.toString(arr));
    }
    
}
