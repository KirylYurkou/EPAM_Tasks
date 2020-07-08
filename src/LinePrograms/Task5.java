package LinePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        int  hours, minutes, seconds;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите натуральное число");
        int inputSecond =  Integer.parseInt(reader.readLine());
        hours = inputSecond/3600;
        minutes = (inputSecond%3600)/60;
        seconds = ((inputSecond%3600))%60;
        System.out.printf("%02dч ",hours);
        System.out.printf("%02dмин ",minutes);
        System.out.printf("%02dс",seconds);
        reader.close();
    }
}

