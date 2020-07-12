package Task1_LinePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Дано действительное число Rвида nnn.ddd(три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.
public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число с тремя знаками до запятой и тремя после");
        double x = Double.parseDouble(reader.readLine());
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(y);
        reader.close();
    }
}
