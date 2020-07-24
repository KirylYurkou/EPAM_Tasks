package Task2_2Arrays_of_arrays;

//Найти положительные элементы главной диагонали квадратной матрицы.
public class Task10 {
    public static void main(String[] args) {
        int[][] matrix = {{-2, 4, 5, 6, 7},
                          {3, 4, 5, 6, 2},
                          {6, 4, -3, 2, 4},
                          {9, 8, 7, 5, 2},
                          {3, 4, 2, 1, -4}};
        int n = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + " ");
                n++;
            }
        }
        if (n==0){
            System.out.println("Положительных элементов не найдено");
        }
    }
}