package Task1_3_cycles;
//6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
public class Task7 {
    public static void main(String[] args) {
        char charsSigns  = '\u0000';
        int charsNumber = 0;
        for (int i = 0; i<= 10000; i++){
            charsSigns++;
            charsNumber++;
            System.out.println("sign: " + charsSigns + "  number: " + charsNumber);
        }
    }
}
