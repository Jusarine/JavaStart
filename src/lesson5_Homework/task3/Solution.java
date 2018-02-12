package lesson5_Homework.task3;

/**
 * Created by Tania on 26.01.2016.
 */
/*
 Написать ф-ю, которая принимает на вход массив чисел и возвращает его длину в байтах как результат.
 */
public class Solution {
    public static void main(String[] args) {
      int[] a = {1, 2, 3, 4, 5};
        b(a);
    }
    public static int b(int[] a) {
        return a.length * 4;
    }
}
