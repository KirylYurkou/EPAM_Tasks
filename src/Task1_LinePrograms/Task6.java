package Task1_LinePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Для данной области составить линейную программу, которая печатает true,
// если точка с координатами (х, у) принадлежит закрашенной области, и false—в противном случае:
public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите x");
        double x = Double.parseDouble(reader.readLine());
        System.out.println("Введите y");
        double y = Double.parseDouble(reader.readLine());
        if (x<=2&&x>=-2&&y<=4&&y>=0){
            System.out.println("True");
        }else if(x<=4&&x>=-4&&y<=0&&y>=-3){
            System.out.println("True");
        }else System.out.println("False");
    }
}
