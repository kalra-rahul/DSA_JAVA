package Sorting;

import java.util.Arrays;

public class MergeSort2 {

    public static int[] mergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return arr;
        }
        int mid = (si+(ei-si)/2);
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
        return arr;
    }

    public static int[] merge(int arr[], int si, int mid, int ei){
        int length = ei-si+1;
        int mergeArr[] = new int[length];

        int i=si, j=mid+1, k=0;

        while (i<=mid && j<=ei) {
            if(arr[i] < arr[j]){
                mergeArr[k] = arr[i];
                i++;k++;
            }else{
                mergeArr[k] = arr[j];
                j++;k++;
            }
        }

        while (i<=mid) {
            mergeArr[k] = arr[i];
            i++;k++;
        }

        while (j<=ei) {
            mergeArr[k] = arr[j];
            j++;k++;
        }

        System.out.println(Arrays.toString(mergeArr));

        return mergeArr;
    }

    public static void main(String args[]){
        // int arr[] = {5,4,1,3,2};
        int arr[] = {1,4,5,2,3};
        mergeSort(arr,0,arr.length-1);
    }
    
}
