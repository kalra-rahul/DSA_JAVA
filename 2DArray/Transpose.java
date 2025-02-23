import java.util.Arrays;

public class Transpose {
    public static void TransposeEvenMatrix(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //System.out.println(Arrays.deepToString(matrix));
        //OR
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        
    }

    public static void TransposeOddMatrix(int matrix[][]){
        int n = matrix[0].length;
        int m = matrix.length;
        int transpose[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        //System.out.println(Arrays.deepToString(matrix));
        //OR
        for (int[] row : transpose) {
            System.out.println(Arrays.toString(row));
        }
        
    }


    public static void main(String args[]){
        // int matrix[][]= {
        //     {1,2,3,4},
        //     {5,6,7,8},
        //     {9,10,11,12},
        //     {13,14,15,16}
        // };
        // TransposeEvenMatrix(matrix);

        int matrix[][]= {
            {1,2,3},
            {4,5,6}
        };
        TransposeOddMatrix(matrix);
    }
}
