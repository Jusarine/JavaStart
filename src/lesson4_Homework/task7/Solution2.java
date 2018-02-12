package lesson4_Homework.task7;

import java.util.Scanner;

/**
 * Created by Tania on 23.01.2016.
 */
public class Solution2 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int n = 0;
        int frec = 0;
        for(int x : a){
            int narr = frequensy(a, x);
            if(frec < narr){
                n = x;
                frec = narr;
            }
        }
        System.out.println("The number " + n + " is repeated " + frec + " times");
    }
    static int frequensy(int[] a, int x){
        int c = 0;
        for(int temp : a){
            if(x == temp) c++;
        }
        return c;
    }
}
