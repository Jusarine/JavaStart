package lesson7_Homework.task1;

import java.util.Arrays;

/**
 * Created by Tania on 02.02.2016.
 */
// ���� ����� �� 3-� ���� �word1 word2 word3�. �������� 1-� � 3-� ����� ������� � ������� �� ����� ���������.
public class Solution {
    public static void main(String[] args) {
        String s = "word1 word2 word3";
        String[] a = s.split(" ");
        String s2 = a[2] + " " + a[1] + " " + a[0];
        System.out.println(s2);
    }
}
