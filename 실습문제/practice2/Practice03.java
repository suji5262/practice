package practice.실습문제.practice2;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int NUM = 5; //학생수
        double sum = 0; // 합계
        double avg = 0; // 평균
        double score = 0;

        // 100
        for(int i = 0; i < NUM; i++) {
            while(true) {
                System.out.print("성적을 입력: "); //입력 유도
                score = sc.nextDouble();

                if (score >= 0 && score <= 100)
                    break;
                else {
                    System.out.println("유효하지 않은 성적 입력값입니다");
                }
// 밖에> 5명의 성적 입력, 안에 > 성적 유효범위 t,f

            }

        }
// 성적을 입력받아 합계, 평균

        avg = sum / NUM;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);

    }
}
