package Task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a, b, c;
        System.out.println("Введите значение a");
        a = Double.parseDouble(reader.readLine());
        System.out.println("Введите значение b");
        b = Double.parseDouble(reader.readLine());
        System.out.println("Введите значение c");
        c = Double.parseDouble(reader.readLine());
        double z = (b+(Math.sqrt(Math.pow(b,2))+4*a*c))/2*a-(Math.pow(a,3)*c)+Math.pow(b,-2);
        System.out.println("Результат = "+z);
    }
}
