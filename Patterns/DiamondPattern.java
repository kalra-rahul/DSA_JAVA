/*Output -: input is 4
   *   
  ***  
 ***** 
*******
*******
 ***** 
  ***  
   *   
*/


public class DiamondPattern {

    public static void main(String args[]){

        int n= 4;

        for (int i=1; i<=n; i++) {
            //Print n-i space
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //Print 1,3,5,7 (2i-1)

            for (int k=1; k<=2*i-1; k++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        for (int i=n; i>=1; i--) {
            //Print n-i space
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //Print 1,3,5,7 (2i-1)

            for (int k=1; k<=2*i-1; k++) {
                System.out.print("*");
            }

            System.out.println("");
        }

         

        //Print 1,3,5,7 (2n-1)

        //Reverse Pattern

    }
    
}
