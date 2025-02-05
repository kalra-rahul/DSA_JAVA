/*Output -: input is 4
    *      *
    **    **
    ***  ***
    ********
    ********
    ***  ***
    **    **
    *      *
*/


public class ButterflyPattern {
    public static void main(String args[]){

        int n = 5;

        for (int i = 1; i <= n; i++) {
            //Ist print Left Pattern 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //2nd print Left Pattern  space
            for (int k = 1; k <= 2*(n-i); k++) {
                System.out.print(" ");
            }

            //2nd Pattern 
            for (int l = 1; l<=i; l++) {
                System.out.print("*");
            }


            System.out.println("");
            
        }

        for (int i = n; i >=1; i--) {
             //Ist print Left Pattern 
             for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //2nd print Left Pattern  space
            for (int k = 1; k <= 2*(n-i); k++) {
                System.out.print(" ");
            }

            //2nd Pattern 
            for (int l = 1; l<=i; l++) {
                System.out.print("*");
            }


            System.out.println("");
        }

    }
    
}
