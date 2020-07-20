package Task2_1arrays;
//Даны действительные числа а1,а2,..., аn. Поменять местами наибольший и наименьший элементы.
public class Task4 {
    public static void main(String[] args) {
        double a[] = { 1.54,2.5,6.8,23.1,2.4,0.5 }; // набиваем массив каким нибудь хламом
        double max = a[0];
        int imax = 0;
        double min = a[0];
        int imin = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {                       //Находим максимум
                max = a[i];
                imax = i;
            }
            if (a[i] < min) {                       //Находим минимум
                min = a[i];
                imin = i;
            }
        }
        a[imin] = max;
        a[imax] = min;                              //меняем местами
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

