package Task2_2Arrays_of_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class Task1 {
    public static void main(String[] args) throws IOException {
        int[][] matrixA;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Высота матрицы: ");
        int m = Integer.parseInt(reader.readLine());
        System.out.println("Ширина матрицы: ");
        int n = Integer.parseInt(reader.readLine());
        matrixA = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println((i + 1) + "-я строка матрицы: ");
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        reader.close();
        System.out.println();
        System.out.println("Требуемые по условию столбцы матрицы:");
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j += 2) {
                if (matrixA[0][j] > matrixA[m - 1][j]) {
                    System.out.print(matrixA[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}


