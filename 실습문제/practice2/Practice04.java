package me.day04.practice;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String number1 = ("1, 2, 3, 4, 5");
        int n = Integer.parseInt(args[0]);

        for (int i = 1; i <=5; i++ ){
            System.out.println(i);
        }
        System.out.printf("(%d, %d)\n");

    }
}
//우리가 가진 수 1,2,3,4,5
//해당 수 내에서 발생할 수 있는 조합의 쌍과 수를 출력하는 프로그램을 만들어라


