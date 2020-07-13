package Task1_3_cycles;
//Составить программу нахождения произведения квадратов первых двухсот чисел.
public class Task4 {
    public static void main(String[] args) {
        double x = 1;
        for (int i = 1;i<=200;i++){
           x=x*(Math.pow(i,2));
        }
        System.out.println("Произведение квадратов первых двухсот чисел равно  "+x);

    }
}

