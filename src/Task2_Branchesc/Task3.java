package Task2_Branchesc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
// Определить, будут ли они расположены на одной прямой.
public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите x1");
        int x1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите y1");
        int y1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите x2");
        int x2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите y2");
        int y2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите x3");
        int x3 = Integer.parseInt(reader.readLine());
        System.out.println("Введите y3");
        int y3 = Integer.parseInt(reader.readLine());
        if (x1==x2 && x1==x3) {
            System.out.println("Точки принадлежат одной прямой");
        }else if (y1==y2 && y1==y3){
            System.out.println("Точки принадлежат одной прямой");
        }
        else if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)){
            System.out.println("Точки принадлежат одной прямой");
        }else System.out.println("Точки не принадлежат одной прямой");
        reader.close();
    }
}