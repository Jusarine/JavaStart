package lesson3_Homework.task1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Tania on 19.01.2016.
 */
/*
 1. ������ ������ ����� ����� ������� 10 ��.
 2. ������������� ����� � �������
 3. ������� �� ����� ���������.
 4. ������� ����������� ���������� ������� � ����������*.
 */
public class Solution {
    public static void main(String[] args) {
        int[] a = new int[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
