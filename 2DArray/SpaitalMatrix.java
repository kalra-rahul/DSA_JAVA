//Output : 1 2 3 4 8 12 11 10 9 5 6 7 
public class SpaitalMatrix {

    public static void PrintSprialMatrix(int matrix[][]){
        int startRow = 0;
        int endRow = matrix.length-1;

        int startCol = 0;
        int endCol = matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            //TopRow
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            //Right Row
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            //Bottom Row
            for (int j = endCol-1; j >=startCol; j--) {
                if(startRow == endRow) break;
                System.out.print(matrix[endRow][j] + " ");
            }

            //Left Row
            for (int i = endRow-1; i >= startRow+1; i--) {
                if(startCol == endCol) break;
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }

        
    }


    public static void main(String args[]){
        // int matrix[][]= {
        //     {1,2,3,4},
        //     {5,6,7,8},
        //     {9,10,11,12},
        //     {13,14,15,16}
        // };
        int matrix[][]= {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
        };
        PrintSprialMatrix(matrix);
    }
}
