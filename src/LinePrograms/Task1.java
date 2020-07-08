package LinePrograms;

import java.util.Scanner;

public class Task1 {

    //1. Найдите значение функции: z = ((a – 3 )*b/2) + c.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Введите значение a");
        a = scanner.nextDouble();
        System.out.println("Введите значение b");
        b = scanner.nextDouble();
        System.out.println("Введите значение c");
        c = scanner.nextDouble();
        double z = ((a - 3) * b / 2) + c;
        System.out.println("Результат = " + z);
        scanner.close();
    }
}
