package me.day04.practice;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 문장을 가져옴

        String str = sc.next();
        char a = str.charAt(0);
        String result = "";

        while (true) {
            if (a == 'q') {
                break;
            }
            result = result+a;
            str = sc.next();
            a = str.charAt(0);

        }
        System.out.println(result);

    }
}
