package Task1_3_cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите a");
        String a = reader.readLine();
        System.out.println("Введите  b");
        String b = reader.readLine();
        reader.close();
        for (int f = 0; f < a.length(); f++) {
            a.charAt(f);
        }
        System.out.println(" ");
        for (int g = 0; g < b.length(); g++) {
            b.charAt(g);
        }
        System.out.println("\n Цифры которые входят в состав чисел : ");
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    System.out.print("|" + b.charAt(j));
                }
            }
        }
    }
}
