package me.day06.practice;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] scores = new int[10];  // 학생 10명

        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();


            int max = getMax(scores);
            int min = getMin(scores);
            double avg = getAverage(scores);
            double var = getVariance(scores, avg); // 분산
            double std = getStandardDeviation(var); //표준편차

            System.out.println("최대값 : " + max);
            System.out.println("최소값 : " + min);
            System.out.println("평균 : " + avg);
            System.out.println("분산 : " + var);
            System.out.println("표준편차 : " + std);
        }
    }


        public static int getMax(int[] scores){
            int max = Integer.MIN_VALUE; // 최대값을 구하기 위해 기본 값으로 int가 가질 수 있는 가장 작은 값을 미리 넣어줌
            for (int i = 0; i<scores.length; i++) {
                max = Math.max(max, scores[i]); // Math.max > 두 값을 비교해 더 큰값을 반환
            }
            return max; //max 값 반환
        }

        private static int getMin(int[] scores){
            int min = Integer.MAX_VALUE; // 최소값을 구하기 위해 > 가질 수 있는 최대값을 넣어

            for (int i = 0; i < scores.length; i++) {
                min = Math.min(min, scores[i]);
            }
            return min;
        }


        private static double getAverage(int[] scores){
            double sum = 0; // 평균 값을 실수로 나올 수 있기에
            for (int i = 0; i < scores.length; i++) {
                sum = sum + scores[i];
            }
            return sum / scores.length; // 성적의 총합/ 학생수
        }

        // 표준편차 > 분산의 제곱근 > 루트값
        private static double getStandardDeviation(double var){
            return Math.sqrt(var); // sqrt > 특정값의 제곱근을 구함
        }

        // 분산 > 기존의 값들 각각에 대해 평균을 뺀 값의 재곱드르이 합의 평균
        private static double getVariance(int[] scores, double avg){
            double result = 0;
            for (int i = 0; i < scores.length; i++) {
                result = result + Math.pow(scores[i] - avg, 2);
                // result 변수 = result 변수에 있던 값 + Math.pow(어떤 학생 - 학생들의 평균), 제곱))
            }
            return result / scores.length; // 제곱된 값들의 평균의 반환
        }





}
