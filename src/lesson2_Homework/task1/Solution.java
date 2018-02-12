package lesson2_Homework.task1;

import java.util.Scanner;

/**
 * Created by Tania on 19.01.2016.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        System.out.println(s1 + s3);
        System.out.println(s3 + s2 + s1);
        System.out.println(s1 + s2 + s3);
    }
}
