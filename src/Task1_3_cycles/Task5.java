package Task1_3_cycles;
// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
// заданному е. Общий член ряда имеет вид:   a =  1/2^n + 1/3^n;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите e");
        double e = Double.parseDouble(reader.readLine());
        int n = 0;
        double sum = 0;
        System.out.println("Серия общих членов: ");
        for (int i = 0; i<=10; i++){
            ++n;
            System.out.print("\n");
            double a =  (1/Math.pow(2,n))+ (1/Math.pow(3,n));
            System.out.printf("%.4f", a);
            if (e <= Math.abs(a))
                sum = sum+a;
            System.out.printf(" Сумма %f", sum);

        }
    }
}

