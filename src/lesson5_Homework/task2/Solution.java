package lesson5_Homework.task2;

import java.util.Arrays;

/**
 * Created by Tania on 26.01.2016.
 */
/*
 Написать функцию, которая принимает массив чисел в качестве аргумента, увеличивает его первые 3 элемента на 1 и
 возвращает их сумму как результат. После изменения массив и сумму надо вывести на экран.
 */
public class Solution {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        arr(a);
    }
    public static int arr(int[] a){
        int sum = 0;
        for (int i = 0; i < 3; i++){
            a[i] += 1;
            sum += a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(sum);
        return sum;
    }
}
