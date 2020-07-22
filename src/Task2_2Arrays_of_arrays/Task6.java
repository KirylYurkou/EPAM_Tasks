package Task2_2Arrays_of_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Сформировать квадратную матрицу порядка nпо заданному образцу(n-четное):
public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите порядок матрицы n");
        int n = Integer.parseInt(reader.readLine());
        reader.close();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - i; j++) {
                arr[i][j] = 1;
                arr[n - i - 1][j] = 1;
            }
        }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
    }
}

