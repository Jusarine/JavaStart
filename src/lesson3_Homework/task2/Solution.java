package lesson3_Homework.task2;

import java.util.Arrays;

/**
 * Created by Tania on 19.01.2016.
 */
/*
 1. Задать массив целых чисел длинной N эл.
 2. Поменять 1-й и последний элемент местами.
 3. Вывести массив на экран.
 */
public class Solution {
    public static void main(String[] args) {
        int[] a = new int[10];
        int temp = a[0];
        a[0] = a[a.length-1];
        a[a.length-1] = temp;

        System.out.println(Arrays.toString(a));
    }
}
