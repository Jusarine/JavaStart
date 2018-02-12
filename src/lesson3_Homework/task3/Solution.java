package lesson3_Homework.task3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Tania on 19.01.2016.
 */
/*
 1. Ввести с клавиатуры массив из 10 чисел.
 2. Разбить его на 2 массива равной длинны.
 3. Отсортировать каждую из половинок и вывести их содержимое на экран.
 */
public class Solution {
    public static void main(String[] args) {
        int[] a = new int[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            a[i] = sc.nextInt();
        }
        int[] b = Arrays.copyOfRange(a, 0, a.length/2);
        int[] c = Arrays.copyOfRange(a, a.length/2, a.length);

        Arrays.sort(b);
        Arrays.sort(c);

        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
}
