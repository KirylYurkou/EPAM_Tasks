package Task2_2Arrays_of_arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Сформировать квадратную матрицу порядка nпо заданному образцу(n-четное):
public class Task4 {
    public static void main(String[] args) throws IOException {
        int n,k,num;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите порядок матрицы n");
        n = Integer.parseInt(reader.readLine());
        reader.close();
        k=1;num=n;
        int [] [] arr = new int  [n] [n];
        for(int i =0;i<arr.length;i++) {
            if(i%2==0) {
                for(int j =0;j<arr.length;j++) {
                    arr[i][j]=k;k++;
                }k=1;
            }
            else {
                for(int j =0;j<arr.length;j++) {
                    arr[i][j]=num;num--;;
                }num=n;
            }
        }
        for(int i =0;i<arr.length;i++) {
            for(int  j =0;j<arr.length;j++) {
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
}

