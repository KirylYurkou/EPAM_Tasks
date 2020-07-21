package Task2_1arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них.
public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длинну массива");
        int length = Integer.parseInt(reader.readLine());
        int[] data = new int[length];
        System.out.println("Введите элементы массива");
        for (int i =0;i<data.length;i++){
            data[i]= Integer.parseInt(reader.readLine());
        }
        int[] popular = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i] == data[j]) {
                    popular[i]++;
                }
            }
        }

        int valResult = data[0];
        int popResult = popular[0];
        for (int i = 0; i < popular.length; i++) {
            if (popular[i] > popResult) {
                popResult = popular[i];
                valResult = data[i];
            }
            if ((popResult == popular[i]) && (data[i] < valResult)) {
                valResult = data[i];
            }
        }
        System.out.println("Наименьшее наиболее часто встречающееся число "+valResult);
    }
}





