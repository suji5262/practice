package me.day03.practice;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.printf("x 좌표를 입력");
        x = sc.nextDouble();
        System.out.printf("y  좌표를 입력");
        y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.printf("1사분면");
        } else if (x < 0 && y > 0) {
            System.out.printf("2사분면");
        } else if (x < 0 && y < 0) {
            System.out.printf("3사분면");
        } else if (x > 0 && y < 0) {
            System.out.printf("4사분면");
        } else if (x == 0 && y == 0){
            System.out.printf("0");
        }else if (y == 0) {
            System.out.printf("x");
        } else if (x == 0) {
            System.out.printf("y");
        }
        // 조건문 순서도 중요함

//        - 만약 어떤 사분면 위에 있지 않고 x 축 위에 있으면 `x 축 위에 있음`을 출력
//        - 만약 어떤 사분면 위에 있지 않고 y 축 위에 있으면 `y 축 위에 있음`을 출력
//        - 원점이면 `원점`을 출력 ??

    }
}
