/*Output -: input is 4
    *****
    *   *
    *   *
    *****
*/

// Help : We need to print only the boundary stars, displaying stars only in the first and last rows and columns.

public class HollowRectangle {
    public static void hollow_rectangle(int totRows, int totCols){
        for(int i = 1; i <=totRows; i++){
            for(int j=1; j<=totCols; j++){
                if((i == 1 || i == totRows) || (j==1 || j==totCols)){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String args[]){
        hollow_rectangle(4,5);
    }
}
