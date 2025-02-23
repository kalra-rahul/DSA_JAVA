import java.util.Arrays;

public class EvenArraySort {

    //Input [3,1,2,4] // output [2,4,1,3] [4,2,3,1]

    public static void main(String args[]){

        int arr[] = {3,1,2,4};

        int start = 0;
        int end = arr.length-1;

        int oddPoint = arr.length-1;

        while(start < end && start < oddPoint){
            if(arr[start] % 2 == 0){
                start++;
            }else{
                int temp = arr[oddPoint];
                arr[oddPoint] = arr[start];
                arr[start] = temp;
                oddPoint--;
            }
            System.out.println(Arrays.toString(arr));
        }

        

    }
    
}
