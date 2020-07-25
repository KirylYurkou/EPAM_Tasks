package Task2_2Arrays_of_arrays;

import java.util.Arrays;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
public class Task15 {
    public static void main(String[] args) {
        int[][] matrix = {{2, 4, 5, 6, 7},
                          {3, 4, 5, 6, 2},
                          {6, 4, 3, 2, 4},
                          {9, 8, 7, 5, 2},
                          {3, 4, 2, 1, 4}};
        int max = matrix[0][0];
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (matrix[i][j]>max){
                    max = matrix[i][j];
                }
            }
        }
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (matrix[i][j]%2!=0){
                    matrix[i][j]=max;
                }
            }
        }
        for (int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
