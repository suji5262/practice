package me.day04.practice;

import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= (n-1); j++) {
                System.out.println(" ");
            }
            for(int a =1; a <= i; a++){
                System.out.println("*");
            }
            System.out.println();

        }
    }
}
