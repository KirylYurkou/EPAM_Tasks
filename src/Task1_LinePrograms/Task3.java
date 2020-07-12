package Task1_LinePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x,y;
        System.out.println("Введите x");
        x = Double.parseDouble(reader.readLine());
        System.out.println("Введите y");
        y = Double.parseDouble(reader.readLine());
        double z = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
        System.out.println("Результат = "+z);
        reader.close();
    }
}
