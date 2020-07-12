package Task2_Branchesc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
// Определить, пройдет ли кирпич через отверстие.
public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сторону отверстия A");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите сторону отверстия B");
        int b = Integer.parseInt(reader.readLine());

        System.out.println("Введите сторону кирпича x");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Введите сторону кирпича y");
        int y = Integer.parseInt(reader.readLine());
        System.out.println("Введите сторону кирпича x");
        int z = Integer.parseInt(reader.readLine());
        if (a > x && b > y || a > y && b > x) {
            System.out.println("Кирпич проходит в отверстие");
        } else if (a > x && b > z || a > z && b > x) {
            System.out.println("Кирпич проходит в отверстие");
        } else if (a > z && b > y || a > y && b > z) {
            System.out.println("Кирпич проходит в отверстие");
        } else System.out.println("Кирпич не проходит в отверстие");
        reader.close();
    }
}
