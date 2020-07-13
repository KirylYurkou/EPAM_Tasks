package Task1_2_Branchesc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Вычислить значение функции:
public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите x");
        double x = Double.parseDouble(reader.readLine());
        double a,b;
        if (x<=3){
            a = Math.pow(x,2)-3*x+9;
            System.out.println("F(x) равен "+a);
        }else if (x>3){
            b = 1/(Math.pow(x,3)+6);
            System.out.println("F(x) равен "+b);
        }
        reader.close();
    }
}
