package Task2_2Arrays_of_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку");
        int k = Integer.parseInt(reader.readLine());
        System.out.println("Введите столбец");
        int p = Integer.parseInt(reader.readLine());
        int[][] matrix = {{2,4,5,6,7},
                          {3,4,5,6,2},
                          {6,4,3,2,4},
                          {9,8,7,5,2},
                          {3,4,2,1,4}};
        System.out.print("Строка: ");
        for (int i=0;i<1;i++){
            for (int j=0;j<matrix[i].length;j++)
                System.out.println(matrix[k][j]);
        }
        System.out.println("Столбец: ");
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<1;j++)
                System.out.println(matrix[i][p]);
        }
    }
}
