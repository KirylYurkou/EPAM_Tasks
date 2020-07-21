package Task2_2Arrays_of_arrays;
// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = {{2,4,5,6,7},
                          {3,4,5,6,2},
                          {6,4,3,2,4},
                          {9,8,7,5,2},
                          {3,4,2,1,4}};
        for (int i=0;i<matrix.length;i++){
            System.out.println(matrix[i][i]);
        }
    }
}
