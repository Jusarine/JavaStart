package lesson4_Homework.task2;

/**
 * Created by Tania on 22.01.2016.
 */
// Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i%3 == 0) System.out.println(i);
        }
    }
}
