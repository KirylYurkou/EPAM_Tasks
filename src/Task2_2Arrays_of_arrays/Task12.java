package Task2_2Arrays_of_arrays;

import java.util.Arrays;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
public class Task12 {
    public static void main(String[] args) {
        int[][] matrix = {{2, 4, 5, 6, 7},
                {3, 4, 5, 6, 2},
                {6, 4, 3, 2, 4, 7},
                {9, 8, 7, 5, 2},
                {3, 4, 2, 1, 4}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j > 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (matrix[i][k] > matrix[i][k + 1]) {
                        int tmp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = tmp;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}