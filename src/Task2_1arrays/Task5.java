package Task2_1arrays;
//Даны целые числа а1,а2 ,..., аn. Вывести на печать только те числа, для которых аi> i
public class Task5 {
    public static void main(String[] args) {
        int a[] = {1,5,2,1,4,7,2,1,3};
        for (int i=0;i<a.length;i++){
            if (a[i]>i){
                System.out.println(a[i]);
            }
        }
    }
}
