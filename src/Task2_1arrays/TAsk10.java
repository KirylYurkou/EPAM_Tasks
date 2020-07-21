package Task2_1arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Дан целочисленный массив с количеством элементов п.
// Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
// Примечание. Дополнительный массив не использовать.
public class TAsk10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длинну массива");
        int l = Integer.parseInt(reader.readLine());
        System.out.println("Введите элементы массива");
        ArrayList<Integer> nums = new ArrayList<>();           //Не совсем понял условие. По этому сделал через коллекции.
        for (int i=0;i<l;i++){
            nums.add(Integer.parseInt(reader.readLine()));
        }
        reader.close();
        for (int i=1;i<nums.size();i+=2){
            nums.set(i,0);
        }
        for (int i=0;i<nums.size();i++){
            if (nums.get(i)==0){
                nums.remove(i);
            }
        }
        for (int i=0;i<l/2;i++){
            nums.add(0);
        }
        for (int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }
    }
}