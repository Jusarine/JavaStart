package lesson4_Homework.task3;

import java.util.Arrays;

/**
 * Created by Tania on 22.01.2016.
 */
// Заполнить массив числами от 100 до 0.

public class Solution {
    public static void main(String[] args) {
        int[] a = new int[101];
        for (int i = 100; i >= 0; i--){
            a[i] = i;
        }
    }
}
