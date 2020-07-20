package Task2_1arrays;
import java.util.Random;
//Задана последовательность N вещественных чисел.
// Вычислить сумму чисел, порядковые номера которых являются простыми числами.
public class Task6 {
    public static void main(String[] args) {
        double[] arr = new Random().doubles(50, 0., 20.).toArray();
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(i)) {
                sum+=arr[i];
            }
        }
        System.out.println("Summ: " + sum);

    }

    public static boolean isPrime(int x) {
        if (x < 2) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
}