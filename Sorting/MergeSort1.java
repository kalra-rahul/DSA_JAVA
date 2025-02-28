package Sorting;

import java.util.Arrays;

public class MergeSort1 {

    public static int[] spliceArray(int arr[], int start, int end){
       int length = end-start+1; 
       int sarr[] =  new int[length];
       
       int j =0;
       while(start<=end){
        sarr[j] = arr[start];
        j++; start++;
       }
       return sarr;
    }

    public static int[] merge(int[] leftArr, int[] rightArr){
        int length = leftArr.length+rightArr.length;

        int result[] = new int[length];

        int i=0, j=0, k=0;

        while(i<leftArr.length && j<rightArr.length){
            if(leftArr[i] < rightArr[j]){
                result[k] = leftArr[i];
                i++;k++;
            }else{
                result[k] = rightArr[j];
                j++;k++;
            }
        }

        while(i<leftArr.length){
            result[k] = leftArr[i];
            i++;k++;
        }

        while(j<rightArr.length){
            result[k] = rightArr[j];
            j++;k++;
        }
        
        return result;
    }


    public static int[] mergeSorting(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int mid = arr.length/2;
        int leftArr[] = spliceArray(arr, 0, mid - 1);  // Fix: Left half should be [0, mid-1]
        int rightArr[] = spliceArray(arr, mid, arr.length - 1);  // Fix: Right half starts from mid
        return merge(mergeSorting(leftArr),mergeSorting(rightArr));
    }

    



    public static void main(String args[]){
        int arr[] = {5,3,4,2,1};
        //int arr[] = {3,4,5,1,2};
        int[] result = mergeSorting(arr);
        System.out.println(Arrays.toString(result));
    }
    
}
