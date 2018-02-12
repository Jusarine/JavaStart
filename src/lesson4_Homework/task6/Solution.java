package lesson4_Homework.task6;

import java.util.Scanner;

/**
 * Created by Tania on 22.01.2016.
 */
// Найти в массиве чисел элементы с наибольшим и наименьшим значениями.

public class Solution {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }
        System.out.println("max = " + max + ", min = " + min);
    }
}
