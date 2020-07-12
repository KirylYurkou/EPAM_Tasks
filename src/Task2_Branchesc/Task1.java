package Task2_Branchesc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    //Даны два угла треугольника (в градусах).
    // Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВедите первый угол");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите второй угол");
        int b = Integer.parseInt(reader.readLine());
        int c = a+b;
        if (c<180){
            System.out.print("Треугольник существует");
        }else System.out.println("Треугольник не существует");
        if (a==90||b==90||c==90){
            System.out.println(", он прямоугольный.");
        }
    }
}

