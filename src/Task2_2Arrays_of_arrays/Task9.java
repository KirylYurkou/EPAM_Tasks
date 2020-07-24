package Task2_2Arrays_of_arrays;

import java.io.IOException;
import java.util.Arrays;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
// Определить, какой столбец содержит максимальную сумму.
public class Task9 {
    public static void main(String[] args) throws IOException {
        int[][] matrix = {{2, 4, 5, 6, 7},
                          {3, 4, 5, 6, 2},
                          {6, 4, 3, 2, 4},
                          {9, 8, 7, 5, 2},
                          {3, 4, 2, 1, 4}};
        int max =0;
        int a=0;
        int index =0;
        int[] sum = new int[matrix.length];
        for (int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum[a] += matrix[i][a];
                a++;
            }a=0;
        }
        for (int i = 0; i < sum.length; i++) {
            if (max < sum[i]) {
                max = sum[i];
                index = i;
            }
        }
            System.out.println("Столбец № "+index);
    }

}

