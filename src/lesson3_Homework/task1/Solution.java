package lesson3_Homework.task1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Tania on 19.01.2016.
 */
/*
 1. Задать массив целых чисел длинной 10 эл.
 2. Отсортировать числа в массиве
 3. Вывести на экран результат.
 4. Сделать возможность наполнения массива с клавиатуры*.
 */
public class Solution {
    public static void main(String[] args) {
        int[] a = new int[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
