package Task2_2Arrays_of_arrays;

import java.util.Arrays;

//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
public class Task13 {
    public static void main(String[] args) {
        int[][] matrix = {{2, 4, 5, 6, 7, 5 },
                          {3, 4, 5, 6, 2, 6 },
                          {6, 4, 3, 2, 4, 7 },
                          {9, 8, 7, 5, 2, 2 },
                          {3, 4, 2, 1, 4, 1 }};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix.length-1; k++) {
                        if (matrix[k][j] > matrix[k+1][j]) {
                            int temp = matrix[k][j];
                            matrix[k][j] = matrix[k+1][j];
                            matrix[k+1][j] = temp;
                        }
                    }
                }
            }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}