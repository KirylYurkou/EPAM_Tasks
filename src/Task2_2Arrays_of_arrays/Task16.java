package Task2_2Arrays_of_arrays;

public class Task16 {
    public static void main(String[] args) {
        int n = 5;
        int m[][] = new int[n][n];
        int i, j;
        int num = 1;
        int nn = n * 3 / 2;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                m[(j - i + nn) % n][(i * 2 - j + n) % n] = num++;
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
