package Task1_3_cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Для каждого натурального числа в промежутке от m до n вывести все делители,
// кроме единицы и самого числа. m и n вводятся с клавиатуры.
public class Task8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите m");
        int m = Integer.parseInt(reader.readLine());
        System.out.println("Введите n");
        int n = Integer.parseInt(reader.readLine());
        while (m <= n) {
            System.out.print("\n число: " + m);
            System.out.print(" делитеи: ");
            for (int i = 2; i <= m - 1; i++) {
                if (m % i == 0) {
                    System.out.print(i + ",");
                }
            }
            m = m + 1;
        }
    }
}
