package Task1_3_cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Вычислить значенияфункции на отрезке [а,b] c шагом h
public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите a");
        double a = Double.parseDouble(reader.readLine());
        System.out.println("Введите b");
        double b = Double.parseDouble(reader.readLine());
        System.out.println("Введите шаг h");
        double h = Double.parseDouble(reader.readLine());
        System.out.println("Введите x");
        double x = Double.parseDouble(reader.readLine());
        double y = 0;
        while (a<=b){
            if (x>2){
                y=x;}
            else if (x<=2){
                y=-x;}
            a=a+h;
            System.out.println(y);
        }
    }
}
