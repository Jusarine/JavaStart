package lesson4_Homework.task7;

import java.util.Scanner;

/**
 * Created by Tania on 22.01.2016.
 */
// Найти в массиве число, которое повторяется наибольшее количество раз. Не использовать коллекции.

public class Solution1 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int am1;
        int am2 = 0;
        int num = 0;
        for(int i = 0; i < a.length; i++){
            am1 = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) am1++;
            }
            if (am1 > am2){
                am2 = am1;
                num = a[i];
            }
        }
        System.out.println("number = " + num + ", amount = " + am2);
    }
}

