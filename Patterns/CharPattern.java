import java.util.*;

/*Output -: input is 4
    A   
    BC  
    DEF 
    GHIJ
*/

public class CharPattern {
    public static void main (String args[]){
        int n =4;
        char ch = 'A';

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }

    }
    
}

