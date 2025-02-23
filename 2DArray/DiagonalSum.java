

public class DiagonalSum {

    public static void DiagonalSum(int matrix[][]){
        int sum = 0;

        //ist Diagonal
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i==j){
                    sum += matrix[i][i];
                }
                else if(i+j+1 == matrix.length){
                    sum += matrix[i][i];
                }
            }
        }
         
        System.out.println(sum);
        
    }


    public static void main(String args[]){
        int matrix[][]= {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        DiagonalSum(matrix);
    }
    
}
