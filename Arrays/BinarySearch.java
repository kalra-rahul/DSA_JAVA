public class BinarySearch {

    public static void main(String args[]){
        int result = -1;
        int arr[] = {1,2,3,4,5,6,7};
        int target = 5;

        int start = 0;
        int end = arr.length-1;

        while (start<=end) {

            int mid = (start+end)/2;

            System.out.print(mid);

            if(arr[mid] == target){
                result = mid;
                break;
            }

            if(arr[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        System.out.print(result);
    }
    
}
