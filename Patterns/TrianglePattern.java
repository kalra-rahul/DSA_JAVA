public class TrianglePattern {
    public static void main(String args[]){
        int n = 4;
        for(int i=1; i<=n; i++){
            //Print Space
            for(int j=1; j<=n-i; j++){
               System.out.print(" ");
            }

            //Print Star Pattern
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }

            //Print Next Star Pattern
            for (int m = 1; m < i; m++) {
                System.out.print("*");
            }

            System.out.println("");
        }
        
    }
}

//    *              
//   ***
//  *****
// *******

// 1 3 1  0
// 2 2 2  1
// 3 1 3  2
// 4 0 4  3
