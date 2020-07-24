package Task2_2Arrays_of_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// В числовой матрице поменять местами два столбца любых столбца, т. е.
// все элементы одного столбца поставить на соответствующие им позиции другого,
// а его элементы второго переместить в первый.Номера столбцов вводит пользователь с клавиатуры.
public class Task8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первый столбец");
        int k = Integer.parseInt(reader.readLine());
        System.out.println("Введите второй столбец");
        int p = Integer.parseInt(reader.readLine());
        reader.close();
        int[][] matrix = {{2, 4, 5, 6, 7},
                          {3, 4, 5, 6, 2},
                          {6, 4, 3, 2, 4},
                          {9, 8, 7, 5, 2},
                          {3, 4, 2, 1, 4}};
        int[] copy = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[j].length - 1; j++) {
                copy[i] = matrix[i][k];
            }
        }
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[j].length-1;j++){
                matrix[i][k] = matrix[i][p];
            }
        }
        for (int i = 0; i < copy.length; i++) {
            matrix[i][p] = copy[i];
        }
        for (int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
