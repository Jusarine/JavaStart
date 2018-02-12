package lesson5_Homework.task4;

import java.util.Arrays;

/**
 * Created by Tania on 26.01.2016.
 */
 // Написать ф-ю для объединения 2-х массивов в один. Вывести результат на консоль.

public class Solution {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        System.out.println(unite(a, b));
    }
    public static String unite(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, (a.length), b.length);
        return Arrays.toString(c);
    }
}
