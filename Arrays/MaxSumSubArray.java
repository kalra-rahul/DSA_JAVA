import java.util.*;

//Input : {2,4,6,8,10};
//Output : 30

public class MaxSumSubArray {

    public static void bruteForce(int[] arr){
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int tempSum = 0;
            for (int j = i; j < arr.length; j++) {
                tempSum = tempSum + arr[j];
            }
            if(tempSum > maxSum){
                maxSum = tempSum;
            }
        }
        System.out.println(maxSum);
    }


    public static void  MaxSumKadaneAlg(int arr[]){
        int MAX_SUM = Integer.MIN_VALUE;
        int CURR_SUM = 0;

        for (int i = 0; i < arr.length; i++) {
            CURR_SUM = CURR_SUM + arr[i];

            if(CURR_SUM < 0){
                CURR_SUM = 0; 
            }
 
            MAX_SUM = Math.max(MAX_SUM, CURR_SUM);
        }
        System.out.println(MAX_SUM);
    }

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        bruteForce(arr);
        MaxSumKadaneAlg(arr);
    }
    
}
