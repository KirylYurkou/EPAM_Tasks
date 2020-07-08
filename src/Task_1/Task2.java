package Task_1;

import java.util.Scanner;


public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Введите значение a");
        a = scanner.nextDouble();
        System.out.println("Введите значение b");
        b = scanner.nextDouble();
        System.out.println("Введите значение c");
        c = scanner.nextDouble();
        double z = (b+(Math.sqrt(Math.pow(b,2))+4*a*c))/2*a-(Math.pow(a,3)*c)+Math.pow(b,-2);
        System.out.println("Результат = "+z);
    }
}
