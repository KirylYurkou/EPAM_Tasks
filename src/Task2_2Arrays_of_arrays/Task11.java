package Task2_2Arrays_of_arrays;

import java.util.Arrays;

//Матрицу 10x20 заполнить случайными числами от 0 до 15.
// Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
public class Task11 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][20];
        int[] a = new int[10];
        int k=0;
        for (int i = 0; i < 10; i++) {
            int count =0;
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
                if (matrix[i][j] == 5) count++;
            }
            if (count>=3){
              a[k]=i+1;
              k++;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.print("Строки в которых 5 встречается 3 и более раз: ");
        for (int i=0;i<k;i++){
            System.out.print(a[i]+" ");
        }
    }
}