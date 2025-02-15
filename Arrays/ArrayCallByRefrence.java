//In java Array work as call by refrence

import java.util.*;

public class ArrayCallByRefrence {

    public static void updateByRefrence(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]+1;
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        System.out.println("Intial Val=== " + Arrays.toString(arr));
        updateByRefrence(arr);
        System.out.println("Final Val=== " +Arrays.toString(arr));
    }
    
}
