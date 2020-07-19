package Task2_1arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длинну массива N");
        int length = Integer.parseInt(reader.readLine());
        int nums[] = new int[length];                          //Создаем массив
        System.out.println("Введите элементы массива");
        for (int i =0;i<nums.length;i++){                      //Заполняем массив
            nums[i]=Integer.parseInt(reader.readLine());
        }
        System.out.println("Введите делитель K");
        int k = Integer.parseInt(reader.readLine());
        int sum = 0;
        for (int i = 0;i<nums.length;i++) {
            if (nums[i] % k == 0) {                           //Находим кратные элементы
                sum += nums[i];
            }
        }
            System.out.println("Сумма элементов кратных K равна "+sum);
    }
}
