package me.day06.practice;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] Arr = new String[sc.nextInt()];

        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sc.next(); // 몇개를 입력할껀지
        }

        sc.close();

        for (int i = 0; i < Arr.length; i++) {

            int cnt = 0; // 연속횟수
            int sum = 0; // 누적 합산

            for (int j = 0; j < Arr.length; j++) {

                if (Arr[i].charAt(j) == 'O'){
                    cnt++;
                }
                else {
                    cnt = 0;
                }
                sum += cnt;

            }
            System.out.println(sum);
        }
    }
}
