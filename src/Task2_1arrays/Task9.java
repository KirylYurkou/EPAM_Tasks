package Task2_1arrays;
//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них.
public class Task9 {
    public static void main(String[] args) {
        int[] data = {1, 2, 7, 8, 9, 1, 2, 3, 4, 5, 6, 1, 2, 3, 7, 8, 8, 3, 4, 5};


        int[] popular = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i] == data[j]) {
                    popular[i]++;
                }
            }
        }

        int valResult = data[0];
        int popResult = popular[0];
        for (int i = 0; i < popular.length; i++) {
            if (popular[i] > popResult) {
                popResult = popular[i];
                valResult = data[i];
            }
            if ((popResult == popular[i]) && (data[i] < valResult)) {
                valResult = data[i];
            }
        }
        System.out.println(valResult);
    }
}





