package Task1_3_cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Напишите программу, где пользователь вводитлюбоецелоеположительноечисло.
// А программа суммирует все числа от 1 до введенного пользователем числа.
public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        int a = Integer.parseInt(reader.readLine());
        reader.close();
        int sum = 0;
        for (int i = 1;i<=a;i++){
            sum+=i;
        }
        System.out.println("Суммма чисел равна "+sum);
    }
}
