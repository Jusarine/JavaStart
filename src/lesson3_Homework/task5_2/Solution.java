package lesson3_Homework.task5_2;

import java.util.Scanner;

/**
 * Created by Tania on 19.01.2016.
 */
/* Ќаписать программу, котора€ позволит задать длину массива с клавиатуры, наполнить его
 элементами, а затем выводить нужный элемент по его индексу на консоль.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("Enter the number of element:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the index for the search element:");
        int i = sc.nextInt();
        System.out.println("Element is: " + a[i]);
    }
}
