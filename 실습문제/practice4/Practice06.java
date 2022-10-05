package me.day06.practice;

public class Practice06 {
    public static void main(String[] args) {

    }

    class Solution{
        public String[] solution(int n, int[] arr1, int[] arr2){
            String[] result = new String[n];

            for (int i = 0; i < n; i++) {
                result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            }
            for (int i = 0; i < n; i++) {
                result[i] = String.format("%" + n + "s", result[i]);
                result[i] = result[i].replaceAll("1", "#");
                // 대상 문자열을 원하는 문자 값으로 변환
                // 첫번째 > 변환하고자 하는 대상
                // 두번째 > 변환할 문자 값
                result[i] = result[i].replaceAll("0", " ");
            }
            return result;
        }
    }

}
