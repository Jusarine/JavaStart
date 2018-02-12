package lesson7_Homework.task3;

/**
 * Created by Tania on 03.02.2016.
 */
//   Дано 3 массива чисел. С помощью 1-2-х циклов найти сумму элементов во всех массивах.
public class Solution {
    public static void main(String[] args) {
        int[] a1 = {1, 1, 1}, a2 = {2, 2}, a3 = {3, 3};
        int[][] all = {a1, a2, a3};
        int res = 0;
        for (int i = 0; i < all.length; i++) {
            for (int j = 0; j < all[i].length; j++) {
                res += all[i][j];
            }
        }
        System.out.println(res);

    }
}
