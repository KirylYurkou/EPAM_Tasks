package Task2_2Arrays_of_arrays;

import java.util.Arrays;

//Сформировать случайную матрицу mxn, состоящую из нулей и единиц,
// причем в каждом столбце число единиц равно номеру столбца.
public class Task14 {
    public static void main(String[] args) {
        int m =5;
        int n =5;
        int[][] matrix = new int[m][n];
        int k=1;
        for (int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix.length-1; j++) {
                matrix[i][k] = 1;k++;
            }k=1;
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
