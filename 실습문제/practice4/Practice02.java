package me.day06.practice;

public class Practice02 {
    public static void main(String[] args) {
        int[] num = new int[100];
        int max = Integer.MIN_VALUE; // 최소값
        int min = Integer.MAX_VALUE; // 최대값

        for (int i = 0; i <num.length ; i++) {
            num[i] = (int) (Math.random() * 100 +1);
            // 1~100 사이의 정수 랜덤값 , Math.random() > double 값을 반환하니 int형으로 변환

            max = Math.max(max, num[i]); // max 변수에 최대값 저장
            min = Math.min(min, num[i]); // min 변수에 최소값 저장
            }

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }


}

