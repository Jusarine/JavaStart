package lesson4_Homework.task9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Tania on 23.01.2016.
 */
// Написать метод для зеркального переворота элементов в массиве ([1, 2, 3, 4] -> [4, 3, 2, 1])

public class Solution {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++){
            b[i] = a[a.length-1 -i];
        }
        a = Arrays.copyOf(b, b.length);
        System.out.println(Arrays.toString(a));
    }
}
