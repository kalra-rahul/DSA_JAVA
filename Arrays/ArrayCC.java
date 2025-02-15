import java.util.*;

public class ArrayCC {

    public static int getLargest(int arr[]){
        int largeNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largeNum){
                largeNum = arr[i];
            }
        }
        return largeNum;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,6,4,5,7};
        int result = getLargest(arr);
        System.out.println(result);
    }
    
}
