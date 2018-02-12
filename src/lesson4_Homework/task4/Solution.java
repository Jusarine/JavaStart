package lesson4_Homework.task4;

import java.util.Scanner;

/**
 * Created by Tania on 22.01.2016.
 */
//  Дано массив из 10 целых чисел. Вывести на экран сумму всех его элементов кроме первого и последнего.

public class Solution {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 1; i < a.length-1; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
