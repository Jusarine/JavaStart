package lesson3_Homework.task2;

import java.util.Arrays;

/**
 * Created by Tania on 19.01.2016.
 */
/*
 1. ������ ������ ����� ����� ������� N ��.
 2. �������� 1-� � ��������� ������� �������.
 3. ������� ������ �� �����.
 */
public class Solution {
    public static void main(String[] args) {
        int[] a = new int[10];
        int temp = a[0];
        a[0] = a[a.length-1];
        a[a.length-1] = temp;

        System.out.println(Arrays.toString(a));
    }
}
