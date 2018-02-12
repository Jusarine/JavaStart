package lesson4_Homework.task5;

import java.util.Scanner;

/**
 * Created by Tania on 23.01.2016.
 */
// Написать игру «Крестики нолики» используя двухмерные массивы.

public class Solution {
    public static void main(String[] args) {
        char[][] a = new char[3][3];
        printField(a);
        player1Step(a);
        player2Step(a);
        player1Step(a);
        player2Step(a);
        player1Step(a);
        win(a);
        player2Step(a);
        win(a);
        player1Step(a);
        win(a);
        player2Step(a);
        win(a);
        player1Step(a);
        win(a);
    }
    public static void printField(char[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++){
                System.out.print(a[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-----------");
        }
    }
    public static void player1Step(char[][]a){
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while(b) {
            System.out.println("Player1, enter the first coordinate.");
            int n = sc.nextInt();
            System.out.println("Player1, enter the second coordinate.");
            int m = sc.nextInt();

            if (n < 3 && m < 3 && a[n][m] != 'o' && a[n][m] != 'x') {
                a[n][m] = 'o';
                b = false;
            }
            else if (a[n][m] == 'o' || a[n][m] == 'x') System.out.println("This coordinates are busy.");
            else {
                System.out.println("Coordinates must be less then 3.");
            }
        }
        printField(a);
    }
    public static void player2Step(char[][]a){
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while(b){
            System.out.println("Player2, enter the first coordinate.");
            int n = sc.nextInt();
            System.out.println("Player2, enter the second coordinate.");
            int m = sc.nextInt();

            if (n < 3 && m < 3 && a[n][m] != 'o' && a[n][m] != 'x') {
                a[n][m] = 'x';
                b = false;
            }
            else if  (a[n][m] == 'o' || a[n][m] == 'x') System.out.println("This coordinates are busy.");
            else {
                System.out.println("Coordinates must be less then 3.");
            }
        }
        printField(a);
    }
    public static void win(char[][] a){
        Scanner sc = new Scanner(System.in);
        if(a[0][0] == 'o' && a[0][1] == 'o' && a[0][2] == 'o') {
            System.out.println("Player1, congratulations!");
            System.exit(0);
        }
        else if(a[1][0] == 'o' && a[1][1] == 'o' && a[1][2] == 'o') {
            System.out.println("Player1, congratulations!");
            System.exit(0);
        }
        else if(a[0][0] == 'o' && a[1][0] == 'o' && a[2][0] == 'o') {
            System.out.println("Player1, congratulations!");
            System.exit(0);
        }
        else if(a[0][1] == 'o' && a[1][1] == 'o' && a[2][1] == 'o') {
            System.out.println("Player1, congratulations!");
            System.exit(0);
        }
        else if(a[0][2] == 'o' && a[1][2] == 'o' && a[2][2] == 'o') {
            System.out.println("Player1, congratulations!");
            System.exit(0);
        }
        else if(a[0][0] == 'o' && a[1][1] == 'o' && a[2][2] == 'o') {
            System.out.println("Player1, congratulations!");
            System.exit(0);
        }
        else if(a[2][0] == 'o' && a[1][1] == 'o' && a[0][2] == 'o') {
            System.out.println("Player1, congratulations!");
            System.exit(0);
        }

        if(a[0][0] == 'x' && a[0][1] == 'x' && a[0][2] == 'x') {
            System.out.println("Player2, congratulations!");
            System.exit(0);
        }
        else if(a[1][0] == 'x' && a[1][1] == 'x' && a[1][2] == 'x') {
            System.out.println("Player2, congratulations!");
            System.exit(0);
        }
        else if(a[2][0] == 'x' && a[2][1] == 'x' && a[2][2] == 'x') {
            System.out.println("Player2, congratulations!");
            System.exit(0);
        }
        else if(a[0][0] == 'x' && a[1][0] == 'x' && a[2][0] == 'x') {
            System.out.println("Player2, congratulations!");
            System.exit(0);
        }
        else if(a[0][1] == 'x' && a[1][1] == 'x' && a[2][1] == 'x') {
            System.out.println("Player2, congratulations!");
            System.exit(0);
        }
        else if(a[0][2] == 'x' && a[1][2] == 'x' && a[2][2] == 'x') {
            System.out.println("Player2, congratulations!");
            System.exit(0);
        }
        else if(a[0][0] == 'x' && a[1][1] == 'x' && a[2][2] == 'x') {
            System.out.println("Player2, congratulations!");
            System.exit(0);
        }
        else if(a[2][0] == 'x' && a[1][1] == 'x' && a[0][2] == 'x') {
            System.out.println("Player2, congratulations!");
            System.exit(0);
        }
    }
}