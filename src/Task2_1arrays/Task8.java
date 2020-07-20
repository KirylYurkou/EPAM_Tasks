package Task2_1arrays;
// Дана последовательность целых чисел a1,a2 , ... ,an .
// Образовать новую последовательность, выбросив из
//   исходной те члены, которые равны min(a1,a2 , ... ,an ) .
public class Task8 {
    public static void main(String[] args) {
        int arr[] = {1,5,2,1,4,7,2,1,3};
        int count = 0;
        int min = arr[0];
        for (int d : arr) {
            if (d < min) {
                count = 1;
                min = d;
            }
            else if (d == min) {
                count++;
            }
        }
        int i = 0;
        int[] res = new int[arr.length - count];
        for (int d : arr) {
            if (d > min) {
                res[i++] = d;
            }
        }
        for (int a=0;a<res.length;a++){
            System.out.println(res[a]);
        }
    }
}
