package Task1_2_Branchesc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Найти max{min(a, b), min(c, d)}.
public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите a");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите b");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Введите c");
        int c = Integer.parseInt(reader.readLine());
        System.out.println("Введите d");
        int d = Integer.parseInt(reader.readLine());
        int max = Math.max(Math.min(a,b),Math.min(c,d));
        System.out.println("Максимум равен "+max);
        reader.close();
    }
}
