package Task2_2Arrays_of_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите порядок матрицы n");
        int n = Integer.parseInt(reader.readLine());
        reader.close();
        int count = 0;
        double[][] a = new double[n][n];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                a[i][j]=Math.sin((i*i-j*j)/n);
                if (a[i][j]>0)count++;
            }
        }
        for(int i =0;i<a.length;i++) {
            for(int  j =0;j<a.length;j++) {
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }
        System.out.println("Положительных элементов: "+count);
    }
}
