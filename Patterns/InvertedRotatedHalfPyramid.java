/*Output -: input is 5
        *
       **
      ***
     ****
    *****
*/

/*Output 2-: input is 5
    **    
   ****   
  ******  
 ******** 
**********
*/


public class InvertedRotatedHalfPyramid {

    public static void main(String[] args) {
        inverted_pattern_two(5);
    }

    public static void inverted_pattern_ist(int n){
        for(int i=1; i<=n; i++) {
            for(int j=5; j>=1; j--) {
                if(j <= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void inverted_pattern_two(int n) {
        //Ist we print space then *
        // Space cal by n-i (i = ist loop value)
        for (int i = 1; i <=n; i++) {

            //Ist Pyramid

            //Print space
            for (int j = 1; j <= n-i; j++) {
                 System.out.print(" ");
            }

            //Print Star
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }


            //2nd Pyramid --If required

            //Print star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
           }

           //Print space
           for (int k = 1; k <= n-i; k++) {
               System.out.print(" ");
           }
            System.out.println("");
        }
    }    
    
}
