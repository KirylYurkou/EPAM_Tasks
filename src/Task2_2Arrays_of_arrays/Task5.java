package Task2_2Arrays_of_arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Сформировать квадратную матрицу порядка nпо заданному образцу(n-четное):
public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите порядок матрицы n");
        int n = Integer.parseInt(reader.readLine());
        reader.close();
        int k = 1;
        int m = 2;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = k;
            }
            k++;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (j>arr.length-m){
                    arr[i][j]=0;
                }
            }m++;

        }
        for(int i =0;i<arr.length;i++) {
            for(int  j =0;j<arr.length;j++) {
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
}

