package practice.실습문제.practice1;

import java.util.Scanner;

public class Practice02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

//        char alpha;
//        String input = sc.next();
//        alpha = input.charAt(0); - 위에 식이 월래 이런뜻

        //charAt() 문자를 반환하는 함수 - 외워

        if (ch >= 'a' && ch <= 'z'){
            ch = (char)(ch - 32);
            System.out.println(ch);
        } else if(ch >= 'A' && ch <= 'Z'){

        }else {
            System.out.println("연산자가 유효하지 않습니다.");
        }

        //  이렇게 써도 되도 아스키 코드로 써도 됨

    }
}