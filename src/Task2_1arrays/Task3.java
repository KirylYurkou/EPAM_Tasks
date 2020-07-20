package Task2_1arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//  Дан  массив  действительных  чисел,  размерность  которого N.
//  Подсчитать,  сколько  в  нем  отрицательных, положительных и нулевых элементов.
public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длинну массива N");
        int length = Integer.parseInt(reader.readLine());
        double nums[] = new double[length];                          //Создаем массив
        System.out.println("Введите элементы массива");
        for (int i = 0; i < nums.length; i++) {                      //Заполняем массив
            nums[i] = Double.parseDouble(reader.readLine());
        }
        reader.close();
        int minus = 0;
        int plus = 0;
        int zero = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]<0){                                         //находим отрицательные значения
                minus++;
            }else if (nums[i]>0){                                   //Находим положительные значения
                plus++;
            }else if (nums[i]==0){                                  //Находим значения равные нулю
                zero++;
            }
        }
        System.out.println("Положительных чисел "+plus);
        System.out.println("Отрицательных чисел "+minus);
        System.out.println("Чисел равных нулю "+zero);
    }
}