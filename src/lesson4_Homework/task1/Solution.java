package lesson4_Homework.task1;

/**
 * Created by Tania on 22.01.2016.
 */
// ������� �� ����� ����� �� 10 �� 20 � ������� ���� ��������� ������.

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i <= 20; i++) {
            System.out.println(i);
        }
        int i = 10;
        while(i <= 20) {
            System.out.println(i);
            i++;
        }
        int j = 10;
        do {
            System.out.println(j);
            j++;
        }while(j <= 20);
    }
}
