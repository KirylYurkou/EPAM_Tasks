package Task2_1arrays;
//Даны действительные числа a1,a2,a3...an.
// Найти max(a1+a2n a2+a2n-1 ... an+an+1)
public class Task7 {
    public static void main(String[] args) {
        double arr[] = { 1.54,2.5,6.8,23.1,2.4,0.5 };
        double max = 0;
            for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
                max = Double.max(max, arr[i] + arr[j]);
            }
        System.out.println(max);
    }
}