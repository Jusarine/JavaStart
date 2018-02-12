package lesson3_Homework.task4;

import java.util.Scanner;

/**
 * Created by Tania on 19.01.2016.
 */
// Среднее арифметическое элементов массива.

public class Solution {
    public static void main(String[] args) {
        int[] a = new int[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i : a){
            sum += i;
        }
        System.out.println(sum/a.length);
    }
}
