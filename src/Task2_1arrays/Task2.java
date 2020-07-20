package Task2_1arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Дана последовательность действительных чисел а1,а2 ,..., ап.
// Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длинну массива N");
        int length = Integer.parseInt(reader.readLine());
        int nums[] = new int[length];                          //Создаем массив
        System.out.println("Введите элементы массива");
        for (int i =0;i<nums.length;i++){                      //Заполняем массив
            nums[i]=Integer.parseInt(reader.readLine());
        }
        System.out.println("Введите число Z");
        int count = 0;
        int z = Integer.parseInt(reader.readLine());
        reader.close();
        for (int i = 0;i<nums.length;i++){
            if (nums[i]>z){                                     //Сравниваем элементы массива
                nums[i]=z;                                      //Заменяем элементы
                count++;                                        //Счетчик замен
            }
        }
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);                        //Наглядная проверка массива на замены
        }
        System.out.println("Количество замен составляет "+count);
    }
}
